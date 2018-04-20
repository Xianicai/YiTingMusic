package com.yiting.music.online.model.service;


import com.yiting.music.common.Urls;
import com.yiting.music.online.model.bean.TypeListBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Zhanglibin on 2017/11/28.
 */

public interface OnlineService {
    /**
     * 直播轮播图片
     *
     * @return
     */
    @GET(Urls.GET_ONLIN_TYPE_LIST)
    Observable<TypeListBean> getOnlineList(@Query("type") int type,
                                                       @Query("size") int size,
                                                       @Query("offset") int offset);


}
