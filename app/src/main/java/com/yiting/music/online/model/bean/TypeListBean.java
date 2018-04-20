package com.yiting.music.online.model.bean;

import java.util.List;

/**
 * Date: 2018/4/17.
 * Author: Zhanglibin
 */

public class TypeListBean extends BaseBean {

    /**
     * song_list : [{"artist_id":"1625","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/201589a4d9e0c6cb21a4a5242e66a590/586420691/586420691.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/201589a4d9e0c6cb21a4a5242e66a590/586420691/586420691.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2018-04-02","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/02fa8d229274fdcb6c32f54af8146481/586421921/586421921.lrc","copy_type":"1","hot":"245338","all_artist_ting_uid":"7900","resource_type":"0","is_new":"1","rank_change":"0","rank":"1","all_artist_id":"1625","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"flac,320,256,128,64","file_duration":289,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"奔跑怪物（北京）文化娱乐有限公司","res_encryption_flag":"0","song_id":"586421952","title":"遇见你","ting_uid":"7900","author":"常石磊","album_id":"586421949","album_title":"遇见你","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":1,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"常石磊","pic_radio":"http://qukufile2.qianqian.com/data2/pic/201589a4d9e0c6cb21a4a5242e66a590/586420691/586420691.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/201589a4d9e0c6cb21a4a5242e66a590/586420691/586420691.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/201589a4d9e0c6cb21a4a5242e66a590/586420691/586420691.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/201589a4d9e0c6cb21a4a5242e66a590/586420691/586420691.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/201589a4d9e0c6cb21a4a5242e66a590/586420691/586420691.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/201589a4d9e0c6cb21a4a5242e66a590/586420691/586420691.jpg@s_1,w_1000,h_1000"},{"artist_id":"2006745","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/ebea4173af38cc85712bee3aab0a210b/586508993/586508993.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/ebea4173af38cc85712bee3aab0a210b/586508993/586508993.jpg@s_1,w_90,h_90","country":"港台","area":"1","publishtime":"2018-04-03","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/23fb2b0065c781c7f96ca298763c5331/586509771/586509771.lrc","copy_type":"1","hot":"138713","all_artist_ting_uid":"5564","resource_type":"0","is_new":"1","rank_change":"0","rank":"2","all_artist_id":"2006745","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":268,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"杭州网易云音乐科技有限公司","res_encryption_flag":"0","song_id":"586509783","title":"爱了很久的朋友","ting_uid":"5564","author":"田馥甄","album_id":"586509781","album_title":"爱了很久的朋友","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"田馥甄","pic_radio":"http://qukufile2.qianqian.com/data2/pic/ebea4173af38cc85712bee3aab0a210b/586508993/586508993.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/ebea4173af38cc85712bee3aab0a210b/586508993/586508993.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/ebea4173af38cc85712bee3aab0a210b/586508993/586508993.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/ebea4173af38cc85712bee3aab0a210b/586508993/586508993.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/ebea4173af38cc85712bee3aab0a210b/586508993/586508993.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/ebea4173af38cc85712bee3aab0a210b/586508993/586508993.jpg@s_1,w_1000,h_1000"},{"artist_id":"14947058","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/7f72769d171eb40c118a6edc0233ba74/585416615/585416615.JPG@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/7f72769d171eb40c118a6edc0233ba74/585416615/585416615.JPG@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2018-03-29","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/42a9b3adf6a72be63d3de0318eaafb11/585419267/585419267.lrc","copy_type":"1","hot":"126050","all_artist_ting_uid":"10559334","resource_type":"0","is_new":"1","rank_change":"0","rank":"3","all_artist_id":"14947058","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":255,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"完美世界（北京）网络技术有限公司","res_encryption_flag":"0","song_id":"585419369","title":"我在诛仙逍遥涧","ting_uid":"10559334","author":"王俊凯","album_id":"585419365","album_title":"我在诛仙逍遥涧","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":1,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"王俊凯","pic_radio":"http://qukufile2.qianqian.com/data2/pic/7f72769d171eb40c118a6edc0233ba74/585416615/585416615.JPG@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/7f72769d171eb40c118a6edc0233ba74/585416615/585416615.JPG@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/7f72769d171eb40c118a6edc0233ba74/585416615/585416615.JPG@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/7f72769d171eb40c118a6edc0233ba74/585416615/585416615.JPG@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/7f72769d171eb40c118a6edc0233ba74/585416615/585416615.JPG@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/7f72769d171eb40c118a6edc0233ba74/585416615/585416615.JPG@s_1,w_1000,h_1000"},{"artist_id":"1665","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/6cb232d53d0dd66d31c83b2c475011de/582827896/582827896.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/6cb232d53d0dd66d31c83b2c475011de/582827896/582827896.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2018-03-19","album_no":"2","lrclink":"http://qukufile2.qianqian.com/data2/lrc/889e5a8fc0d8f09aa43b1f5858060f3e/578454759/578454759.lrc","copy_type":"1","hot":"281400","all_artist_ting_uid":"2611","resource_type":"0","is_new":"1","rank_change":"0","rank":"4","all_artist_id":"1665","style":"","del_status":"0","relate_status":"1","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":245,"has_mv_mobile":0,"versions":"影视原声","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"电视剧《独孤天下》片尾曲","has_filmtv":"0","si_proxycompany":"北京听见时代娱乐传媒有限公司","res_encryption_flag":"0","song_id":"578455334","title":"菩提偈","ting_uid":"2611","author":"刘惜君","album_id":"578455332","album_title":"独孤天下 电视剧原声带","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":1,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"刘惜君","pic_radio":"http://qukufile2.qianqian.com/data2/pic/6cb232d53d0dd66d31c83b2c475011de/582827896/582827896.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/6cb232d53d0dd66d31c83b2c475011de/582827896/582827896.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/6cb232d53d0dd66d31c83b2c475011de/582827896/582827896.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/6cb232d53d0dd66d31c83b2c475011de/582827896/582827896.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/6cb232d53d0dd66d31c83b2c475011de/582827896/582827896.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/6cb232d53d0dd66d31c83b2c475011de/582827896/582827896.jpg@s_1,w_1000,h_1000"},{"artist_id":"215","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/3fe1dfd69d12647c721d0302f00a3335/586790924/586790924.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/3fe1dfd69d12647c721d0302f00a3335/586790924/586790924.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2018-04-04","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/c0967999f69ec0715f273a732f8afe5a/586791498/586791498.lrc","copy_type":"1","hot":"82822","all_artist_ting_uid":"1136,340308283","resource_type":"0","is_new":"1","rank_change":"0","rank":"5","all_artist_id":"215,570627731","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":271,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"六瞳国际文化传媒（北京）有限公司","res_encryption_flag":"0","song_id":"586791610","title":"我不在乎","ting_uid":"1136","author":"温兆伦,于安迪","album_id":"586791607","album_title":"我不在乎","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"温兆伦,于安迪","pic_radio":"http://qukufile2.qianqian.com/data2/pic/3fe1dfd69d12647c721d0302f00a3335/586790924/586790924.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/3fe1dfd69d12647c721d0302f00a3335/586790924/586790924.jpg","pic_premium":"http://qukufile2.qianqian.com/data2/pic/3fe1dfd69d12647c721d0302f00a3335/586790924/586790924.jpg","pic_huge":"","album_500_500":"http://qukufile2.qianqian.com/data2/pic/3fe1dfd69d12647c721d0302f00a3335/586790924/586790924.jpg","album_800_800":"","album_1000_1000":""},{"artist_id":"379","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/4675b6b9da28fa2380504eaff889faa2/588197238/588197238.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/4675b6b9da28fa2380504eaff889faa2/588197238/588197238.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2018-04-10","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/c400a8e2b6620394c6256b12fa13af2f/588199058/588199058.lrc","copy_type":"1","hot":"61501","all_artist_ting_uid":"1233","resource_type":"0","is_new":"1","rank_change":"0","rank":"6","all_artist_id":"379","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":303,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"Rock Records","res_encryption_flag":"0","song_id":"588197248","title":"相信爱情","ting_uid":"1233","author":"辛晓琪","album_id":"588197237","album_title":"相信爱情","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":1,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"辛晓琪","pic_radio":"http://qukufile2.qianqian.com/data2/pic/4675b6b9da28fa2380504eaff889faa2/588197238/588197238.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/4675b6b9da28fa2380504eaff889faa2/588197238/588197238.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/4675b6b9da28fa2380504eaff889faa2/588197238/588197238.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/4675b6b9da28fa2380504eaff889faa2/588197238/588197238.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/4675b6b9da28fa2380504eaff889faa2/588197238/588197238.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/4675b6b9da28fa2380504eaff889faa2/588197238/588197238.jpg@s_1,w_1000,h_1000"},{"artist_id":"89","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/6cb232d53d0dd66d31c83b2c475011de/582827896/582827896.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/6cb232d53d0dd66d31c83b2c475011de/582827896/582827896.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2018-03-19","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/03f01ab2a9db9b48041a32e4cf26244d/577326676/577326676.lrc","copy_type":"1","hot":"199039","all_artist_ting_uid":"1078","resource_type":"0","is_new":"1","rank_change":"1","rank":"7","all_artist_id":"89","style":"","del_status":"0","relate_status":"1","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":251,"has_mv_mobile":0,"versions":"影视原声","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"北京听见时代娱乐传媒有限公司","res_encryption_flag":"0","song_id":"577326683","title":"独孤天下","ting_uid":"1078","author":"李玉刚","album_id":"578455332","album_title":"独孤天下 电视剧原声带","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":1,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"李玉刚","pic_radio":"http://qukufile2.qianqian.com/data2/pic/6cb232d53d0dd66d31c83b2c475011de/582827896/582827896.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/6cb232d53d0dd66d31c83b2c475011de/582827896/582827896.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/6cb232d53d0dd66d31c83b2c475011de/582827896/582827896.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/6cb232d53d0dd66d31c83b2c475011de/582827896/582827896.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/6cb232d53d0dd66d31c83b2c475011de/582827896/582827896.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/6cb232d53d0dd66d31c83b2c475011de/582827896/582827896.jpg@s_1,w_1000,h_1000"},{"artist_id":"762","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/319763979ab52f087ca7fa7f2aff063f/585706807/585706807.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/319763979ab52f087ca7fa7f2aff063f/585706807/585706807.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2018-03-30","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/3c90b922a34c630c88356c480ce01817/585708713/585708713.lrc","copy_type":"1","hot":"60222","all_artist_ting_uid":"1376","resource_type":"0","is_new":"1","rank_change":"1","rank":"8","all_artist_id":"762","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":261,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"北京普天同乐文化传媒有限公司","res_encryption_flag":"0","song_id":"585708820","title":"又是春风里","ting_uid":"1376","author":"龙梅子","album_id":"585708812","album_title":"又是春风里","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"龙梅子","pic_radio":"http://qukufile2.qianqian.com/data2/pic/319763979ab52f087ca7fa7f2aff063f/585706807/585706807.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/319763979ab52f087ca7fa7f2aff063f/585706807/585706807.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/319763979ab52f087ca7fa7f2aff063f/585706807/585706807.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/319763979ab52f087ca7fa7f2aff063f/585706807/585706807.jpg","album_500_500":"http://qukufile2.qianqian.com/data2/pic/319763979ab52f087ca7fa7f2aff063f/585706807/585706807.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/319763979ab52f087ca7fa7f2aff063f/585706807/585706807.jpg"},{"artist_id":"246300085","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/dc0995a4bc17438f8407ad0e90f7a2e2/588523521/588523521.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/dc0995a4bc17438f8407ad0e90f7a2e2/588523521/588523521.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2018-04-12","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/e64528431e2ae949f064acbc2923bcaf/588526840/588526840.lrc","copy_type":"1","hot":"47407","all_artist_ting_uid":"214712572","resource_type":"0","is_new":"1","rank_change":"4","rank":"9","all_artist_id":"246300085","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"flac,320,256,128,64","file_duration":257,"has_mv_mobile":0,"versions":"影视原声","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"北京听见时代娱乐传媒发展有限公司","res_encryption_flag":"0","song_id":"588526919","title":"微不足道的小事是我还爱着你","ting_uid":"214712572","author":"张磊","album_id":"588526916","album_title":"微不足道的小事是我还爱着你","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"张磊","pic_radio":"http://qukufile2.qianqian.com/data2/pic/dc0995a4bc17438f8407ad0e90f7a2e2/588523521/588523521.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/dc0995a4bc17438f8407ad0e90f7a2e2/588523521/588523521.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/dc0995a4bc17438f8407ad0e90f7a2e2/588523521/588523521.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/dc0995a4bc17438f8407ad0e90f7a2e2/588523521/588523521.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/dc0995a4bc17438f8407ad0e90f7a2e2/588523521/588523521.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/dc0995a4bc17438f8407ad0e90f7a2e2/588523521/588523521.jpg@s_1,w_1000,h_1000"},{"artist_id":"120780344","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/b174516d4b1c859a2e5d9fa1457a6ebb/583772885/583772885.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/b174516d4b1c859a2e5d9fa1457a6ebb/583772885/583772885.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2018-03-30","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/45c37ce41be5f251614880b530e9f12d/585703802/585703802.lrc","copy_type":"1","hot":"55399","all_artist_ting_uid":"210101646","resource_type":"0","is_new":"1","rank_change":"0","rank":"10","all_artist_id":"120780344","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":269,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"Rock Records","res_encryption_flag":"0","song_id":"583772902","title":"自然凋谢","ting_uid":"210101646","author":"孙盛希","album_id":"583772880","album_title":"自然凋谢","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"孙盛希","pic_radio":"http://qukufile2.qianqian.com/data2/pic/b174516d4b1c859a2e5d9fa1457a6ebb/583772885/583772885.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/b174516d4b1c859a2e5d9fa1457a6ebb/583772885/583772885.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/b174516d4b1c859a2e5d9fa1457a6ebb/583772885/583772885.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/b174516d4b1c859a2e5d9fa1457a6ebb/583772885/583772885.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/b174516d4b1c859a2e5d9fa1457a6ebb/583772885/583772885.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/b174516d4b1c859a2e5d9fa1457a6ebb/583772885/583772885.jpg@s_1,w_1000,h_1000"}]
     * billboard : {"billboard_type":"1","billboard_no":"2532","update_date":"2018-04-17","billboard_songnum":"133","havemore":1,"name":"新歌榜","comment":"该榜单是根据百度音乐平台歌曲每日播放量自动生成的数据榜单，统计范围为近期发行的歌曲，每日更新一次","pic_s192":"http://hiphotos.qianqian.com/ting/pic/item/9922720e0cf3d7caf39ebc10f11fbe096b63a968.jpg","pic_s640":"http://hiphotos.qianqian.com/ting/pic/item/f7246b600c33874495c4d089530fd9f9d62aa0c6.jpg","pic_s444":"http://hiphotos.qianqian.com/ting/pic/item/78310a55b319ebc4845c84eb8026cffc1e17169f.jpg","pic_s260":"http://hiphotos.qianqian.com/ting/pic/item/e850352ac65c1038cb0f3cb0b0119313b07e894b.jpg","pic_s210":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_c49310115801d43d42a98fdc357f6057.jpg","web_url":"http://music.baidu.com/top/new"}
     * error_code : 22000
     */

