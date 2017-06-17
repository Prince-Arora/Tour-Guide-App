package com.example.laptop.patialatourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MallsPatiala extends Fragment {
    public static final String NAME = "Malls";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_malls_patiala, container, false);
        ArrayList<custom> t = new ArrayList<>();
        t.add(new custom(getString(R.string.Mall1), getString(R.string.Mall2), R.drawable.omaxe));
        ListView listView = (ListView) rootView.findViewById(R.id.mall);
        PatialaAdapter pat = new PatialaAdapter(rootView.getContext(), t);
        listView.setAdapter(pat);
        return rootView;
    }
}
