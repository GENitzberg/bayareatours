package com.example.bayareatours_fragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class NewFragmentPagerAdapter extends FragmentPagerAdapter {
    public NewFragmentPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EventsFragment();
        } else if (position == 1){
            return new HikingFragment();
        } else if (position == 2){
            return new ParksFragment();
        }
        else {
            return new RestaurantFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
