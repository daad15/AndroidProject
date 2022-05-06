package com.example.rakez;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

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
}