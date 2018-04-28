package com.yiting.music.online.model.impl;

import com.yiting.music.online.model.OnlineMusicProvider;
import com.yiting.music.online.model.bean.OnlineMusicBean;
import com.yiting.music.online.model.bean.TypeListBean;
import com.yiting.music.online.model.service.OnlineService;
import com.yiting.music.utils.retrofit.Requester;

import io.reactivex.Observable;

/**
 * Date: 2018/4/17.
 * Author: Zhanglibin
 */

public class OnlineMusicProviderImpl implements OnlineMusicProvider {
    private final OnlineService mOnlineService;

    public OnlineMusicProviderImpl() {
        mOnlineService = Requester.get().create(OnlineService.class);
    }


    @Override
    public Observable<TypeListBean> getOnlineList(String type, int size, int offset) {
        return mOnlineService.getOnlineList(type, size, offset);
    }

    @Override
    public Observable<OnlineMusicBean> getOnlineMusic(String songid) {
        return mOnlineService.getOnlineMusic(songid);
    }
}
