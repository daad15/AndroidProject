package com.example.rakez;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class women_skirt extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women_skirt);
        tabLayout = findViewById(R.id.womenskirt_tab);
        viewPager = findViewById(R.id.womenskirt_viewpage);

        tabLayout.setupWithViewPager(viewPager);
        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new women_skirt_r(),"المقاسات");
        vpAdapter.addFragment(new women_skirt_l(), "المقاسات الطويلة");
        vpAdapter.addFragment(new women_skirt_s(),"المقاسات القصيرة");
        viewPager.setAdapter(vpAdapter);
    }
}