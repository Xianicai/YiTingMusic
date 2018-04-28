package com.yiting.music.online.model;

import com.yiting.music.online.model.bean.OnlineMusicBean;
import com.yiting.music.online.model.bean.TypeListBean;

import io.reactivex.Observable;

/**
 * Date: 2018/4/17.
 * Author: Zhanglibin
 */

public interface OnlineMusicProvider {
    Observable<TypeListBean> getOnlineList(String type, int size, int offset);

    Observable<OnlineMusicBean> getOnlineMusic(String songid);
}
