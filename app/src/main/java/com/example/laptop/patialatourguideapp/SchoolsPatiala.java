package com.example.laptop.patialatourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SchoolsPatiala extends Fragment {
    public static final String NAME = "Schools";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_schools_patiala, container, false);
        ArrayList<custom> t1 = new ArrayList<>();
        t1.add(new custom(getString(R.string.s1), getString(R.string.s2), R.drawable.gnf));
        t1.add(new custom(getString(R.string.s3), getString(R.string.s4), R.drawable.british));
        ListView listView = (ListView) rootView.findViewById(R.id.schools);
        PatialaAdapter pat = new PatialaAdapter(rootView.getContext(), t1);
        listView.setAdapter(pat);
        return rootView;
    }
}
