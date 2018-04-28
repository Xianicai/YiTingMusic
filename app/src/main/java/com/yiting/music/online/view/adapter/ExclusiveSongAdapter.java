package com.yiting.music.online.view.adapter;

import android.content.Context;

import com.yiting.music.R;
import com.yiting.music.online.model.bean.TypeListBean;
import com.yiting.music.utils.adapter.CommonRecyclerAdapter;
import com.yiting.music.utils.adapter.ViewHolder;

import java.util.List;

/**
 * Date: 2018/4/19.
 * Author: Zhanglibin
 * 推荐歌单
 */

public class ExclusiveSongAdapter extends CommonRecyclerAdapter<TypeListBean> {
    private List<TypeListBean> data;

    public ExclusiveSongAdapter(Context context, List<TypeListBean> data) {
        super(context, data, R.layout.choiceness_song_item);
        this.data = data;
    }

    @Override
    public void convert(ViewHolder holder, TypeListBean item) {
        holder.setImage(R.id.image_cover, item.getBillboard().getPic_s192());
        holder.setText(R.id.tv_name, item.getBillboard().getName());
        holder.setText(R.id.tv_author, "更新时间："+item.getBillboard().getUpdate_date());
    }

    public void changData(List<TypeListBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }
}
