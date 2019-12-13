package com.example.appnofrag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.appnofrag.service.GameInfoApi;
import com.example.appnofrag.service.HttpRequest;
import com.example.appnofrag.service.HttpRequest2;
import com.example.appnofrag.service.NetworkService;
import com.example.appnofrag.service.RestService;

public class CsGoStatActivity extends AppCompatActivity {
    public static TextView playerName;
    public static TextView platform;
    public static ProgressBar progressBar;

    private final NetworkService networkService2 = NetworkService.getInstance("https://public-api.tracker.gg/v2/");
    private RestService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs_go_stat);

        playerName = findViewById(R.id.playerName);
        platform = findViewById(R.id.platform);
        progressBar = findViewById(R.id.progressbar);
        progressBar.setVisibility(View.INVISIBLE);

        Intent intent = getIntent();
        String dataString = intent.getStringExtra("search");
        service = networkService2.restService();
        HttpRequest request = new HttpRequest(service);
        request.execute();
        playerName.setText(dataString);
    }
}
