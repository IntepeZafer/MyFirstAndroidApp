package com.zafer.myapplication;

import  androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // onClick Method Running
    public void changeImage(View view){
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.res);
    }
    public void changeImage2(View view){
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.res1);
    }
}