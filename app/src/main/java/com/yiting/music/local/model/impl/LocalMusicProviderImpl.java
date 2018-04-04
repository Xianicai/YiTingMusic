package com.yiting.music.local.model.impl;

import android.content.Context;

import com.yiting.music.base.MusicBean;
import com.yiting.music.local.model.LocalMusicProvider;
import com.yiting.music.utils.MusicUtil;

import java.util.List;

/**
 * Date: 2018/4/4.
 * Author: Zhanglibin
 */

public class LocalMusicProviderImpl implements LocalMusicProvider {
    @Override
    public List<MusicBean> getMusicData(Context context) {
       return MusicUtil.getMusicData(context);
    }
}
