package com.example.appnofrag.service;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;

import com.example.appnofrag.MainActivity;
import com.example.appnofrag.domain.game.Game;
import com.squareup.picasso.Picasso;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class HttpRequest2 extends AsyncTask<Void, Integer, Void> {
    Game data;
    private GameInfoApi service;
    private String arg;

    public HttpRequest2(GameInfoApi service, String arg) {
        this.service = service;
        this.arg = arg;
    }

    @Override
    protected void onPreExecute() {
       MainActivity.progressBar.setVisibility(View.VISIBLE);
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
    protected void onProgressUpdate(Integer... values) {
        MainActivity.progressBar.setProgress(values[0],true);
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        MainActivity.progressBar.setVisibility(View.INVISIBLE);
        MainActivity.gameName.setText(data.getNameOriginal());
        MainActivity.gameDesc.setText(data.getDescriptionRaw());
        MainActivity.ratingBar.setRating(data.getRating().floatValue());
        MainActivity.ratingBar.setVisibility(View.VISIBLE);
        Picasso.get().load(data.getBackgroundImage()).into(MainActivity.gameImage);
    }
}
