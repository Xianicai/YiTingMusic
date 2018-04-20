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
 */

public class ChoicenessSongAdapter extends CommonRecyclerAdapter<TypeListBean.SongListBean> {
    private List<TypeListBean.SongListBean> data;

    public ChoicenessSongAdapter(Context context, List<TypeListBean.SongListBean> data) {
        super(context, data, R.layout.choiceness_song_item);
        this.data = data;
    }

    @Override
    public void convert(ViewHolder holder, TypeListBean.SongListBean item) {
        holder.setImage(R.id.image_cover, item.getPic_huge());
        holder.setText(R.id.tv_author, item.getArtist_name());
        holder.setText(R.id.tv_name, item.getTitle());
    }

    public void changData(List<TypeListBean.SongListBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }
}
