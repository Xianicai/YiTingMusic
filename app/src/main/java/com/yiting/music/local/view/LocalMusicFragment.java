package com.yiting.music.local.view;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yiting.music.R;
import com.yiting.music.base.MusicBean;
import com.yiting.music.base.view.BaseFragment;
import com.yiting.music.local.presenter.impl.LocalMusicPresenterImpl;
import com.yiting.music.local.view.adapter.MusicListAdapter;
import com.yiting.music.utils.adapter.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Date: 2018/4/3.
 * Author: Zhanglibin
 */

public class LocalMusicFragment extends BaseFragment implements LocalMusicView {
    @BindView(R.id.recyclerview)
    RecyclerView mRecyclerview;
    private List<MusicBean> mMusicBeanList;
    private MusicListAdapter mMusicListAdapter;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_local_music;
    }

    @Override
    protected void initView(View view) {
        LocalMusicPresenterImpl presenter = new LocalMusicPresenterImpl();
        presenter.bindView(this);
        mMusicBeanList = new ArrayList<>();
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerview.setLayoutManager(layoutManager);
        mRecyclerview.setItemAnimator(new DefaultItemAnimator());
        mMusicListAdapter = new MusicListAdapter(getActivity(), mMusicBeanList);
        mRecyclerview.setAdapter(mMusicListAdapter);
        presenter.getMusicData(getActivity());
        mMusicListAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {

            }
        });
    }

    @Override
    public void getMusicData(List<MusicBean> musicBeanList) {
        mMusicBeanList.clear();
        mMusicBeanList.addAll(musicBeanList);
        mMusicListAdapter.notifyDataSetChanged();
    }

}
