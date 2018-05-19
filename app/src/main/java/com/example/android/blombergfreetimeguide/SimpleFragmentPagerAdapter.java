package com.example.android.blombergfreetimeguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Michaela on 16.05.2018.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
        public SimpleFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }


    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new PlaygroundsFragment();
        } else if (position == 1){
            return new SportsFieldsFragment();
        } else if (position == 2){
            return new PoolsAndGymsFragment();
        } else {
            return new OtherSportsPlacesFragment();
        }
    }

      @Override
    public int getCount() {
        return 4;
    }

      @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Play-grounds";
        } else if (position == 1){
            return "Sports Fields";
        } else if (position == 2){
            return "Pools and Gyms";
        } else {
            return "Other Places";
        }
    }
}
