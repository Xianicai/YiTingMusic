package com.yiting.music.utils.playutil;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.yiting.music.base.MusicBean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Date: 2018/4/9.
 * Author: Zhanglibin
 */

public class PalyerService extends Service {
    public static final int PLAYER_IS_PLAYING = 1;
    public static final int PLAYER_IS_PAUSE = 2;
    public static final int PLAYER_IS_STOP = 3;
    public static int playerState = PLAYER_IS_STOP;
    public List<MusicBean> mMusicBeanList = new ArrayList<>();
    private MusicBean mMusicBean = new MusicBean();
    private MediaPlayer mMediaPlayer;

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
    }

    /**
     * 如果多次执行了Context的startService()方法，那么Service的onStartCommand()方法也会相应的多次调用。
     * onStartCommand()方法很重要，我们在该方法中根据传入的Intent参数进行实际的操作，
     * 比如会在此处创建一个线程用于下载数据或播放音乐等。
     */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        play(mMusicBean);
        mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.getDuration();
            }
        });
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    /**
     * 开始播放音乐
     *
     * @param music 播放歌曲
     */
    public void play(MusicBean music) {
        try {
            mMediaPlayer.reset();
            mMediaPlayer.setDataSource(music.getPath());
            mMediaPlayer.prepare();
            mMediaPlayer.start();
            playerState = PLAYER_IS_PLAYING;
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


}
