package com.example.laptop.patialatourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view);
        FragmentPagerAdapter prince =
                new Patiala2Adapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(prince);


        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}