package com.example.fragmentnew.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.fragmentnew.R;
import com.example.fragmentnew.domain.Data;
import com.example.fragmentnew.service.HttpRequest;
import com.example.fragmentnew.service.NetworkService;
import com.example.fragmentnew.service.RestService;

import org.w3c.dom.Text;

public class DashboardFragment extends Fragment {
    public static SearchView search;
    public static TextView data;
    private View view;
    private final NetworkService networkService = NetworkService.getInstance();


    private RestService service;
    public Data dataObject;

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        service = networkService.restService();


        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        view = inflater.inflate(R.layout.fragment_dashboard, container, false);


        search = view.findViewById(R.id.searchView);
        data = view.findViewById(R.id.textView4);

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