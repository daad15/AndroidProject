package com.example.rakez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class men extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men);
    }

    public void go_menu(View V){
        Intent i = new Intent(this,Menu.class);
        startActivity(i);
        finish();
    }

    public void go_Mthoub(View V){
        Intent i = new Intent(this,men_thoub.class);
        startActivity(i);
        finish();
    }

    public void go_Mtop(View V){
        Intent i = new Intent(this,men_top.class);
        startActivity(i);
        finish();
    }

    public void go_Mpants(View V){
        Intent i = new Intent(this,men_pants.class);
        startActivity(i);
        finish();
    }

    public void go_Munderwaer(View V){
        Intent i = new Intent(this,men_underwear.class);
        startActivity(i);
        finish();
    }

    public void go_Mshoes(View V){
        Intent i = new Intent(this,men_shoes.class);
        startActivity(i);
        finish();
    }

    public void go_Mbelt(View V){
        Intent i = new Intent(this,men_belt.class);
        startActivity(i);
        finish();
    }

    public void go_Mhat(View V){
        Intent i = new Intent(this,men_hat.class);
        startActivity(i);
        finish();
    }

    public void go_Mshemagh(View V){
        Intent i = new Intent(this,men_shemagh.class);
        startActivity(i);
        finish();
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            Intent intent = new Intent(this,
                    MainActivity.class);
            startActivity(intent);
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}