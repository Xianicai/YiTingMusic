package com.yiting.music.utils.adapter;

/**
 * Created by Zhanglibin on 2018/1/18.
 */

public interface MultiTypeSupport<T> {
    // 根据当前位置或者条目数据返回布局
    int getLayoutId(T item, int position);
}
