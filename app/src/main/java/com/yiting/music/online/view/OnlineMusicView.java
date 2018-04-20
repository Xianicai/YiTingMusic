package com.yiting.music.online.view;

import com.yiting.music.base.view.BaseView;
import com.yiting.music.online.model.bean.TypeListBean;

/**
 * Date: 2018/4/18.
 * Author: Zhanglibin
 */

public interface OnlineMusicView extends BaseView {
   void getOnlineList(TypeListBean result);
}
