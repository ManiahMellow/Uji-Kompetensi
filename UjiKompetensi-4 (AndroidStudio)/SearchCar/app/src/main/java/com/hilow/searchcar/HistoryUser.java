package com.hilow.searchcar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HistoryUser extends AppCompatActivity {

    RecyclerView recyclerView;
    HistoryUserAdapter adapter;
    List<HistoryUserModel> historyUserModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_user);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        load();
        isiData();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void load(){
        recyclerView = findViewById(R.id.rcvHistoryUser);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData(){
        historyUserModels = new ArrayList<HistoryUserModel>();

        historyUserModels.add(new HistoryUserModel("Toyota", "Agya", "16 - 02 - 2021", "19 - 02 - 2021", "1000000"));
        historyUserModels.add(new HistoryUserModel("Toyota", "Kijang Innova", "25 - 03 - 2021", "27 - 02 - 2021", "750000"));

        adapter = new HistoryUserAdapter(this, historyUserModels);
        recyclerView.setAdapter(adapter);

    }
}