package com.example.appnofrag.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {
    private static NetworkService mInstance;
    private static final String BASE_URL = "https://public-api.tracker.gg/v2/";
    private Retrofit mRetrofit;

    private NetworkService() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    private NetworkService(String url) {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static NetworkService getInstance() {
        if (mInstance == null) {
            mInstance = new NetworkService();
        }
        return mInstance;
    }

    public static NetworkService getInstance(String url) {
        if (mInstance == null) {
            mInstance = new NetworkService(url);
        }
        return mInstance;
    }


    public RestService restService() {return mRetrofit.create(RestService.class);}
    public GameInfoApi getGameApi() {return mRetrofit.create(GameInfoApi.class);}
}
