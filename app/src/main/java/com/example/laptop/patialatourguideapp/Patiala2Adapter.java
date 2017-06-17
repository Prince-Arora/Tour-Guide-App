package com.example.laptop.patialatourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class Patiala2Adapter extends FragmentPagerAdapter {
    private String tabs[] = new String[]{HospitalPatiala.NAME, SchoolsPatiala.NAME, MallsPatiala.NAME, TemplesPatiala.NAME};
    private Context mContext;

    public Patiala2Adapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int pos) {
        Fragment fragment = null;
        switch (pos) {
            case 0:
                fragment = Fragment.instantiate(mContext, HospitalPatiala.class.getName());
                break;
            case 1:
                fragment = Fragment.instantiate(mContext, SchoolsPatiala.class.getName());
                break;
            case 2:
                fragment = Fragment.instantiate(mContext, MallsPatiala.class.getName());
                break;
            case 3:
                fragment = Fragment.instantiate(mContext, TemplesPatiala.class.getName());
                break;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabs[position];
    }
}
