package com.yiting.music.online.model.bean;

import java.util.List;

/**
 * Date: 2018/4/19.
 * Author: Zhanglibin
 */

public class OnlineListBean {
    private String title;
    private List<TypeListBean> mTypeListBeans;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<TypeListBean> getTypeListBeans() {
        return mTypeListBeans;
    }

    public void setTypeListBeans(List<TypeListBean> typeListBeans) {
        mTypeListBeans = typeListBeans;
    }
}
