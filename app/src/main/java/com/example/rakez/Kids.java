package com.example.rakez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class Kids extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids);
    }

    public void go_menu(View V){
        Intent i = new Intent(this,Menu.class);
        startActivity(i);
        finish();
    }
    public void go_beany(View V){
        Intent i = new Intent(this,baby_beany.class);
        startActivity(i);
        finish();
    }
    public void go_boys(View V){
        Intent i = new Intent(this,ch_boy.class);
        startActivity(i);
        finish();
    }
    public void go_girls(View V){
        Intent i = new Intent(this,ch_girl.class);
        startActivity(i);
        finish();
    }
    public void go_Bshoes(View V){
        Intent i = new Intent(this,ch_shoes.class);
        startActivity(i);
        finish();
    }
    public void go_onetoseven(View V){
        Intent i = new Intent(this,toddler.class);
        startActivity(i);
        finish();
    }
    public void go_newborn(View V){
        Intent i = new Intent(this,baby.class);
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