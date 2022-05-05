package com.example.rakez;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class VPAdapter extends FragmentPagerAdapter {

    private final ArrayList<Fragment> mentop_list = new ArrayList<>();
    private final ArrayList<String> mentop_title = new ArrayList<>();



    public VPAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mentop_list.get(position) ;
    }

    @Override
    public int getCount() {
        return mentop_list.size();
    }

    public void addFragment(Fragment fragment, String title){
        mentop_list.add(fragment);
        mentop_title.add(title);

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mentop_title.get(position);
    }
}
