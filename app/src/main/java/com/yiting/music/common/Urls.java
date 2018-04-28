package com.yiting.music.common;

/**
 * Created by Zhanglibin on 2017/11/27.
 */

public class Urls {
    /**
     * Base地址
     */
    public static final String BASE_URL = "http://tingapi.ting.baidu.com/v1/restserver/ting";
    /**
     * 网络歌曲分类列表信息
     */
    public static final String GET_ONLIN_TYPE_LIST = BASE_URL + "?format=json&callback=&from=webapp_music&method=baidu.ting.billboard.billList";

    /**
     * 网络歌曲分类列表信息
     */
    public static final String GET_ONLIN_MUSCI = BASE_URL + "?format=json&callback=&from=webapp_music&method=baidu.ting.song.play";
}
