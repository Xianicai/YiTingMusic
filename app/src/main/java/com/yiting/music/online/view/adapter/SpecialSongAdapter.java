package com.yiting.music.online.view.adapter;

import android.content.Context;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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

public class SpecialSongAdapter extends CommonRecyclerAdapter<TypeListBean> {
    private List<TypeListBean> data;
    private Context context;

    public SpecialSongAdapter(Context context, List<TypeListBean> data) {
        super(context, data, R.layout.special_song_item);
        this.data = data;
        this.context = context;

    }

    @Override
    public void convert(ViewHolder holder, TypeListBean item) {
        holder.setImage(R.id.image_cover, item.getBillboard().getPic_s192());
        RecyclerView recyclerview = holder.getView(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());
        SpeciaItemAdapter speciaItemAdapter = new SpeciaItemAdapter(context, item.getSong_list());
        recyclerview.setAdapter(speciaItemAdapter);
    }


}
