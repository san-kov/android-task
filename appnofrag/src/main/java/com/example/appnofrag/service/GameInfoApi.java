package com.example.appnofrag.service;

import com.example.appnofrag.domain.game.Game;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GameInfoApi {
    @GET("games/{game}")
    Call<Game> getGameBySlug(@Path("game") String game);
}
