package com.example.crowds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openMap(View v){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
    public void Report(View v){
        Intent intent = new Intent( this, ReportActivity.class); startActivity(intent);

    }

    public void clear(View v){
        Intent intent = new Intent( this, Clear.class); startActivity(intent);
    }

    public void emergency(View v){
        //code for calling emergency number
    }

}