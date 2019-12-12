package com.example.appnofrag.service;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;

import com.example.appnofrag.CsGoStatActivity;
import com.example.appnofrag.OverwatchStatActivity;
import com.example.appnofrag.domain.Data;
import com.example.appnofrag.domain.csgo.GameResponse;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Response;

public class HttpRequest extends AsyncTask<Void, Void, Void> {
    Data data;
    GameResponse playerData;
    private RestService service;
    private String player;
    public HttpRequest(RestService service, String player) {
        this.service = service;
        this.player = player;
    }

    @Override
    protected Void doInBackground(Void... voids) {

            Call<Data> call = service.getPlayerBySearchQuery("steam", player);
            try {
                Response<Data> rp  =  call.execute();
                data = rp.body();
                Call<GameResponse> playerCall = service.getPlayerStats("steam", data.getPlatformInfos().get(0).getPlatformUserId());
                Response<GameResponse> res = playerCall.execute();
                playerData = res.body();
            } catch (Exception e) {
                Log.e("ProjActivity", "IOException", e);
                e.printStackTrace();

            }
            return null;
    }

    @Override
    protected void onPreExecute() {
        CsGoStatActivity.progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        try {
            CsGoStatActivity.playerName.setText(playerData.getData().getPlatformInfo().getPlatformUserHandle());

            CsGoStatActivity.platform.setText(playerData.getData().getPlatformInfo().getPlatformSlug());
            CsGoStatActivity.hostagesRescued.setText(playerData.getData().getSegments().get(0).getStats().getHostagesRescued().getDisplayValue());
            CsGoStatActivity.bombsPlanted.setText(playerData.getData().getSegments().get(0).getStats().getBombsPlanted().getDisplayValue());
            CsGoStatActivity.kills.setText(playerData.getData().getSegments().get(0).getStats().getKills().getDisplayValue());
            CsGoStatActivity.deaths.setText(playerData.getData().getSegments().get(0).getStats().getDeaths().getDisplayValue());
            CsGoStatActivity.bombsDefused.setText(playerData.getData().getSegments().get(0).getStats().getBombsDefused().getDisplayValue());
            CsGoStatActivity.headshots.setText(playerData.getData().getSegments().get(0).getStats().getHeadshots().getDisplayValue());
            CsGoStatActivity.kd.setText(playerData.getData().getSegments().get(0).getStats().getKd().getDisplayValue());
            CsGoStatActivity.damage.setText(playerData.getData().getSegments().get(0).getStats().getDamage().getDisplayValue());

            Picasso.get().load(data.getPlatformInfos().get(0).getAvatarUrl()).into(CsGoStatActivity.avatar);

            int valueOfBar = (int) (Double.parseDouble(playerData.getData().getSegments().get(0).getStats().getKd().getDisplayValue()) * 100);
            CsGoStatActivity.progressBar.setVisibility(View.INVISIBLE);
            ObjectAnimator progressAnimator = ObjectAnimator.ofInt(CsGoStatActivity.kdStat, "progress", 0, valueOfBar);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(progressAnimator);
            animatorSet.setDuration(1500);
            animatorSet.start();

        } catch (Exception e) {
            CsGoStatActivity.playerName.setText("Player Not Found");
            Picasso.get().load("https://sitechecker.pro/wp-content/uploads/2017/12/404.png").into(CsGoStatActivity.avatar);
        } finally {
            CsGoStatActivity.progressBar.setVisibility(View.INVISIBLE);

        }
        //DashboardFragment.data.setText(data.getPlatformInfos().get(0).getPlatformSlug());
    }
}