    private BillboardBean billboard;
    private int error_code;
    private List<SongListBean> song_list;

    public BillboardBean getBillboard() {
        return billboard;
    }

    public void setBillboard(BillboardBean billboard) {
        this.billboard = billboard;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<SongListBean> getSong_list() {
        return song_list;
    }

    public void setSong_list(List<SongListBean> song_list) {
        this.song_list = song_list;
    }

    @Override
    public boolean isSuccess() {
        return error_code == 22000;
    }

    public static class BillboardBean {
        /**
         * billboard_type : 1
         * billboard_no : 2532
         * update_date : 2018-04-17
         * billboard_songnum : 133
         * havemore : 1
         * name : 新歌榜
         * comment : 该榜单是根据百度音乐平台歌曲每日播放量自动生成的数据榜单，统计范围为近期发行的歌曲，每日更新一次
         * pic_s192 : http://hiphotos.qianqian.com/ting/pic/item/9922720e0cf3d7caf39ebc10f11fbe096b63a968.jpg
         * pic_s640 : http://hiphotos.qianqian.com/ting/pic/item/f7246b600c33874495c4d089530fd9f9d62aa0c6.jpg
         * pic_s444 : http://hiphotos.qianqian.com/ting/pic/item/78310a55b319ebc4845c84eb8026cffc1e17169f.jpg
         * pic_s260 : http://hiphotos.qianqian.com/ting/pic/item/e850352ac65c1038cb0f3cb0b0119313b07e894b.jpg
         * pic_s210 : http://business.cdn.qianqian.com/qianqian/pic/bos_client_c49310115801d43d42a98fdc357f6057.jpg
         * web_url : http://music.baidu.com/top/new
         */

        private String billboard_type;
        private String billboard_no;
        private String update_date;
        private String billboard_songnum;
        private int havemore;
        private String name;
        private String comment;
        private String pic_s192;
        private String pic_s640;
        private String pic_s444;
        private String pic_s260;
        private String pic_s210;
        private String web_url;

        public String getBillboard_type() {
            return billboard_type;
        }

        public void setBillboard_type(String billboard_type) {
            this.billboard_type = billboard_type;
        }

        public String getBillboard_no() {
            return billboard_no;
        }

        public void setBillboard_no(String billboard_no) {
            this.billboard_no = billboard_no;
        }

        public String getUpdate_date() {
            return update_date;
        }

        public void setUpdate_date(String update_date) {
            this.update_date = update_date;
        }

        public String getBillboard_songnum() {
            return billboard_songnum;
        }

        public void setBillboard_songnum(String billboard_songnum) {
            this.billboard_songnum = billboard_songnum;
        }

        public int getHavemore() {
            return havemore;
        }

        public void setHavemore(int havemore) {
            this.havemore = havemore;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getPic_s192() {
            return pic_s192;
        }

        public void setPic_s192(String pic_s192) {
            this.pic_s192 = pic_s192;
        }

        public String getPic_s640() {
            return pic_s640;
        }

        public void setPic_s640(String pic_s640) {
            this.pic_s640 = pic_s640;
        }

        public String getPic_s444() {
            return pic_s444;
        }

        public void setPic_s444(String pic_s444) {
            this.pic_s444 = pic_s444;
        }

        public String getPic_s260() {
            return pic_s260;
        }

        public void setPic_s260(String pic_s260) {
            this.pic_s260 = pic_s260;
        }

        public String getPic_s210() {
            return pic_s210;
        }

        public void setPic_s210(String pic_s210) {
            this.pic_s210 = pic_s210;
        }

        public String getWeb_url() {
            return web_url;
        }

        public void setWeb_url(String web_url) {
            this.web_url = web_url;
        }
    }

    public static class SongListBean {
        /**
         * artist_id : 1625
         * language : 国语
         * pic_big : http://qukufile2.qianqian.com/data2/pic/201589a4d9e0c6cb21a4a5242e66a590/586420691/586420691.jpg@s_1,w_150,h_150
         * pic_small : http://qukufile2.qianqian.com/data2/pic/201589a4d9e0c6cb21a4a5242e66a590/586420691/586420691.jpg@s_1,w_90,h_90
         * country : 内地
         * area : 0
         * publishtime : 2018-04-02
         * album_no : 1
         * lrclink : http://qukufile2.qianqian.com/data2/lrc/02fa8d229274fdcb6c32f54af8146481/586421921/586421921.lrc
         * copy_type : 1
         * hot : 245338
         * all_artist_ting_uid : 7900
         * resource_type : 0
         * is_new : 1
         * rank_change : 0
         * rank : 1
         * all_artist_id : 1625
         * style :
         * del_status : 0
         * relate_status : 0
         * toneid : 0
         * all_rate : flac,320,256,128,64
         * file_duration : 289
         * has_mv_mobile : 0
         * versions :
         * bitrate_fee : {"0":"0|0","1":"0|0"}
         * biaoshi : first,lossless
         * info :
         * has_filmtv : 0
         * si_proxycompany : 奔跑怪物（北京）文化娱乐有限公司
         * res_encryption_flag : 0
         * song_id : 586421952
         * title : 遇见你
         * ting_uid : 7900
         * author : 常石磊
         * album_id : 586421949
         * album_title : 遇见你
         * is_first_publish : 0
         * havehigh : 2
         * charge : 0
         * has_mv : 1
         * learn : 0
         * song_source : web
         * piao_id : 0
         * korean_bb_song : 0
         * resource_type_ext : 0
         * mv_provider : 0000000000
         * artist_name : 常石磊
         * pic_radio : http://qukufile2.qianqian.com/data2/pic/201589a4d9e0c6cb21a4a5242e66a590/586420691/586420691.jpg@s_1,w_300,h_300
         * pic_s500 : http://qukufile2.qianqian.com/data2/pic/201589a4d9e0c6cb21a4a5242e66a590/586420691/586420691.jpg@s_1,w_500,h_500
         * pic_premium : http://qukufile2.qianqian.com/data2/pic/201589a4d9e0c6cb21a4a5242e66a590/586420691/586420691.jpg@s_1,w_500,h_500
         * pic_huge : http://qukufile2.qianqian.com/data2/pic/201589a4d9e0c6cb21a4a5242e66a590/586420691/586420691.jpg@s_1,w_1000,h_1000
         * album_500_500 : http://qukufile2.qianqian.com/data2/pic/201589a4d9e0c6cb21a4a5242e66a590/586420691/586420691.jpg@s_1,w_500,h_500
         * album_800_800 :
         * album_1000_1000 : http://qukufile2.qianqian.com/data2/pic/201589a4d9e0c6cb21a4a5242e66a590/586420691/586420691.jpg@s_1,w_1000,h_1000
         */

        private String artist_id;
        private String language;
        private String pic_big;
        private String pic_small;
        private String country;
        private String area;
        private String publishtime;
        private String album_no;
        private String lrclink;
        private String copy_type;
        private String hot;
        private String all_artist_ting_uid;
        private String resource_type;
        private String is_new;
        private String rank_change;
        private String rank;
        private String all_artist_id;
        private String style;
        private String del_status;
        private String relate_status;
        private String toneid;
        private String all_rate;
        private int file_duration;
        private int has_mv_mobile;
        private String versions;
        private String bitrate_fee;
        private String biaoshi;
        private String info;
        private String has_filmtv;
        private String si_proxycompany;
        private String res_encryption_flag;
        private String song_id;
        private String title;
        private String ting_uid;
        private String author;
        private String album_id;
        private String album_title;
        private int is_first_publish;
        private int havehigh;
        private int charge;
        private int has_mv;
        private int learn;
        private String song_source;
        private String piao_id;
        private String korean_bb_song;
        private String resource_type_ext;
        private String mv_provider;
        private String artist_name;
        private String pic_radio;
        private String pic_s500;
        private String pic_premium;
        private String pic_huge;
        private String album_500_500;
        private String album_800_800;
        private String album_1000_1000;

        public String getArtist_id() {
            return artist_id;
        }

        public void setArtist_id(String artist_id) {
            this.artist_id = artist_id;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getPic_big() {
            return pic_big;
        }

        public void setPic_big(String pic_big) {
            this.pic_big = pic_big;
        }

        public String getPic_small() {
            return pic_small;
        }

        public void setPic_small(String pic_small) {
            this.pic_small = pic_small;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getPublishtime() {
            return publishtime;
        }

        public void setPublishtime(String publishtime) {
            this.publishtime = publishtime;
        }

        public String getAlbum_no() {
            return album_no;
        }

        public void setAlbum_no(String album_no) {
            this.album_no = album_no;
        }

        public String getLrclink() {
            return lrclink;
        }

        public void setLrclink(String lrclink) {
            this.lrclink = lrclink;
        }

        public String getCopy_type() {
            return copy_type;
        }

        public void setCopy_type(String copy_type) {
            this.copy_type = copy_type;
        }

        public String getHot() {
            return hot;
        }

        public void setHot(String hot) {
            this.hot = hot;
        }

        public String getAll_artist_ting_uid() {
            return all_artist_ting_uid;
        }

        public void setAll_artist_ting_uid(String all_artist_ting_uid) {
            this.all_artist_ting_uid = all_artist_ting_uid;
        }

        public String getResource_type() {
            return resource_type;
        }

        public void setResource_type(String resource_type) {
            this.resource_type = resource_type;
        }

        public String getIs_new() {
            return is_new;
        }

        public void setIs_new(String is_new) {
            this.is_new = is_new;
        }

        public String getRank_change() {
            return rank_change;
        }

        public void setRank_change(String rank_change) {
            this.rank_change = rank_change;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getAll_artist_id() {
            return all_artist_id;
        }

        public void setAll_artist_id(String all_artist_id) {
            this.all_artist_id = all_artist_id;
        }

        public String getStyle() {
            return style;
        }

        public void setStyle(String style) {
            this.style = style;
        }

        public String getDel_status() {
            return del_status;
        }

        public void setDel_status(String del_status) {
            this.del_status = del_status;
        }

        public String getRelate_status() {
            return relate_status;
        }

        public void setRelate_status(String relate_status) {
            this.relate_status = relate_status;
        }

        public String getToneid() {
            return toneid;
        }

        public void setToneid(String toneid) {
            this.toneid = toneid;
        }

        public String getAll_rate() {
            return all_rate;
        }

        public void setAll_rate(String all_rate) {
            this.all_rate = all_rate;
        }

        public int getFile_duration() {
            return file_duration;
        }

        public void setFile_duration(int file_duration) {
            this.file_duration = file_duration;
        }

        public int getHas_mv_mobile() {
            return has_mv_mobile;
        }

        public void setHas_mv_mobile(int has_mv_mobile) {
            this.has_mv_mobile = has_mv_mobile;
        }

        public String getVersions() {
            return versions;
        }

        public void setVersions(String versions) {
            this.versions = versions;
        }

        public String getBitrate_fee() {
            return bitrate_fee;
        }

        public void setBitrate_fee(String bitrate_fee) {
            this.bitrate_fee = bitrate_fee;
        }

        public String getBiaoshi() {
            return biaoshi;
        }

        public void setBiaoshi(String biaoshi) {
            this.biaoshi = biaoshi;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public String getHas_filmtv() {
            return has_filmtv;
        }

        public void setHas_filmtv(String has_filmtv) {
            this.has_filmtv = has_filmtv;
        }

        public String getSi_proxycompany() {
            return si_proxycompany;
        }

        public void setSi_proxycompany(String si_proxycompany) {
            this.si_proxycompany = si_proxycompany;
        }

        public String getRes_encryption_flag() {
            return res_encryption_flag;
        }

        public void setRes_encryption_flag(String res_encryption_flag) {
            this.res_encryption_flag = res_encryption_flag;
        }

        public String getSong_id() {
            return song_id;
        }

        public void setSong_id(String song_id) {
            this.song_id = song_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTing_uid() {
            return ting_uid;
        }

        public void setTing_uid(String ting_uid) {
            this.ting_uid = ting_uid;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAlbum_id() {
            return album_id;
        }

        public void setAlbum_id(String album_id) {
            this.album_id = album_id;
        }

        public String getAlbum_title() {
            return album_title;
        }

        public void setAlbum_title(String album_title) {
            this.album_title = album_title;
        }

        public int getIs_first_publish() {
            return is_first_publish;
        }

        public void setIs_first_publish(int is_first_publish) {
            this.is_first_publish = is_first_publish;
        }

        public int getHavehigh() {
            return havehigh;
        }

        public void setHavehigh(int havehigh) {
            this.havehigh = havehigh;
        }

        public int getCharge() {
            return charge;
        }

        public void setCharge(int charge) {
            this.charge = charge;
        }

        public int getHas_mv() {
            return has_mv;
        }

        public void setHas_mv(int has_mv) {
            this.has_mv = has_mv;
        }

        public int getLearn() {
            return learn;
        }

        public void setLearn(int learn) {
            this.learn = learn;
        }

        public String getSong_source() {
            return song_source;
        }

        public void setSong_source(String song_source) {
            this.song_source = song_source;
        }

        public String getPiao_id() {
            return piao_id;
        }

        public void setPiao_id(String piao_id) {
            this.piao_id = piao_id;
        }

        public String getKorean_bb_song() {
            return korean_bb_song;
        }

        public void setKorean_bb_song(String korean_bb_song) {
            this.korean_bb_song = korean_bb_song;
        }

        public String getResource_type_ext() {
            return resource_type_ext;
        }

        public void setResource_type_ext(String resource_type_ext) {
            this.resource_type_ext = resource_type_ext;
        }

        public String getMv_provider() {
            return mv_provider;
        }

        public void setMv_provider(String mv_provider) {
            this.mv_provider = mv_provider;
        }

        public String getArtist_name() {
            return artist_name;
        }

        public void setArtist_name(String artist_name) {
            this.artist_name = artist_name;
        }

        public String getPic_radio() {
            return pic_radio;
        }

        public void setPic_radio(String pic_radio) {
            this.pic_radio = pic_radio;
        }

        public String getPic_s500() {
            return pic_s500;
        }

        public void setPic_s500(String pic_s500) {
            this.pic_s500 = pic_s500;
        }

        public String getPic_premium() {
            return pic_premium;
        }

        public void setPic_premium(String pic_premium) {
            this.pic_premium = pic_premium;
        }

        public String getPic_huge() {
            return pic_huge;
        }

        public void setPic_huge(String pic_huge) {
            this.pic_huge = pic_huge;
        }

        public String getAlbum_500_500() {
            return album_500_500;
        }

        public void setAlbum_500_500(String album_500_500) {
            this.album_500_500 = album_500_500;
        }

        public String getAlbum_800_800() {
            return album_800_800;
        }

        public void setAlbum_800_800(String album_800_800) {
            this.album_800_800 = album_800_800;
        }

        public String getAlbum_1000_1000() {
            return album_1000_1000;
        }

        public void setAlbum_1000_1000(String album_1000_1000) {
            this.album_1000_1000 = album_1000_1000;
        }
    }

}
