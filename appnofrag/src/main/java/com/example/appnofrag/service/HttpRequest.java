package com.example.appnofrag.service;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;

import com.example.appnofrag.CsGoStatActivity;
import com.example.appnofrag.MainActivity;
import com.example.appnofrag.domain.Data;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class HttpRequest extends AsyncTask<Void, Void, Void> {
    Data data;
    private RestService service;
    public HttpRequest(RestService service) {
        this.service = service;
    }

    @Override
    protected Void doInBackground(Void... voids) {

            Call<Data> call = service.getPlayerBySearchQuery("steam", "xawdxawdx");
            try {
                Response<Data> rp  =  call.execute();
                data = rp.body();
            } catch (IOException e) {
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
        CsGoStatActivity.platform.setText(data.getPlatformInfos().get(0).getPlatformSlug());
        CsGoStatActivity.progressBar.setVisibility(View.INVISIBLE);
        //DashboardFragment.data.setText(data.getPlatformInfos().get(0).getPlatformSlug());
    }
}
