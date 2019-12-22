package com.example.fragmentnew.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.fragmentnew.R;
import com.example.fragmentnew.domain.Data;
import com.example.fragmentnew.service.GameInfoApi;
import com.example.fragmentnew.service.HttpRequest;
import com.example.fragmentnew.service.HttpRequest2;
import com.example.fragmentnew.service.NetworkService;
import com.example.fragmentnew.service.RestService;

import org.w3c.dom.Text;

public class DashboardFragment extends Fragment {
    public static SearchView search;
    public static TextView data;
    public static TextView description;
    public static RatingBar simpleRatingBar;
    public static ImageView imageView;
    private View view;
    //private final NetworkService networkService = NetworkService.getInstance();
    private final NetworkService networkService2 = NetworkService.getInstance("https://api.rawg.io/api/");


    private RestService service;
    private GameInfoApi service2;
    public Data dataObject;

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        service = networkService2.restService();
        service2 = networkService2.getGameApi();


        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        view = inflater.inflate(R.layout.fragment_dashboard, container, false);


        search = view.findViewById(R.id.searchView);
        data = view.findViewById(R.id.textView5);
        description = view.findViewById(R.id.textView4);
        simpleRatingBar = view.findViewById(R.id.ratingBar);
        imageView = view.findViewById(R.id.imageView2);
        HttpRequest2 request = new HttpRequest2(service2, "counter-strike-global-offensive");
        request.execute();
//        final TextView textView = root.findViewById(R.id.text_dashboard);
//        dashboardViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });


        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                HttpRequest request = new HttpRequest(service);
                request.execute();
                return false;
            }
            @Override
            public boolean onQueryTextChange(String text) {



                return false;
            }
        });

        return view;
    }
}