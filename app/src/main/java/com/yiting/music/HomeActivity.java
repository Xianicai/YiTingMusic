package com.yiting.music;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.yiting.music.base.view.BaseActivity;
import com.yiting.music.local.view.LocalMusicFragment;
import com.yiting.music.online.OnlineMusicFragment;

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
    private String[] mTitles = new String[]{"本地音乐", "在线音乐"};

    @Override
    public int getlayoutId() {
        return R.layout.activity_home;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
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
    }


    @OnClick({R.id.image_menu, R.id.image_search})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.image_menu:
                break;
            case R.id.image_search:
                break;
        }
    }
}
