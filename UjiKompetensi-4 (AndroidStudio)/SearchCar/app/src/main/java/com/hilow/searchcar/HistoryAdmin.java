package com.hilow.searchcar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HistoryAdmin extends AppCompatActivity {

    RecyclerView recyclerView;
    HistoryAdminAdapter adapter;
    List<HistoryAdminModel> historyAdminModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_admin);

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
        recyclerView = findViewById(R.id.rcvHistoryAdmin);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData(){
        historyAdminModels = new ArrayList<HistoryAdminModel>();
        historyAdminModels.add(new HistoryAdminModel("Penyewa 1", "Jl.Mawar", "28 - 02 -2021", "02 - 03 - 2021", "Toyota", "Avanza", "750000"));
        historyAdminModels.add(new HistoryAdminModel("Penyewa 2", "Jl.Kamboja", "12 - 03 -2021", "14 - 03 - 2021", "Toyota", "Avanza", "750000"));
        historyAdminModels.add(new HistoryAdminModel("Penyewa 3", "Jl.Melati", "17 - 03 -2021", "19 - 03 - 2021", "Toyota", "Avanza", "750000"));
        historyAdminModels.add(new HistoryAdminModel("Penyewa 4", "Jl.Anggrek", "25 - 03 -2021", "27 - 03 - 2021", "Toyota", "Avanza", "750000"));


        adapter = new HistoryAdminAdapter(this, historyAdminModels);
        recyclerView.setAdapter(adapter);

    }
}