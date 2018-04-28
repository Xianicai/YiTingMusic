package com.yiting.music.online.model.service;


import com.yiting.music.common.Urls;
import com.yiting.music.online.model.bean.OnlineMusicBean;
import com.yiting.music.online.model.bean.TypeListBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Zhanglibin on 2017/11/28.
 */

public interface OnlineService {
    /**
     * 获取音乐类型的相关信息
     *
     * @return
     */
    @GET(Urls.GET_ONLIN_TYPE_LIST)
    Observable<TypeListBean> getOnlineList(@Query("type") String type,
                                                       @Query("size") int size,
                                                       @Query("offset") int offset);
    /**
     * 获取音乐类型的相关信息
     *
     * @return
     */
    @GET(Urls.GET_ONLIN_MUSCI)
    Observable<OnlineMusicBean> getOnlineMusic(@Query("songid") String songid);


}
