package com.example.rakez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class men_underwear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men_underwear);
    }

    public void go_menu(View V){
        Intent i = new Intent(this,Menu.class);
        startActivity(i);
        finish();
    }
}