package com.yiting.music.online.view;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yiting.music.R;
import com.yiting.music.base.view.BaseFragment;
import com.yiting.music.online.constant.Constant;
import com.yiting.music.online.model.bean.OnlineListBean;
import com.yiting.music.online.model.bean.TypeListBean;
import com.yiting.music.online.presenter.impl.OnlineMusicPresenterImpl;
import com.yiting.music.online.view.adapter.OnlineMusicAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Date: 2018/4/3.
 * Author: Zhanglibin
 */

public class OnlineMusicFragment extends BaseFragment implements OnlineMusicView {
    @BindView(R.id.recyclerview)
    RecyclerView mRecyclerview;
    private OnlineMusicAdapter mMusicListAdapter;
    private List<OnlineListBean> mOnlineListBeans = new ArrayList<>(4);
    private OnlineMusicPresenterImpl mPresenter;
    private String[] mTitles = new String[]{"精选歌曲", "推荐歌单", "精选专栏", "独家内容"};

    @Override
    public int getLayoutId() {
        return R.layout.fragment_online_music;
    }

    @Override
    protected void initView(View view) {
        mPresenter = new OnlineMusicPresenterImpl();
        mPresenter.bindView(this);
        for (int i = 0; i < mTitles.length; i++) {
            OnlineListBean onlineListBean = new OnlineListBean();
            onlineListBean.setTitle(mTitles[i]);
            List<TypeListBean> mTypeListBeans = null;
            switch (i) {
                case 0:
                    mTypeListBeans = new ArrayList<>(2);
                    break;
                case 1:
                    mTypeListBeans = new ArrayList<>(3);
                    break;
                case 2:
                    mTypeListBeans = new ArrayList<>(3);
                    break;
                case 3:
                    mTypeListBeans = new ArrayList<>(4);
                    break;
                default:
                    break;
            }
            onlineListBean.setTypeListBeans(mTypeListBeans);
            mOnlineListBeans.add(onlineListBean);
        }
        //最新
        mPresenter.getOnlineList(Constant.NEW_SONG_RANK, 6, 0);
        //最热
        mPresenter.getOnlineList(Constant.HOT_SONG_RANK, 6, 0);
        //HITO歌榜
        mPresenter.getOnlineList(Constant.HITO_SONG_RANK, 6, 0);
        //情歌歌榜
        mPresenter.getOnlineList(Constant.LOVE_SONG_RANK, 6, 0);
        //网络歌曲榜
        mPresenter.getOnlineList(Constant.NET_SONG_RANK, 6, 0);
        //摇滚
        mPresenter.getOnlineList(Constant.ROCK_SONG_RANK, 3, 0);
        //ktv
        mPresenter.getOnlineList(Constant.KTV_SONG_RANK, 3, 0);
        //欧美
        mPresenter.getOnlineList(Constant.AMERICA_SONG_RANK, 3, 0);
        //华语
        mPresenter.getOnlineList(Constant.CHINESE_SONG_RANK, 3, 0);
        //Billboard
        mPresenter.getOnlineList(Constant.BILLBOARD_SONG_RANK, 3, 0);
        //经典老歌
        mPresenter.getOnlineList(Constant.CLASSICS_SONG_RANK, 3, 0);
        //影视金曲
        mPresenter.getOnlineList(Constant.MOVIE_SONG_RANK, 3, 0);

    }


    @Override
    public void getOnlineList(TypeListBean result) {
        if (result == null) {
            return;
        }
        switch (result.getBillboard().getBillboard_type()) {
            case Constant.NEW_SONG_RANK:
                mOnlineListBeans.get(0).getTypeListBeans().add(result);
                break;
            case Constant.HOT_SONG_RANK:
                mOnlineListBeans.get(0).getTypeListBeans().add(result);
                break;
            case Constant.HITO_SONG_RANK:
                mOnlineListBeans.get(1).getTypeListBeans().add(result);
                break;
            case Constant.LOVE_SONG_RANK:
                mOnlineListBeans.get(1).getTypeListBeans().add(result);
                break;
            case Constant.NET_SONG_RANK:
                mOnlineListBeans.get(1).getTypeListBeans().add(result);
                break;
            case Constant.ROCK_SONG_RANK:
                mOnlineListBeans.get(2).getTypeListBeans().add(result);
                break;
            case Constant.KTV_SONG_RANK:
                mOnlineListBeans.get(2).getTypeListBeans().add(result);
                break;
            case Constant.AMERICA_SONG_RANK:
                mOnlineListBeans.get(2).getTypeListBeans().add(result);
                break;
            case Constant.CHINESE_SONG_RANK:
                mOnlineListBeans.get(3).getTypeListBeans().add(result);
                break;
            case Constant.BILLBOARD_SONG_RANK:
                mOnlineListBeans.get(3).getTypeListBeans().add(result);
                break;
            case Constant.CLASSICS_SONG_RANK:
                mOnlineListBeans.get(3).getTypeListBeans().add(result);
                break;
            case Constant.MOVIE_SONG_RANK:
                mOnlineListBeans.get(3).getTypeListBeans().add(result);
                break;
            default:
                break;
        }
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerview.setLayoutManager(layoutManager);
        mRecyclerview.setItemAnimator(new DefaultItemAnimator());
        mMusicListAdapter = new OnlineMusicAdapter(getActivity(), mOnlineListBeans);
        mRecyclerview.setAdapter(mMusicListAdapter);
    }
}
