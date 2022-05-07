package com.example.rakez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class mySize extends AppCompatActivity {
    FloatingActionButton mcreatesizefab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_size);
        mcreatesizefab = findViewById(R.id.createsizefab);
        getSupportActionBar().setTitle("مقاساتي");
        mcreatesizefab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mySize.this,createSize.class));
            }
        });
    }
}