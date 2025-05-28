package com.example.coderkranti;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {
    private int[] arr1;
    private Context context;
    private LayoutInflater inflater;
    private ImageView imageView;

    public CustomAdapter(int[] arr1, Context context) {
        this.arr1 = arr1;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arr1.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.filepage, null);
        imageView = view.findViewById(R.id.imageView);
        imageView.setImageResource(arr1[position]);
        return view;
    }


}
