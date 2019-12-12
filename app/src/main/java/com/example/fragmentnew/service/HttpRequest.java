package com.example.fragmentnew.service;

import android.os.AsyncTask;
import android.util.Log;

import com.example.fragmentnew.MainActivity;
import com.example.fragmentnew.domain.Data;
import com.example.fragmentnew.ui.dashboard.DashboardFragment;

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
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        DashboardFragment.data.setText(data.getPlatformInfos().get(0).getPlatformSlug());
    }
}
