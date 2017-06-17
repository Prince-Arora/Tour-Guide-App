package com.example.laptop.patialatourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TemplesPatiala extends Fragment {
    public static final String NAME = "Temples";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_temples_patiala, container, false);
        ArrayList<custom> t = new ArrayList<>();
        t.add(new custom(getString(R.string.t1), getString(R.string.t2), R.drawable.kali2));
        t.add(new custom(getString(R.string.t3), getString(R.string.t4), R.drawable.guru1));
        ListView listView = (ListView) rootView.findViewById(R.id.temples);
        PatialaAdapter pat = new PatialaAdapter(rootView.getContext(), t);
        listView.setAdapter(pat);
        return rootView;
    }
}
