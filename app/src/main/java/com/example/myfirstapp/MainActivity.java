package com.example.myfirstapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

       final Handler handler = new Handler();
       handler.postDelayed(new Runnable() {
           @Override
           public void run() {
               startActivity(new Intent(getApplicationContext(),HomeActivity.class ));
               finish();
           }
       }, 3000l);

    }
}
