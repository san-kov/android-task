package com.example.appnofrag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.appnofrag.service.HttpRequest4;
import com.example.appnofrag.service.NetworkService;
import com.example.appnofrag.service.RestService;

public class ApexActivity extends AppCompatActivity {
    public static TextView playerName;
    public static TextView platform;
    public static ProgressBar progressBar;
    public static TextView kills;
    public static TextView killsPerMatch;

    public static TextView winningKills;
    public static TextView damage;
    public static TextView headshots;
    public static TextView matchesPlayed;
    public static TextView reviews;
    public static TextView sniperKills;
    public static TextView rankScore;
    public static ImageView avatar;

    private final NetworkService networkService2 = NetworkService.getInstance("https://public-api.tracker.gg/v2/");
    private RestService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apex);


        playerName = findViewById(R.id.avatarUrl);
        platform = findViewById(R.id.platform);

        kills = findViewById(R.id.kills);
        killsPerMatch = findViewById(R.id.killsPerMatch);

        matchesPlayed = findViewById(R.id.matchesPlayed);
        damage = findViewById(R.id.damage);
        reviews = findViewById(R.id.revives);
        avatar = findViewById(R.id.imageView2);
        winningKills = findViewById(R.id.winningKills);
        sniperKills = findViewById(R.id.sniperKills);
        rankScore = findViewById(R.id.rankScore);

        progressBar = findViewById(R.id.progressbar);


        progressBar.setVisibility(View.INVISIBLE);

        Intent intent = getIntent();
        String dataString = intent.getStringExtra("search");
        service = networkService2.restService();
        HttpRequest4 request = new HttpRequest4(service, dataString);
        request.execute();
        playerName.setText(dataString);
    }
}
