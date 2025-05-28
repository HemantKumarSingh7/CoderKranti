package com.example.coderkranti.studentdata.clang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.coderkranti.R;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Item> {
    ArrayList langlist=new ArrayList<>();


    public MyAdapter(@NonNull Context context, int resource, ArrayList<Item> objects) {
        super(context, resource, objects);

        langlist=objects;

    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v= convertView;
        LayoutInflater inflater=(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v= inflater.inflate(R.layout.card_data,null);

        TextView textView1=v.findViewById(R.id.heading);
        ImageView imageView=v.findViewById(R.id.imageView);
        TextView textView2=v.findViewById(R.id.detail);

        Item item=getItem(position);
        textView1.setText(item.getLanglist());
        imageView.setImageResource(item.getImagelist());
        textView2.setText(item.getLanglist2());
        return v;

    }
}
