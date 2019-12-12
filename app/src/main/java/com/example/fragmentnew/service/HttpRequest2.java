package com.example.fragmentnew.service;

import android.os.AsyncTask;
import android.util.Log;

import com.example.fragmentnew.domain.Data;
import com.example.fragmentnew.domain.game.Game;
import com.example.fragmentnew.ui.dashboard.DashboardFragment;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class HttpRequest2 extends AsyncTask<Void, Void, Void> {
    Game data;
    private GameInfoApi service;
    private String arg;

    public HttpRequest2(GameInfoApi service, String arg) {
        this.service = service;
        this.arg = arg;
    }


    @Override
    protected Void doInBackground(Void... voids) {
        if (arg.isEmpty()) {
            return null;
        }

            Call<Game> call = service.getGameBySlug(arg);
            try {
                Response<Game> rp  =  call.execute();
                data = rp.body();
            } catch (IOException e) {
                Log.e("HttpRequestGameInfoApi", "IOException", e);
                e.printStackTrace();

            }
            return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        DashboardFragment.data.setText(data.getNameOriginal());
        DashboardFragment.description.setText(data.getDescription());
        DashboardFragment.simpleRatingBar.setRating(data.getRating().floatValue());
        Picasso.get().load(data.getBackgroundImage()).into(DashboardFragment.imageView);
    }
}
