package com.example.appnofrag;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.appnofrag.service.GameInfoApi;
import com.example.appnofrag.service.HttpRequest2;
import com.example.appnofrag.service.NetworkService;

public class MainActivity extends AppCompatActivity {
    public static TextView gameName;
    public static ProgressBar progressBar;
    public static TextView gameDesc;
    public static RatingBar ratingBar;
    public static ImageView gameImage;
    public static Button submitButton;
    public static SearchView searchText;


    private final NetworkService networkService = NetworkService.getInstance("https://api.rawg.io/api/");
    private GameInfoApi service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameName = findViewById(R.id.tvResult);
        gameDesc = findViewById(R.id.description);
        progressBar = findViewById(R.id.progressbar);
        progressBar.setVisibility(View.INVISIBLE);
        ratingBar = findViewById(R.id.ratingBar2);
        gameImage = findViewById(R.id.imageView2);
        submitButton = findViewById(R.id.button);
        searchText = findViewById(R.id.searchView);



        service = networkService.getGameApi();
        HttpRequest2 request = new HttpRequest2(service, "counter-strike-global-offensive");
        request.execute();
        ratingBar.setMax(5);
        ratingBar.setStepSize(0.01f);
        ratingBar.invalidate();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }

    private void openNewActivity() {
        if (searchText.getQuery() == "" || searchText.getQuery().equals("")) {
            return;
        }
        Intent intent = null;
        if (gameName.getText().equals("Counter-Strike: Global Offensive")) {
             intent = new Intent(this, CsGoStatActivity.class);
        } else if (gameName.getText().equals("Apex Legends")) {
            intent = new Intent(this, ApexActivity.class);
        }
        assert intent != null;
        intent.putExtra("search", searchText.getQuery().toString());
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String str;
        if (item.getTitle().equals("Apex")) {
            str = "apex";
        } else if (item.getTitle().equals("CS:GO")) {
            str = "counter-strike-global-offensive";
        } else if (item.getTitle().equals("Overwatch")) {
            str = "overwatch";
        } else {
            str = "division-2";
        }
        HttpRequest2 request = new HttpRequest2(service, str);
        request.execute();
        return super.onOptionsItemSelected(item);
    }
}
