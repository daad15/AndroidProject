package com.example.rakez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void go_main(View V){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }

    public void go_mySize(View V){
        Intent i = new Intent(this,mySize.class);
        startActivity(i);
        finish();
    }

    public void go_care(View V){
        Intent i = new Intent(this,care.class);
        startActivity(i);
        finish();
    }

    public void go_about(View V){
        Intent i = new Intent(this,aboutRakez.class);
        startActivity(i);
        finish();
    }

    public void go_contact(View V){
        Intent i = new Intent(this,contactUs.class);
        startActivity(i);
        finish();
    }

    public void go_logOut(View V){
        Intent i = new Intent(this,logout.class);
        startActivity(i);
        finish();
    }
}