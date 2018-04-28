package com.yiting.music.online.presenter;

/**
 * Date: 2018/4/18.
 * Author: Zhanglibin
 */

public interface OnlineMusicListPresenter {
    void getOnlineList(String type, int size, int offset);
    void getOnlineMusic(String songid);

}
