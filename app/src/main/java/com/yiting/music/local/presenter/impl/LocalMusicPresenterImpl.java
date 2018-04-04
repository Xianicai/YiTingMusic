package com.yiting.music.local.presenter.impl;

import android.content.Context;

import com.yiting.music.base.presenter.BasePresenterImpl;
import com.yiting.music.local.model.impl.LocalMusicProviderImpl;
import com.yiting.music.local.presenter.LocalMusicPresenter;
import com.yiting.music.local.view.LocalMusicView;

/**
 * Date: 2018/4/4.
 * Author: Zhanglibin
 */

public class LocalMusicPresenterImpl extends BasePresenterImpl<LocalMusicView> implements LocalMusicPresenter {

    private final LocalMusicProviderImpl mProvider;

    public LocalMusicPresenterImpl() {
        mProvider = new LocalMusicProviderImpl();
    }

    @Override
    public void getMusicData(Context context) {
        getView().getMusicData(mProvider.getMusicData(context));
    }
}
