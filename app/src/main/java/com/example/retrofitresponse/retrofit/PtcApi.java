package com.example.retrofitresponse.retrofit;

import com.example.retrofitresponse.retrofit.ptcpojo.PtcRoot;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface PtcApi {

    @FormUrlEncoded
    @POST("/json_ver2/home_page_new3.php")
    Call<PtcRoot> getPtcRoot(@Field("user_id") String aUserId,
                             @Field("api_version") String aApiVersion,
                             @Field("access_token") String aToken);

}
