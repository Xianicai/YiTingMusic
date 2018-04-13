package com.yiting.music.home;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.yiting.music.R;
import com.yiting.music.base.Constant;
import com.yiting.music.base.MusicBean;
import com.yiting.music.base.view.BaseActivity;
import com.yiting.music.local.model.impl.LocalMusicProviderImpl;
import com.yiting.music.local.view.LocalMusicFragment;
import com.yiting.music.online.OnlineMusicFragment;
import com.yiting.music.utils.EventCallback;
import com.yiting.music.utils.ListUtil;
import com.yiting.music.utils.MusicUtil;
import com.yiting.music.utils.glide.GlideImageView;
import com.yiting.music.utils.playutil.MusicBinder;
import com.yiting.music.utils.playutil.PalyerService;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class HomeActivity extends BaseActivity {


    @BindView(R.id.image_menu)
    ImageView mImageMenu;
    @BindView(R.id.tablayout)
    TabLayout mTablayout;
    @BindView(R.id.image_search)
    ImageView mImageSearch;
    @BindView(R.id.viewpager)
    ViewPager mViewpager;
    @BindView(R.id.image_cover)
    GlideImageView mImageCover;
    @BindView(R.id.tv_name)
    TextView mTvName;
    @BindView(R.id.tv_author)
    TextView mTvAuthor;
    @BindView(R.id.image_play)
    ImageView mImagePlay;
    @BindView(R.id.image_next)
    ImageView mImageNext;
    @BindView(R.id.seekbar)
    SeekBar mSeekbar;
    private boolean isBind = false;
    private List<MusicBean> mMusicBeanList = new ArrayList<>();
    private int mMusicIndex = 0;
    private MusicBean mMusicBean;

    private ServiceConnection mConnection = new ServiceConnection() {

        @Override
        public void onServiceConnected(ComponentName name, IBinder binder) {
            isBind = true;
            mMusicBinder = (MusicBinder) binder;
            mMusicBinder.getProgress(new EventCallback<Integer>() {
                @Override
                public void onEvent(Integer integer) {
                    mSeekbar.setProgress(integer);
                }
            });
            mMusicBinder.onPrepared(new EventCallback() {
                @Override
                public void onEvent(Object o) {
                    MediaPlayer mediaPlayer = (MediaPlayer) o;
                    mSeekbar.setMax(mediaPlayer.getDuration() / 1000);
                }
            });
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBind = false;
        }
    };
    private String[] mTitles = new String[]{"本地音乐", "在线音乐"};
    private MusicBinder mMusicBinder;

    @Override
    public int getlayoutId() {
        return R.layout.activity_home;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        //绑定service
        Intent intent = new Intent(this, PalyerService.class);
        bindService(intent, mConnection, Context.BIND_AUTO_CREATE);
        //给TabLayout添加标签
        for (int i = 0; i < mTitles.length; i++) {
            mTablayout.addTab(mTablayout.newTab().setText(mTitles[i]));
        }
        FragmentPagerAdapter fragmentPagerAdapter =
                new FragmentPagerAdapter(getSupportFragmentManager()) {
                    @Override
                    public Fragment getItem(int position) {
                        Fragment fragment = null;
                        switch (position) {
                            case 0:
                                fragment = new LocalMusicFragment();
                                break;
                            case 1:
                                fragment = new OnlineMusicFragment();
                                break;
                            default:
                                break;
                        }

                        return fragment;
                    }

                    @Override
                    public int getCount() {
                        return mTitles.length;
                    }

                    @Override
                    public CharSequence getPageTitle(int position) {
                        return mTitles[position];
                    }

                };
        mViewpager.setAdapter(fragmentPagerAdapter);
        //将TabLayout与ViewPager绑定在一起
        mTablayout.setupWithViewPager(mViewpager);
        mViewpager.setCurrentItem(0);
        //查询本地音乐数据
        mMusicBeanList.addAll(getData());
        //将第一个数据初始化
        if (ListUtil.isNotEmpty(mMusicBeanList)) {
            mMusicBean = mMusicBeanList.get(0);
//            changView();
        }
        addEvent();
    }

    private void addEvent() {
        Reciver mReciver = new Reciver();
        registerReceiver(mReciver, new IntentFilter(Constant.RXBUS_PALY_MUSIC));
    }

    private List<MusicBean> getData() {
        return new LocalMusicProviderImpl().getMusicData(this);
    }


    @OnClick({R.id.image_menu, R.id.image_search, R.id.image_cover, R.id.image_play, R.id.image_next})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.image_menu:
                break;
            case R.id.image_search:
                break;
            case R.id.image_cover:
                break;
            case R.id.image_play:
                playMusic(mMusicBean);
                break;
            case R.id.image_next:
                playNext();
                break;
            default:
                break;
        }
    }

    private void playMusic(MusicBean musicBean) {

        switch (mMusicBinder.getState()) {
            case PalyerService.PLAYER_IS_STOP:
                mMusicBinder.play(musicBean);
                changView(musicBean);
                mImagePlay.setImageResource(R.mipmap.ic_play_bar_btn_pause);
                break;
            case PalyerService.PLAYER_IS_PLAYING:
                mMusicBinder.pause();
                mImagePlay.setImageResource(R.mipmap.ic_play_bar_btn_play);
                break;
            case PalyerService.PLAYER_IS_PAUSE:
                mMusicBinder.resume();
                mImagePlay.setImageResource(R.mipmap.ic_play_bar_btn_pause);
                break;
            default:
                break;
        }
    }

    /**
     * 下一曲
     */
    private void playNext() {
        mMusicBeanList = MusicUtil.getMusicData(this);
        if ((mMusicBeanList.size() - 1) == mMusicIndex) {
            mMusicIndex = 0;
        } else {
            mMusicIndex++;
        }
        if (ListUtil.isNotEmpty(mMusicBeanList)) {
            mMusicBean = mMusicBeanList.get(mMusicIndex);
            mMusicBinder.play(mMusicBean);
            changView(mMusicBean);
        }
    }

    private void changView(MusicBean musicBean) {
        mTvAuthor.setText(musicBean.getAuthor());
        mTvName.setText(musicBean.getTitle());
        mImageCover.setImage(musicBean.getCoverPath());
        mImagePlay.setImageResource(R.mipmap.ic_play_bar_btn_pause);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbindService(mConnection);
    }

    class Reciver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (Constant.RXBUS_PALY_MUSIC.equals(intent.getAction())) {
                MusicBean musicBean = (MusicBean) intent.getSerializableExtra("MusicBean");
                mMusicBinder.stop();
                mMusicBinder.play(musicBean);
                changView(musicBean);
                mImagePlay.setImageResource(R.mipmap.ic_play_bar_btn_pause);
            }
        }

    }
}
