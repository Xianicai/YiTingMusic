package com.yiting.music.online.presenter.impl;

import com.yiting.music.base.presenter.BasePresenterImpl;
import com.yiting.music.online.model.bean.TypeListBean;
import com.yiting.music.online.model.impl.OnlineMusicProviderImpl;
import com.yiting.music.online.presenter.OnlineMusicPresenter;
import com.yiting.music.online.view.OnlineMusicView;
import com.yiting.music.utils.retrofit.RespondObserver;
import com.yiting.music.utils.retrofit.ThreadTransformer;

/**
 * Date: 2018/4/18.
 * Author: Zhanglibin
 */

public class OnlineMusicPresenterImpl extends BasePresenterImpl<OnlineMusicView> implements OnlineMusicPresenter {

    private final OnlineMusicProviderImpl mProvider;

    public OnlineMusicPresenterImpl() {
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
}
