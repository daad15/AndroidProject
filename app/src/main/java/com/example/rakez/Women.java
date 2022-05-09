package com.example.rakez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class Women extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women);
    }

    public void go_menu(View V){
        Intent i = new Intent(this,Menu.class);
        startActivity(i);
        finish();
    }


    public void go_Wabaya(View V){
        Intent i = new Intent(this,women_abaya.class);
        startActivity(i);
        finish();
    }

    public void go_Wtop(View V){
        Intent i = new Intent(this,women_top.class);
        startActivity(i);
        finish();
    }

    public void go_Wpants(View V){
        Intent i = new Intent(this,women_pants.class);
        startActivity(i);
        finish();
    }

    public void go_Wbra(View V){
        Intent i = new Intent(this,women_bra.class);
        startActivity(i);
        finish();
    }

    public void go_Wbikini(View V){
        Intent i = new Intent(this,women_panties1.class);
        startActivity(i);
        finish();
    }

    public void go_Wbelt(View V){
        Intent i = new Intent(this,women_belt.class);
        startActivity(i);
        finish();
    }

    public void go_Wheels(View V){
        Intent i = new Intent(this,women_shoes.class);
        startActivity(i);
        finish();
    }

    public void go_Wpregnant(View V){
        Intent i = new Intent(this,women_maternity.class);
        startActivity(i);
        finish();
    }

    public void go_Wskirt(View V){
        Intent i = new Intent(this,women_skirt.class);
        startActivity(i);
        finish();
    }
    public void go_Wdress(View V){
        Intent i = new Intent(this,women_dress.class);
        startActivity(i);
        finish();
    }
    public void go_Wtights(View V){
        Intent i = new Intent(this,women_tight.class);
        startActivity(i);
        finish();
    }
    public void go_Wring(View V){
        Intent i = new Intent(this,women_ring.class);
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