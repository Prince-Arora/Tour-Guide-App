package com.example.laptop.patialatourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by LAPTOP on 28-05-2017.
 */

public class PatialaAdapter extends ArrayAdapter<custom> {

    private Context mContext;

    public PatialaAdapter(Context context, ArrayList<custom> t) {
        super(context, 0, t);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        custom tourItem = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        TextView titleTextView = (TextView) convertView.findViewById(R.id.name);
        TextView descTextView = (TextView) convertView.findViewById(R.id.place);
        imageView.setImageResource(tourItem.getId());
        titleTextView.setText(tourItem.getName());
        descTextView.setText(tourItem.getplace());
        return convertView;
    }
}


