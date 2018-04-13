package com.yiting.music.utils.playutil;

import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.annotation.Nullable;

import com.yiting.music.base.MusicBean;
import com.yiting.music.utils.EventCallback;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Date: 2018/4/9.
 * Author: Zhanglibin
 */

public class PalyerService extends Service implements MediaPlayer.OnPreparedListener {
    public static final int PLAYER_IS_PLAYING = 1;
    public static final int PLAYER_IS_PAUSE = 2;
    public static final int PLAYER_IS_STOP = 3;
    public static int playerState = PLAYER_IS_STOP;
    public List<MusicBean> mMusicBeanList = new ArrayList<>();
    private MusicBean mMusicBean = new MusicBean();
    private MediaPlayer mMediaPlayer;
    private int mDuration;
    private EventCallback<Integer> callback;
    private EventCallback prepareCallback;

    /**
     * Service中的onBind()方法是抽象方法，Service类本身就是抽象类，所以onBind()方法是必须重写的，即使我们用不到。
     */
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        //通过binder实现调用者client与Service之间的通信
        return new MusicBinder(this);
    }

    /**
     * onCreate()只会在第一次创建service时候调用，多次执行startService()不会重复调用onCreate()，
     * 此方法适合完成一些初始化工作。
     */
    @Override
    public void onCreate() {
        super.onCreate();
        mMediaPlayer = new MediaPlayer();
        mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mMediaPlayer.setOnPreparedListener(this);
    }

    /**
     * 如果多次执行了Context的startService()方法，那么Service的onStartCommand()方法也会相应的多次调用。
     * onStartCommand()方法很重要，我们在该方法中根据传入的Intent参数进行实际的操作，
     * 比如会在此处创建一个线程用于下载数据或播放音乐等。
     */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        play(mMusicBean);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        if (mMediaPlayer != null && mMediaPlayer.isPlaying()) {
            mMediaPlayer.stop();
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
        super.onDestroy();
    }


    /**
     * 开始播放音乐
     *
     * @param music 播放歌曲
     */
    public void play(final MusicBean music) {
        try {
//            mMediaPlayer.reset();
            mMediaPlayer.setDataSource(music.getPath());
            mMediaPlayer.prepareAsync();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 暂停播放音乐
     */
    public void pause() {
        mMediaPlayer.pause();
        playerState = PLAYER_IS_PAUSE;
    }

    /**
     * 继续播放音乐
     */
    public void resume() {
        mMediaPlayer.start();
        playerState = PLAYER_IS_PLAYING;
    }

    /**
     * 停止播放音乐
     */
    public void stop() {
        pause();
        mMediaPlayer.reset();
        playerState = PLAYER_IS_STOP;
    }

    /**
     * 获取播放器状态
     */
    public int getplayerState() {
        return playerState;
    }

    public static final int MSG_START = 0;
    public static final int MSG_STOP =1;
    /**
     * 获取播放进度
     */
    Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case MSG_START:
                    callback.onEvent( mMediaPlayer.getCurrentPosition()/1000);
                    sendMessageDelayed(mHandler.obtainMessage(MSG_START),1000);
                    break;
                case MSG_STOP:

                    break;
            }
        }
    };
    public void getCurrentPosition(final EventCallback<Integer> callback) {
        this.callback = callback;
        startTiming();
    }
    /**
     * 开始获取进度
     * */
    public void stopTiming(){
        mHandler.sendMessage(mHandler.obtainMessage(MSG_STOP));
    }
    /**
     * 停止获取进度
     * */
    public void startTiming(){
        mHandler.removeMessages(MSG_START);
        mHandler.sendMessage(mHandler.obtainMessage(MSG_START));
    }

    /**
     * 获取音频总长度
     */
    public int getDuration() {
        return mDuration;
    }


    /**
     * 获取初始化完成的 MediaPlayer
     */
    public void getPrepared(EventCallback callback) {
        prepareCallback = callback;
    }
    @Override
    public void onPrepared(MediaPlayer mediaPlayer) {
        prepareCallback.onEvent(mediaPlayer);
        mDuration =  (mediaPlayer.getDuration())/1000;
         mMediaPlayer.start();
        playerState = PLAYER_IS_PLAYING;
    }


}
