package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;


public class splash_screen extends AppCompatActivity {

    ImageView mainlogo;
    TextView heading,slogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mainlogo = findViewById(R.id.logo);
        heading = findViewById(R.id.Title);
        slogan = findViewById(R.id.slogan);



        mainlogo.animate().translationX(-2500).setDuration(4000).setStartDelay(1000);
        heading.animate().translationX(2500).setDuration(4000).setStartDelay(1000);
        slogan.animate().translationX(2500).setDuration(4000).setStartDelay(1000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splash_screen.this,Product_activity.class));
            }
        },3300);
    }
}