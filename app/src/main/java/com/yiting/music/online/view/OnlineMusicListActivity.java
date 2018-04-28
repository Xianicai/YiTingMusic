package com.yiting.music.online.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.yiting.music.R;
import com.yiting.music.base.Constant;
import com.yiting.music.base.MusicBean;
import com.yiting.music.base.view.BaseActivity;
import com.yiting.music.online.model.bean.OnlineMusicBean;
import com.yiting.music.online.model.bean.TypeListBean;
import com.yiting.music.online.presenter.impl.OnlineMusicListPresenterImpl;
import com.yiting.music.online.view.adapter.OnlineMusicListAdapter;
import com.yiting.music.utils.adapter.OnItemClickListener;
import com.yiting.music.utils.glide.GlideImageView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class OnlineMusicListActivity extends BaseActivity implements OnlineMusicListView {


    @BindView(R.id.image_cover)
    GlideImageView mImageCover;
    @BindView(R.id.tv_title)
    TextView mTvTitle;
    @BindView(R.id.tv_time)
    TextView mTvTime;
    @BindView(R.id.tv_content)
    TextView mTvContent;
    @BindView(R.id.recyclerview)
    RecyclerView mRecyclerview;
    private List<TypeListBean.SongListBean> mSongListBeans;
    private OnlineMusicListAdapter mAdapter;

    @Override
    public int getlayoutId() {
        return R.layout.activity_online_music_list;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        String billboardType = getIntent().getStringExtra("billboardType");
        final OnlineMusicListPresenterImpl presenter = new OnlineMusicListPresenterImpl();
        presenter.bindView(this);
        presenter.getOnlineList(billboardType, 15, 0);
        mRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        mSongListBeans = new ArrayList<>();
        mAdapter = new OnlineMusicListAdapter(this, mSongListBeans);
        mRecyclerview.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                presenter.getOnlineMusic(mSongListBeans.get(position).getSong_id());
            }
        });
    }

    @Override
    public void getOnlineList(TypeListBean result) {
        mImageCover.setImage(result.getBillboard().getPic_s640());
        mTvTitle.setText(result.getBillboard().getName());
        mTvTime.setText(result.getBillboard().getUpdate_date());
        mTvContent.setText(result.getBillboard().getComment());
        mSongListBeans.addAll(result.getSong_list());
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void getMusicLink(OnlineMusicBean onlineMusicBean) {
        MusicBean musicBean = new MusicBean();
        musicBean.setAuthor(onlineMusicBean.getSonginfo().getAuthor());
        musicBean.setCoverPath(onlineMusicBean.getSonginfo().getPic_small());
        musicBean.setTitle(onlineMusicBean.getSonginfo().getTitle());
        musicBean.setPath(onlineMusicBean.getBitrate().getFile_link());

        Intent broadcastIntent = new Intent();
        broadcastIntent.setAction(Constant.RXBUS_PALY_MUSIC);
        broadcastIntent.putExtra("MusicBean", musicBean);
        sendBroadcast(broadcastIntent);
    }

    public static final void start(Context context, String billboardType) {
        context.startActivity(new Intent(context, OnlineMusicListActivity.class)
                .putExtra("billboardType", billboardType));
    }
}
