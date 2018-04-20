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

public class SpeciaItemAdapter extends CommonRecyclerAdapter<TypeListBean.SongListBean> {
    private List<TypeListBean.SongListBean> data;
    private Context context;

    public SpeciaItemAdapter(Context context, List<TypeListBean.SongListBean> data) {
        super(context, data, R.layout.special_item);
        this.data = data;
        this.context = context;

    }

    @Override
    public void convert(ViewHolder holder, TypeListBean.SongListBean item) {
        holder.setText(R.id.tv_name, holder.getAdapterPosition() + " " + item.getTitle());
        holder.setText(R.id.tv_author, item.getArtist_name());

    }


}
