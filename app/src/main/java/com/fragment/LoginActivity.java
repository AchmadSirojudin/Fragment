package com.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void menu_activity(View view) {
       test();
    }

    public void test(){
        Intent LoginMenu = new Intent(LoginActivity.this, MainActivity.class);
        Toast.makeText(LoginActivity.this,"Login Berhasil",Toast.LENGTH_SHORT).show();
        startActivity(LoginMenu);
    }
}