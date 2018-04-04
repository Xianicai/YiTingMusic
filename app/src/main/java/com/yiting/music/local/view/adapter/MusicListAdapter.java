package com.yiting.music.local.view.adapter;

import android.content.Context;

import com.yiting.music.R;
import com.yiting.music.base.MusicBean;
import com.yiting.music.utils.adapter.CommonRecyclerAdapter;
import com.yiting.music.utils.adapter.ViewHolder;

import java.util.List;

/**
 * Date: 2018/4/3.
 * Author: Zhanglibin
 */

public class MusicListAdapter extends CommonRecyclerAdapter<MusicBean> {
    public MusicListAdapter(Context context, List<MusicBean> data) {
        super(context, data, R.layout.music_list_item);
    }

    @Override
    public void convert(ViewHolder holder, MusicBean item) {
        holder.setText(R.id.tv_name,item.getTitle());
        holder.setText(R.id.tv_author,item.getAuthor());
        holder.setImage(R.id.image_cover,item.getCoverPath());
    }
}
