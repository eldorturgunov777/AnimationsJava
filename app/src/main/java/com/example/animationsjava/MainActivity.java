package com.example.animationsjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews() {
        img = findViewById(R.id.img);
        Button bounce = findViewById(R.id.bt_bounce);
        Button sequential = findViewById(R.id.bt_sequential);
        Button togather = findViewById(R.id.bt_togather);
        bounce.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
            img.startAnimation(animation);
        });
        sequential.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential);
            img.startAnimation(animation);
        });
        togather.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.togather);
            img.startAnimation(animation);
        });
    }
}