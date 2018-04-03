package com.yiting.music.local.view.adapter;

import android.content.Context;

import com.yiting.music.base.MusicBean;
import com.yiting.music.utils.adapter.CommonRecyclerAdapter;
import com.yiting.music.utils.adapter.ViewHolder;

import java.util.List;

/**
 * Date: 2018/4/3.
 * Author: Zhanglibin
 */

public class MusicListAdapter extends CommonRecyclerAdapter<MusicBean> {
    public MusicListAdapter(Context context, List<MusicBean> data, int layoutId) {
        super(context, data, layoutId);
    }

    @Override
    public void convert(ViewHolder holder, MusicBean item) {

    }
}
