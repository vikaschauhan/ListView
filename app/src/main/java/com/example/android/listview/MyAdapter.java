package com.example.android.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by admin on 27/02/2018.
 */

public class MyAdapter extends ArrayAdapter<String> {
    public MyAdapter(@NonNull Context context, String[] values) {
        super(context, R.layout.row_layout_2, values);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View theView = theInflater.inflate(R.layout.row_layout_2, parent, false);

        String tvShow = getItem(position);

        TextView theTextView = (TextView) theView.findViewById(R.id.textView1);

        theTextView.setText(tvShow);

        ImageView theImageView = (ImageView) theView.findViewById(R.id.imageView1);

        theImageView.setImageResource(R.drawable.ic_check_circle_black_24dp);

        return theView;
    }
}
