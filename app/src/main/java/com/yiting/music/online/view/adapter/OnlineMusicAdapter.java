package com.yiting.music.online.view.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.yiting.music.R;
import com.yiting.music.online.model.bean.OnlineListBean;
import com.yiting.music.online.model.bean.TypeListBean;
import com.yiting.music.online.view.OnlineMusicListActivity;
import com.yiting.music.utils.ListUtil;
import com.yiting.music.utils.adapter.CommonRecyclerAdapter;
import com.yiting.music.utils.adapter.MultiTypeSupport;
import com.yiting.music.utils.adapter.OnItemClickListener;
import com.yiting.music.utils.adapter.ViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 2018/4/17.
 * Author: Zhanglibin
 */

public class OnlineMusicAdapter extends CommonRecyclerAdapter<OnlineListBean> {

    private TextView mTvHot;
    private TextView mTvNew;

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
                        layoutId = R.layout.online_item_choiceness;
                        break;
                    case 2:
                        layoutId = R.layout.online_item_choiceness;
                        break;
                    case 3:
                        layoutId = R.layout.online_item_choiceness;
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
                holder.setText(R.id.tv_title,item.getTitle());
                recyclerView.setLayoutManager(new GridLayoutManager(mContext, 3));
                final List<TypeListBean.SongListBean> listBeans = new ArrayList<>();
                final ChoicenessSongAdapter choicenessSongAdapter = new ChoicenessSongAdapter(mContext, listBeans);
                recyclerView.setAdapter(choicenessSongAdapter);
                if (ListUtil.isNotEmpty(item.getTypeListBeans()) && ListUtil.isNotEmpty(item.getTypeListBeans().get(0).getSong_list())) {
                    listBeans.addAll(item.getTypeListBeans().get(0).getSong_list());
                    choicenessSongAdapter.notifyDataSetChanged();
                }
                mTvHot = holder.getView(R.id.tv_hot);
                mTvHot.setVisibility(View.VISIBLE);
                mTvNew = holder.getView(R.id.tv_new);
                mTvNew.setVisibility(View.VISIBLE);
                holder.setViewVisibility(R.id.view, View.VISIBLE);
                setTypeTextColor(mTvHot);
                mTvHot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setTypeTextColor(mTvHot);
                        listBeans.clear();
                        listBeans.addAll(item.getTypeListBeans().get(0).getSong_list());
                        choicenessSongAdapter.notifyDataSetChanged();
                    }
                });
                mTvNew.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setTypeTextColor(mTvNew);
                        listBeans.clear();
                        listBeans.addAll(item.getTypeListBeans().get(1).getSong_list());
                        choicenessSongAdapter.notifyDataSetChanged();
                    }
                });
                choicenessSongAdapter.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(int position) {
                        OnlineMusicListActivity.start(mContext,item.getTypeListBeans().get(0).getBillboard().getBillboard_type());
                    }
                });
                break;
            case 1:
                RecyclerView recommendRec = holder.getView(R.id.recyclerview);
                holder.setText(R.id.tv_title,item.getTitle());
                recommendRec.setLayoutManager(new GridLayoutManager(mContext, 3));
                final List<TypeListBean> recommendListBeans = new ArrayList<>();
                final RecommendSongAdapter recommendSongAdapter = new RecommendSongAdapter(mContext, recommendListBeans);
                recommendRec.setAdapter(recommendSongAdapter);
                if (ListUtil.isNotEmpty(item.getTypeListBeans()) && ListUtil.isNotEmpty(item.getTypeListBeans())) {
                    recommendListBeans.addAll(item.getTypeListBeans());
                    recommendSongAdapter.notifyDataSetChanged();
                }
                recommendSongAdapter.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(int position) {
                        OnlineMusicListActivity.start(mContext,item.getTypeListBeans().get(position).getBillboard().getBillboard_type());
                    }
                });
                break;
            case 2:
                RecyclerView SpeciaRecycler = holder.getView(R.id.recyclerview);
                holder.setText(R.id.tv_title,item.getTitle());
                SpeciaRecycler.setLayoutManager(new LinearLayoutManager(mContext));
                final List<TypeListBean> SpeciaListBeans = new ArrayList<>();
                final SpecialSongAdapter specialSongAdapter = new SpecialSongAdapter(mContext, SpeciaListBeans);
                SpeciaRecycler.setAdapter(specialSongAdapter);
                if (ListUtil.isNotEmpty(item.getTypeListBeans()) && ListUtil.isNotEmpty(item.getTypeListBeans())) {
                    SpeciaListBeans.addAll(item.getTypeListBeans());
                    specialSongAdapter.notifyDataSetChanged();
                }
                specialSongAdapter.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(int position) {
                        OnlineMusicListActivity.start(mContext,item.getTypeListBeans().get(position).getBillboard().getBillboard_type());
                    }
                });
                break;
            case 3:
                RecyclerView exclusiveRec = holder.getView(R.id.recyclerview);
                holder.setText(R.id.tv_title,item.getTitle());
                exclusiveRec.setLayoutManager(new GridLayoutManager(mContext, 2));
                final List<TypeListBean> exclusiveListBeans = new ArrayList<>();
                final ExclusiveSongAdapter exclusiveSongAdapter = new ExclusiveSongAdapter(mContext, exclusiveListBeans);
                exclusiveRec.setAdapter(exclusiveSongAdapter);
                if (ListUtil.isNotEmpty(item.getTypeListBeans()) && ListUtil.isNotEmpty(item.getTypeListBeans())) {
                    exclusiveListBeans.addAll(item.getTypeListBeans());
                    exclusiveSongAdapter.notifyDataSetChanged();
                }
                exclusiveSongAdapter.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(int position) {
                        OnlineMusicListActivity.start(mContext,item.getTypeListBeans().get(position).getBillboard().getBillboard_type());
                    }
                });
                break;
            default:
                break;
        }

    }
    private void setTypeTextColor(TextView textView) {
        mTvHot.setTextColor(mContext.getResources().getColor(R.color.gray));
        mTvNew.setTextColor(mContext.getResources().getColor(R.color.gray));
        textView.setTextColor(mContext.getResources().getColor(R.color.theme_color));
    }

}
