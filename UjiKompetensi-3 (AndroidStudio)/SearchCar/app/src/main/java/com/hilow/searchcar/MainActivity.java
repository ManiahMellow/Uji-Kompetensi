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

        return super.onOptionsItemSelected(item);
    }

//    public void cobaSewa(View view) {
//        Intent intent = new Intent(this, DetailSewa.class);
//        startActivity(intent);
//    }

    public void btnToyota(View view) {
        Intent intent = new Intent(this, ListToyota.class);
        startActivity(intent);
    }

    public void btnHonda(View view) {
        Intent intent = new Intent(this, ListHonda.class);
        startActivity(intent);
    }
}