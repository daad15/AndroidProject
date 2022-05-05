package com.example.rakez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
// start
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//test fragments (Daad)
    public void call_menP(View V){
        Intent i = new Intent(this,men_pants.class);
        startActivity(i);
        finish();
    }
    public void call_menT(View V){
        Intent i = new Intent(this,men_top.class);
        startActivity(i);
        finish();
    }
}