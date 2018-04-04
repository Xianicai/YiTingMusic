package com.yiting.music.local.model;

import android.content.Context;

import com.yiting.music.base.MusicBean;

import java.util.List;

/**
 * Date: 2018/4/4.
 * Author: Zhanglibin
 */

public interface LocalMusicProvider {
    List<MusicBean> getMusicData(Context context);
}
