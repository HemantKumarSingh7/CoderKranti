package com.example.coderkranti.studentdata.clang;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.coderkranti.R;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] arr1;
   // int[] arr2;
    LayoutInflater inflater;

    public CustomAdapter(Context context, String[] arr1)
    {
        this.context=context;
        this.arr1=arr1;
      //  this.arr2=arr2;
        inflater=(LayoutInflater.from(context));
    }
    @Override
    public int getCount() {
        return arr1.length;
    }

    @Override
    public Object getItem(int position) {
        return arr1[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
      convertView=inflater.inflate(R.layout.resourse_item_listview,null);
        TextView textView=convertView.findViewById(R.id.title);
        ImageView icon=convertView.findViewById(R.id.icon);
        textView.setText(arr1[position]);
      //  icon.setImageResource(arr2[position]);


        return convertView;
    }
}
