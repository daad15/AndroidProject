package com.example.rakez;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class men_pants extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men_pants);

        tabLayout = findViewById(R.id.menpants_tab);
        viewPager = findViewById(R.id.menpants_tab_viewpage);

        tabLayout.setupWithViewPager(viewPager);
        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new menPants_r(),"المقاسات");
        vpAdapter.addFragment(new menPants_l(), "المقاسات الطويلة");
        vpAdapter.addFragment(new menPants_s(),"المقاسات القصيرة");
        viewPager.setAdapter(vpAdapter);

    }

    public void go_menu(View V){
        Intent i = new Intent(this,Menu.class);
        startActivity(i);
        finish();
    }

    public void go_pants_r(View V){
        Intent i = new Intent(this,menPants_r.class);
        startActivity(i);
        finish();
    }

    public void go_pants_l(View V){
        Intent i = new Intent(this,menPants_l.class);
        startActivity(i);
        finish();
    }

    public void go_pants_s(View V){
        Intent i = new Intent(this,menPants_s.class);
        startActivity(i);
        finish();
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            Intent intent = new Intent(this,
                    men.class);
            startActivity(intent);
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}