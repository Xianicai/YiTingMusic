package com.yiting.music.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.yiting.music.R;
import com.yiting.music.base.MusicBean;
import com.yiting.music.base.view.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MusicDetailActivity extends BaseActivity {


    @BindView(R.id.image_back)
    ImageView mImageBack;
    @BindView(R.id.image_share)
    ImageView mImageShare;
    @BindView(R.id.viewpager)
    ViewPager mViewpager;
    @BindView(R.id.tv_play_time)
    TextView mTvPlayTime;
    @BindView(R.id.seekbar)
    SeekBar mSeekbar;
    @BindView(R.id.tv_music_time)
    TextView mTvMusicTime;
    @BindView(R.id.image_loop_mode)
    ImageView mImageLoopMode;
    @BindView(R.id.image_music_pageup)
    ImageView mImageMusicPageup;
    @BindView(R.id.image_music_play)
    ImageView mImageMusicPlay;
    @BindView(R.id.image_music_next)
    ImageView mImageMusicNext;
    @BindView(R.id.image_music_list)
    ImageView mImageMusicList;
    private MusicBean mMusicBean;

    @Override
    public int getlayoutId() {
        return R.layout.activity_music_detail;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        mMusicBean = (MusicBean) getIntent().getSerializableExtra("MusicBean");
        long musicTime = mMusicBean.getDuration() / 1000;
        mTvMusicTime.setText(musicTime / 60 + ":" + musicTime % 60);
    }

    public static final void start(Context context, MusicBean musicBean) {
        context.startActivity(new Intent(context, MusicDetailActivity.class)
                .putExtra("MusicBean", musicBean));
    }


    @OnClick({R.id.image_loop_mode, R.id.image_music_pageup, R.id.image_music_play, R.id.image_music_next, R.id.image_music_list})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.image_loop_mode:
                break;
            case R.id.image_music_pageup:
                break;
            case R.id.image_music_play:
                break;
            case R.id.image_music_next:
                break;
            case R.id.image_music_list:
                break;
            default:
                break;
        }
    }
}
