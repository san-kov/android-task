package com.example.appnofrag.service;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;

import com.example.appnofrag.CsGoStatActivity;
import com.example.appnofrag.OverwatchStatActivity;
import com.example.appnofrag.domain.overwatch.OverwatchResponse;
import com.squareup.picasso.Picasso;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class HttpRequest3 extends AsyncTask<Void, Void, Void> {
    OverwatchResponse playerData;
    private RestService service;
    private String player;
    public HttpRequest3(RestService service, String player) {
        this.service = service;
        this.player = player;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        //String convertedPlayerName = player.replaceFirst("#","%23");
        Call<OverwatchResponse> call = service.getOverwatchPlayerStat("battlenet", player);
        try {
            Response<OverwatchResponse> rp  =  call.execute();
            playerData = rp.body();
        } catch (IOException e) {
            Log.e("ProjActivity", "IOException", e);
            e.printStackTrace();

        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        OverwatchStatActivity.progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        OverwatchStatActivity.playerName.setText(playerData.getData().getPlatformInfo().getPlatformUserHandle());
        OverwatchStatActivity.platform.setText(playerData.getData().getPlatformInfo().getPlatformSlug());
        OverwatchStatActivity.timePlayed.setText(playerData.getData().getSegments().get(0).getStats().getTimePlayed().getDisplayValue());
        OverwatchStatActivity.wins.setText(playerData.getData().getSegments().get(0).getStats().getWins().getDisplayValue());
        OverwatchStatActivity.matchesPlayed.setText(playerData.getData().getSegments().get(0).getStats().getMatchesPlayed().getDisplayValue());
        OverwatchStatActivity.goldMedals.setText(playerData.getData().getSegments().get(0).getStats().getGoldMedals().getDisplayValue());
        OverwatchStatActivity.damageDone.setText(playerData.getData().getSegments().get(0).getStats().getDamageDone().getDisplayValue());
        OverwatchStatActivity.soloKills.setText(playerData.getData().getSegments().get(0).getStats().getSoloKills().getDisplayValue());
        OverwatchStatActivity.kd.setText(playerData.getData().getSegments().get(0).getStats().getKd().getDisplayValue());
        OverwatchStatActivity.multiKills.setText(playerData.getData().getSegments().get(0).getStats().getMultiKills().getDisplayValue());
        OverwatchStatActivity.mostHealingDone.setText(playerData.getData().getSegments().get(0).getStats().getMostHealingDone().getDisplayValue());
        OverwatchStatActivity.valueOfBar = (int)(Double.parseDouble(playerData.getData().getSegments().get(0).getStats().getKd().getDisplayValue()) * 100);
        int valueOfBar = (int)(Double.parseDouble(playerData.getData().getSegments().get(0).getStats().getKd().getDisplayValue()) * 100);

        Picasso.get().load("https://assets1.ignimgs.com/2018/02/23/overwatch-button-v2-1519416414955.jpg").into(OverwatchStatActivity.avatar);

        OverwatchStatActivity.progressBar.setVisibility(View.INVISIBLE);
        ObjectAnimator progressAnimator = ObjectAnimator.ofInt(OverwatchStatActivity.kdStat, "progress", 0, valueOfBar);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(progressAnimator);
        animatorSet.setDuration(1500);
        animatorSet.start();
        //DashboardFragment.data.setText(data.getPlatformInfos().get(0).getPlatformSlug());
    }
}
