package com.example.appnofrag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.appnofrag.service.GameInfoApi;
import com.example.appnofrag.service.HttpRequest;
import com.example.appnofrag.service.HttpRequest2;
import com.example.appnofrag.service.NetworkService;
import com.example.appnofrag.service.RestService;
import com.example.appnofrag.R;

public class CsGoStatActivity extends AppCompatActivity {
    public static TextView playerName;
    public static TextView platform;
    public static ProgressBar progressBar;
    public static TextView kills;
    public static TextView deaths;
    public static TextView kd;
    public static TextView damage;
    public static TextView headshots;
    public static TextView bombsPlanted;
    public static TextView bombsDefused;
    public static TextView hostagesRescued;
    public static ImageView avatar;
    public static ProgressBar kdStat;

    private final NetworkService networkService2 = NetworkService.getInstance("https://public-api.tracker.gg/v2/");
    private RestService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs_go_stat);

        playerName = findViewById(R.id.platformUserHandle);
        platform = findViewById(R.id.platform);

        kills = findViewById(R.id.kills);
        deaths = findViewById(R.id.deaths);
        headshots = findViewById(R.id.headshots);
        bombsPlanted = findViewById(R.id.bombsPlanted);
        damage = findViewById(R.id.damage);
        bombsDefused = findViewById(R.id.bombsDefused);
        avatar = findViewById(R.id.imageView2);
        kd = findViewById(R.id.kd);
        hostagesRescued = findViewById(R.id.hostagesRescued);
        progressBar = findViewById(R.id.progressbar);
        progressBar.setVisibility(View.INVISIBLE);
        kdStat = findViewById(R.id.kdStat);


        Intent intent = getIntent();
        String dataString = intent.getStringExtra("search");
        service = networkService2.restService();
        HttpRequest request = new HttpRequest(service, dataString);
        request.execute();
        playerName.setText(dataString);
        kdStat.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#1abc9c")));
    }
}
