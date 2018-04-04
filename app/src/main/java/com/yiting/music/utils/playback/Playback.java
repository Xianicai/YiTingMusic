package com.yiting.music.utils.playback;

import android.support.v4.media.session.MediaSessionCompat;

/**
 * Date: 2018/4/4.
 * Author: Zhanglibin
 */

public interface Playback {
    /**
     * 开始播放
     */
    void start();

    /**
     * 停止播放
     */
    void stop(boolean notifyListeners);

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
    void play(MediaSessionCompat.QueueItem item);

    /**
     * 暂停
     */
    void pause();

    /**
     * 位移
     */
    void seekTo(long position);

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
