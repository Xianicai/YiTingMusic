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
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
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
import com.yiting.music.online.view.OnlineMusicFragment;
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

public class HomeActivity extends BaseActivity
        implements NavigationView.OnNavigationItemSelectedListener {

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
    @BindView(R.id.nav_view)
    NavigationView mNavView;
    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    private List<MusicBean> mMusicBeanList = new ArrayList<>();
    private int mMusicIndex = 0;
    private MusicBean mMusicBean;
    private boolean isBind = false;

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
        return R.layout.activity_new_home;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        mNavView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawerLayout, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();

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
            changView(mMusicBean);
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


    @OnClick({R.id.image_search, R.id.image_cover, R.id.image_play, R.id.image_next})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.image_search:
                break;
            case R.id.image_cover:
                MusicDetailActivity.start(this,mMusicBean);
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
                mMusicBean.setDuration(mMusicBinder.getCurrentStreamPosition());
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
            mMusicBinder.stop();
            mMusicBinder.play(mMusicBean);
            mMusicBean.setDuration(mMusicBinder.getCurrentStreamPosition());
            changView(mMusicBean);
            mImagePlay.setImageResource(R.mipmap.ic_play_bar_btn_pause);
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
                mMusicBean = (MusicBean) intent.getSerializableExtra("MusicBean");
                mMusicBinder.stop();
                mMusicBinder.play(mMusicBean);
                mMusicBean.setDuration(mMusicBinder.getCurrentStreamPosition());
                changView(mMusicBean);
                mImagePlay.setImageResource(R.mipmap.ic_play_bar_btn_pause);
            }
        }

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.new_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
