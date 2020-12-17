package com.example.myapplication.net;

import java.util.HashMap;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface ApiService {
    /*String BASE_SERVICE = "http://cdwan.cn:7000/exam2003/";
    @GET("abannerlist.json")
    Observable<BannerBean> getBanner();
    @GET("anewslist.json")
    Observable<LeftBean> getLeft();
    @GET("astudent.json")
    Observable<RightBean> getRight();*/
    @GET
    Observable<ResponseBody> get(@Url String url);

    @FormUrlEncoded
    @POST
    Observable<ResponseBody> post(@Url String url);

    @FormUrlEncoded
    @POST
    Observable<ResponseBody> post(@Url String url, @FieldMap HashMap<String,String> map);
}
