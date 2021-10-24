package com.hilow.searchcar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class LoginAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.iconHome) {

            Intent intent = new Intent(LoginAdmin.this, LoginUser.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void btnLogin(View view) {
        Intent intent = new Intent(this, HomeAdmin.class);
        startActivity(intent);
    }
}