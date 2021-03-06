package com.notonly.calendar.api;

import com.notonly.calendar.domain.CalendarBean;
import com.notonly.calendar.domain.HistoryBean;
import com.notonly.calendar.domain.HistoryDetailBean;
import com.notonly.calendar.domain.SloganBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * 接口
 * Created by wangzhen on 2017/4/24.
 */
public interface APIService {

    /**
     * 历史上的今天详情 V2.0
     *
     * @param eventId
     * @param key
     * @return
     */
    @GET("todayOnhistory/queryDetail.php")
    Call<HistoryDetailBean> findHistoryDetail(@Query("e_id") String eventId, @Query("key") String key);

    /**
     * 历史上的今天 V2.0
     *
     * @param date
     * @param key
     * @return
     */
    @GET("todayOnhistory/queryEvent.php")
    Call<HistoryBean> findHistoryList(@Query("date") String date, @Query("key") String key);

    /**
     * 万年历
     *
     * @param date
     * @param key
     * @return
     */
    @GET("calendar/day")
    Call<CalendarBean> findCalendar(@Query("date") String date, @Query("key") String key);

    /**
     * 金山词霸每日一句
     *
     * @param url
     * @return
     */
    @GET
    Call<SloganBean> findSlogan(@Url String url);

}
