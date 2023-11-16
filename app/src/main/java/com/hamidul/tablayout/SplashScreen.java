package com.hamidul.tablayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.widget.ProgressBar;
import android.widget.Space;

public class SplashScreen extends AppCompatActivity {
    ProgressBar progressBar;
    SharedPreferences sharedPreferences;
    public boolean splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        progressBar = findViewById(R.id.progressBar);

        sharedPreferences = getSharedPreferences(getString(R.string.app_name), MODE_PRIVATE);

        splash = sharedPreferences.getBoolean("splash",false);

        if (splash){
            startSplashScreen();
        }else {
            startSplashScreen();
        }

    }

    private void startSplashScreen (){
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(SplashScreen.this,MainActivity.class));
                finish();

            }
        },100);
    }




}