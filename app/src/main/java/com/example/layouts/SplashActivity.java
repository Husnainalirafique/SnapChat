package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
       // In Activity's onCreate() for instance
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        Thread thread =new Thread()
        {
          public  void run()
          {
              try {
                      sleep(500);
                  }
              catch (Exception e) {
                      e.printStackTrace();
                  }
              finally {
                  Intent intent =new Intent(SplashActivity.this, MainActivity.class);
                  startActivity(intent);
              }
          }
        };thread.start();

    }
    }
