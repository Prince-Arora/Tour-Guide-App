package com.example.laptop.patialatourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HospitalPatiala extends Fragment {
    public static final String NAME = "Hospitals";

    public HospitalPatiala() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hospital_patiala, container, false);
        ArrayList<custom> patiala = new ArrayList<>();
        patiala.add(new custom(getString(R.string.Hos1), getString(R.string.Hos2), R.drawable.rajindra));
        patiala.add(new custom(getString(R.string.Hos3), getString(R.string.Hos4), R.drawable.asia));
        ListView listView = (ListView) rootView.findViewById(R.id.hospital);
        PatialaAdapter pat = new PatialaAdapter(rootView.getContext(), patiala);
        listView.setAdapter(pat);
        return rootView;
    }
}
