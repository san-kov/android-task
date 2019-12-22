package com.example.fragmentnew.service;

import com.example.fragmentnew.domain.game.Game;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GameInfoApi {
    @GET("games/{game}")
    Call<Game> getGameBySlug(@Path("game") String game);
}
