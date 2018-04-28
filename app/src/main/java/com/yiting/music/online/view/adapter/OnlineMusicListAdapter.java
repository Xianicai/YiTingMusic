package com.yiting.music.online.view.adapter;

import android.content.Context;

import com.yiting.music.R;
import com.yiting.music.online.model.bean.TypeListBean;
import com.yiting.music.utils.adapter.CommonRecyclerAdapter;
import com.yiting.music.utils.adapter.ViewHolder;

import java.util.List;

/**
 * Date: 2018/4/3.
 * Author: Zhanglibin
 */

public class OnlineMusicListAdapter extends CommonRecyclerAdapter<TypeListBean.SongListBean> {
    public OnlineMusicListAdapter(Context context, List<TypeListBean.SongListBean> data) {
        super(context, data, R.layout.music_list_item);
    }

    @Override
    public void convert(ViewHolder holder, TypeListBean.SongListBean item) {
        holder.setText(R.id.tv_name,item.getTitle());
        holder.setText(R.id.tv_author,item.getAuthor());
        holder.setImage(R.id.image_cover,item.getPic_small());
    }
}
