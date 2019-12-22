package com.example.appnofrag;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appnofrag.service.HttpRequest;
import com.example.appnofrag.service.HttpRequest3;
import com.example.appnofrag.service.NetworkService;
import com.example.appnofrag.service.RestService;

public class OverwatchStatActivity extends AppCompatActivity {
    public static TextView playerName;
    public static TextView platform;
    public static ProgressBar progressBar;
    public static TextView rank;
    public static TextView timePlayed;
    public static TextView wins;
    public static TextView matchesPlayed;
    public static TextView goldMedals;
    public static TextView damageDone;
    public static TextView soloKills;
    public static TextView kd;
    public static TextView multiKills;
    public static TextView mostHealingDone;
    public static ProgressBar kdStat;
    public static int valueOfBar;


    public static ImageView avatar;

    private final NetworkService networkService2 = NetworkService.getInstance("https://public-api.tracker.gg/v2/");
    private RestService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.overdroch);

        playerName = findViewById(R.id.platformUserHandle);
        platform = findViewById(R.id.platform);
        avatar = findViewById(R.id.imageView2);
        timePlayed = findViewById(R.id.timePlayed);
        wins = findViewById(R.id.wins);
        matchesPlayed = findViewById(R.id.matchesPlayed);
        goldMedals = findViewById(R.id.goldMedals);
        damageDone = findViewById(R.id.damageDone);
        soloKills = findViewById(R.id.soloKills);
        kd = findViewById(R.id.kd);
        multiKills = findViewById(R.id.multiKills);
        mostHealingDone = findViewById(R.id.mostHealingDone);
        kdStat = findViewById(R.id.kdStat);


        progressBar = findViewById(R.id.progressbar );
        progressBar.setVisibility(View.INVISIBLE);


        Intent intent = getIntent();
        String dataString = intent.getStringExtra("search");
        service = networkService2.restService();
        HttpRequest3 request = new HttpRequest3(service, dataString);
        request.execute();
        playerName.setText(dataString);
        kdStat.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#1abc9c")));


    }
}
