package com.example.appnofrag.service;

import android.os.AsyncTask;
import android.transition.Transition;
import android.util.Log;
import android.view.View;

import com.example.appnofrag.ApexActivity;
import com.example.appnofrag.MainActivity;
import com.example.appnofrag.domain.Data;
import com.example.appnofrag.domain.apex.ApexResponse;

import com.squareup.picasso.Picasso;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class HttpRequest4 extends AsyncTask<Void, Void, Void> {
    ApexResponse data;
    private RestService service;
    private String player;
    public HttpRequest4(RestService service, String player) {
        this.service = service;
        this.player = player;
    }

    @Override
    protected Void doInBackground(Void... voids) {

        Call<ApexResponse> call = service.getApexPlayerStats(player);
        try {
            Response<ApexResponse> rp  =  call.execute();
            data = rp.body();

        } catch (Exception e) {
            Log.e("ProjActivity", "IOException", e);
            e.printStackTrace();

        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        ApexActivity.progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        try {
            ApexActivity.platform.setText(data.getData().getPlatformInfo().getPlatformSlug());
            ApexActivity.playerName.setText(data.getData().getPlatformInfo().getPlatformUserHandle());
            ApexActivity.kills.setText(data.getData().getSegments().get(0).getStats().getKills().getDisplayValue());
            ApexActivity.rankScore.setText(data.getData().getSegments().get(0).getStats().getRankScore().getDisplayValue());
            ApexActivity.killsPerMatch.setText(data.getData().getSegments().get(0).getStats().getKillsPerMatch().getDisplayValue());
            ApexActivity.winningKills.setText(data.getData().getSegments().get(0).getStats().getWinningKills().getDisplayValue());
            ApexActivity.damage.setText(data.getData().getSegments().get(0).getStats().getDamage().getDisplayValue());
            ApexActivity.matchesPlayed.setText(data.getData().getSegments().get(0).getStats().getMatchesPlayed().getDisplayValue());
            ApexActivity.reviews.setText(data.getData().getSegments().get(0).getStats().getRevives().getDisplayValue());
            ApexActivity.sniperKills.setText(data.getData().getSegments().get(0).getStats().getSniperKills().getDisplayValue());
           Picasso.get().load(data.getData().getPlatformInfo().getAvatarUrl()).into(ApexActivity.avatar);

        } catch (Exception e) {
            ApexActivity.playerName.setText("Player Not Found");
            Picasso.get().load("https://sitechecker.pro/wp-content/uploads/2017/12/404.png").into(ApexActivity.avatar);
        } finally {
            ApexActivity.progressBar.setVisibility(View.INVISIBLE);

        }
        //DashboardFragment.data.setText(data.getPlatformInfos().get(0).getPlatformSlug());
    }
}
