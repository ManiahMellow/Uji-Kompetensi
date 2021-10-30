package com.hilow.searchcar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

            Intent intent = new Intent(MainActivity.this, ProfilUser.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.iconHistory){

            Intent intent = new Intent(MainActivity.this, HistoryUser.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    public void btnToyota(View view) {
        Intent intent = new Intent(this, ListToyota.class);
        startActivity(intent);
    }

    public void btnHonda(View view) {
        Intent intent = new Intent(this, ListHonda.class);
        startActivity(intent);
    }

    public void btnDaihatsu(View view) {
        Intent intent = new Intent(this, ListDaihatsu.class);
        startActivity(intent);
    }
}