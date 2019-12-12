package com.example.appnofrag.service;

import com.example.appnofrag.domain.Data;
import com.example.appnofrag.domain.apex.ApexResponse;
import com.example.appnofrag.domain.csgo.GameResponse;
import com.example.appnofrag.domain.overwatch.OverwatchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RestService {
    /*
    @GET("csgo/standard/profile/{platform}/{platformUserIdentifier}")
    Call<List<CsGoStatsProfile>> getCsGoPlayerByIdentifier(@Header("TRN-Api-Key")String apiKey, @Path("platform")String platform, @Path("platformUserIdentifier")String platformUserIdentifier);

    //map or weapon segmentType
    @GET("csgo/standard/profile/{platform}/{platformUserIdentifier}/segments/{segmentType}")
    Call<List<CsGoSegment>> getSegmentByIdentifier(@Header("TRN-Api-Key")String apiKey, @Path("platform")String platform, @Path("platformUserIdentifier")String platformUserIdentifier, @Path("segmentType")String segmentType);
     */
    @Headers("TRN-Api-Key:60b16b1e-ffe5-4049-9a8a-0d9f1408c9bc")
    @GET("csgo/standard/search")
    Call<Data> getPlayerBySearchQuery(@Query("platform") String platform, @Query("query") String query);

    @Headers("TRN-Api-Key:60b16b1e-ffe5-4049-9a8a-0d9f1408c9bc")
    @GET("csgo/standard/profile/{platform}/{id}")
    Call<GameResponse> getPlayerStats(@Path("platform") String platform, @Path("id") String id);



    @Headers("TRN-Api-Key:60b16b1e-ffe5-4049-9a8a-0d9f1408c9bc")
    @GET("apex/standard/profile/psn/{playerName}")
    Call<ApexResponse> getApexPlayerStats(@Path("playerName") String playerName);



    @Headers("TRN-Api-Key:60b16b1e-ffe5-4049-9a8a-0d9f1408c9bc")
    @GET("overwatch/standard/profile/{platform}/{id}")
    Call<OverwatchResponse> getOverwatchPlayerStat(@Path("platform") String platform, @Path("id") String id);
}
