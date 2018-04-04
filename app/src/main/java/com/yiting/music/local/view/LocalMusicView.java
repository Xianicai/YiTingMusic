package com.yiting.music.local.view;

import com.yiting.music.base.MusicBean;
import com.yiting.music.base.view.BaseView;

import java.util.List;

/**
 * Date: 2018/4/4.
 * Author: Zhanglibin
 */

public interface LocalMusicView extends BaseView {
    void getMusicData(List<MusicBean>musicBeanList);
}
