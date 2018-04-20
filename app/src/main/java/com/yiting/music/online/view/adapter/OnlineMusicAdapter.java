package com.yiting.music.online.view.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.yiting.music.R;
import com.yiting.music.online.model.bean.OnlineListBean;
import com.yiting.music.online.model.bean.TypeListBean;
import com.yiting.music.utils.ListUtil;
import com.yiting.music.utils.adapter.CommonRecyclerAdapter;
import com.yiting.music.utils.adapter.MultiTypeSupport;
import com.yiting.music.utils.adapter.ViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 2018/4/17.
 * Author: Zhanglibin
 */

public class OnlineMusicAdapter extends CommonRecyclerAdapter<OnlineListBean> {
    public OnlineMusicAdapter(Context context, List<OnlineListBean> data) {
        super(context, data, new MultiTypeSupport<OnlineListBean>() {
            @Override
            public int getLayoutId(OnlineListBean item, int position) {
                int layoutId = -1;
                switch (position) {
                    case 0:
                        layoutId = R.layout.online_item_choiceness;
                        break;
                    case 1:
                        layoutId = R.layout.online_item_recommend;
                        break;
                    case 2:
                        layoutId = R.layout.online_item_special;
                        break;
                    case 3:
                        layoutId = R.layout.online_item_recommend;
                        break;
                    default:
                        break;
                }
                return layoutId;
            }
        });
    }

    @Override
    public void convert(ViewHolder holder, final OnlineListBean item) {
        final int position = holder.getAdapterPosition();
        switch (position) {
            case 0:
                RecyclerView recyclerView = holder.getView(R.id.recyclerview);
                recyclerView.setLayoutManager(new GridLayoutManager(mContext, 3));
                final List<TypeListBean.SongListBean> listBeans = new ArrayList<>();
                final ChoicenessSongAdapter choicenessSongAdapter = new ChoicenessSongAdapter(mContext, listBeans);
                recyclerView.setAdapter(choicenessSongAdapter);
                if (ListUtil.isNotEmpty(item.getTypeListBeans()) && ListUtil.isNotEmpty(item.getTypeListBeans().get(0).getSong_list())) {
                    listBeans.addAll(item.getTypeListBeans().get(0).getSong_list());
                    choicenessSongAdapter.notifyDataSetChanged();
                }
                TextView tvHot = holder.getView(R.id.tv_hot);
                TextView tvNew = holder.getView(R.id.tv_new);
                tvHot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        listBeans.clear();
                        listBeans.addAll(item.getTypeListBeans().get(0).getSong_list());
                        choicenessSongAdapter.notifyDataSetChanged();
                    }
                });
                tvNew.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        listBeans.clear();
                        listBeans.addAll(item.getTypeListBeans().get(1).getSong_list());
                        choicenessSongAdapter.notifyDataSetChanged();
                    }
                });
                break;
            case 1:
                RecyclerView recommendRec = holder.getView(R.id.recyclerview);
                recommendRec.setLayoutManager(new GridLayoutManager(mContext, 3));
                final List<TypeListBean> recommendListBeans = new ArrayList<>();
                final RecommendSongAdapter recommendSongAdapter = new RecommendSongAdapter(mContext, recommendListBeans);
                recommendRec.setAdapter(recommendSongAdapter);
                if (ListUtil.isNotEmpty(item.getTypeListBeans()) && ListUtil.isNotEmpty(item.getTypeListBeans())) {
                    recommendListBeans.addAll(item.getTypeListBeans());
                    recommendSongAdapter.notifyDataSetChanged();
                }
                break;
            case 2:
                RecyclerView SpeciaRecycler = holder.getView(R.id.recyclerview);
                SpeciaRecycler.setLayoutManager(new GridLayoutManager(mContext, 3));
                final List<TypeListBean> SpeciaListBeans = new ArrayList<>();
                final SpecialSongAdapter SpeciaSongAdapter = new SpecialSongAdapter(mContext, SpeciaListBeans);
                SpeciaRecycler.setAdapter(SpeciaSongAdapter);
                if (ListUtil.isNotEmpty(item.getTypeListBeans()) && ListUtil.isNotEmpty(item.getTypeListBeans())) {
                    SpeciaListBeans.addAll(item.getTypeListBeans());
                    SpeciaSongAdapter.notifyDataSetChanged();
                }
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }

    }
}
