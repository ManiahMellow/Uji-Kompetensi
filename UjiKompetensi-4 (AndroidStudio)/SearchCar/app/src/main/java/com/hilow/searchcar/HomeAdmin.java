package com.hilow.searchcar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class HomeAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_admin);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profil_menu, menu);
        getMenuInflater().inflate(R.menu.history_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.iconProfil) {

           Intent intent = new Intent(HomeAdmin.this, ProfilAdmin.class);
           startActivity(intent);
        }

        if (id == R.id.iconHistory){
           Intent intent = new Intent(HomeAdmin.this, HistoryAdmin.class);
           startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    public void btnTambahMobil(View view) {
        Intent intent = new Intent(this, TambahMobil.class);
        startActivity(intent);
    }

    public void btnUpdate(View view) {
        Intent intent = new Intent(this, UpdateMobil.class);
        startActivity(intent);
    }

    public void btnListMobil(View view) {
        Intent intent = new Intent(this, ListMobil.class);
        startActivity(intent);
    }
}