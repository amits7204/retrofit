package com.example.retrofitresponse.retrofit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PtcClient {

    private static final String BASE_URL = " https://api.ptcplay.com/";
    private static Retrofit mRetrofit = null;

    private static Retrofit getClient() {
        HttpLoggingInterceptor lHttp = new HttpLoggingInterceptor();
        lHttp.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient lOkhttp = new OkHttpClient()
                .newBuilder()
                .addInterceptor(lHttp)
                .build();
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(lOkhttp)
                .build();
        return mRetrofit;
    }

    public static PtcApi getPtcApi() {
        return getClient().create(PtcApi.class);
    }
}


