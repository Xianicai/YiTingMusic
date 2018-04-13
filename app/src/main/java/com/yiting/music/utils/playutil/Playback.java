package com.yiting.music.utils.playutil;

import com.yiting.music.base.MusicBean;
import com.yiting.music.utils.EventCallback;

/**
 * Date: 2018/4/4.
 * Author: Zhanglibin
 */

public interface Playback {
    /**
     * 开始播放
     */
    void start(MusicBean music);

    /**
     * 停止播放
     */
    void stop();

    /**
     * 设置播放状态
     */
    void setState(int state);

    /**
     * 获取播放状态
     */
    int getState();

    /**
     * 是否连接
     */
    boolean isConnected();

    /**
     * 是否播放
     */
    boolean isPlaying();

    /**
     * 获取当前播放位置
     */
    long getCurrentStreamPosition();

    /**
     * 设置当前播放位置
     */
    void setCurrentStreamPosition(int pos);

    /**
     * 更新最后播放歌曲的位置
     */
    void updateLastKnownStreamPosition();

    /**
     * 播放
     */
    void play(MusicBean music);

    /**
     * 暂停
     */
    void pause();

    /**
     * 继续播放
     */
    void resume();

    /**
     * 位移
     */
    void seekTo(long position);

    /**
     * 位移
     */
    void getProgress(EventCallback<Integer> callback);


    /**
     * 设置当前歌曲的ID
     */
    void setCurrentMediaId(String mediaId);

    /**
     * 获取当前歌曲的ID
     */
    String getCurrentMediaId();

    /**
     * 设置回调
     */
    void setCallback(Callback callback);

    /**
     * 初始化流是否完成
     */
    void onPrepared(EventCallback callback);

    interface Callback {

        /**
         * 完成时调用
         */
        void onCompletion();

        /**
         * 播放状态改变时调用
         */
        void onPlaybackStatusChanged(int state);

        /**
         * 错误发生时调用
         */
        void onError(String error);

        /**
         * 设置当前歌曲ID
         */
        void setCurrentMediaId(String mediaId);

    }
}
