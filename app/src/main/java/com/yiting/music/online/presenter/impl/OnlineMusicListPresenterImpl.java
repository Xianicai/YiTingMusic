package com.yiting.music.online.presenter.impl;

import com.yiting.music.base.presenter.BasePresenterImpl;
import com.yiting.music.online.model.bean.OnlineMusicBean;
import com.yiting.music.online.model.bean.TypeListBean;
import com.yiting.music.online.model.impl.OnlineMusicProviderImpl;
import com.yiting.music.online.presenter.OnlineMusicListPresenter;
import com.yiting.music.online.view.OnlineMusicListView;
import com.yiting.music.utils.retrofit.RespondObserver;
import com.yiting.music.utils.retrofit.ThreadTransformer;

/**
 * Date: 2018/4/18.
 * Author: Zhanglibin
 */

public class OnlineMusicListPresenterImpl extends BasePresenterImpl<OnlineMusicListView> implements OnlineMusicListPresenter {

    private final OnlineMusicProviderImpl mProvider;

    public OnlineMusicListPresenterImpl() {
        mProvider = new OnlineMusicProviderImpl();
    }

    @Override
    public void getOnlineList(String type, int size, int offset) {
        mProvider.getOnlineList(type, size, offset)
                .compose(new ThreadTransformer<TypeListBean>())
                .subscribe(new RespondObserver<TypeListBean>() {
                    @Override
                    public void onSuccess(TypeListBean result) {
                        super.onSuccess(result);
                        getView().getOnlineList(result);
                    }
                });
    }

    @Override
    public void getOnlineMusic(String songid) {
        mProvider.getOnlineMusic(songid)
                .compose(new ThreadTransformer<OnlineMusicBean>())
                .subscribe(new RespondObserver<OnlineMusicBean>(){
                    @Override
                    public void onSuccess(OnlineMusicBean result) {
                        super.onSuccess(result);
                        getView().getMusicLink(result);
                    }
                });
    }
}
