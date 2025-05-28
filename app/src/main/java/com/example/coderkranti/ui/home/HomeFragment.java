package com.example.coderkranti.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.coderkranti.CustomAdapter;
import com.example.coderkranti.R;
import com.example.coderkranti.studentdata.android.ItemActivityAndroidLang;
import com.example.coderkranti.studentdata.clang.Item_Activity;
import com.example.coderkranti.studentdata.css.ItemActivitycssLang;
import com.example.coderkranti.studentdata.html.ItemActivityhtmlLang;
import com.example.coderkranti.studentdata.javalang.ItemActivityJavaLang;
import com.example.coderkranti.studentdata.python.ItemActivityPython;
import com.example.coderkranti.studentdata.xml.ItemActivityXmlLang;

public class HomeFragment extends Fragment {

    private final int[] imageResources = {
            R.drawable.cprogramming,
            R.drawable.java,
            R.drawable.androidic,
            R.drawable.xml,
            R.drawable.python,
            R.drawable.html,
            R.drawable.css
    };

    private GridView gridView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        gridView = root.findViewById(R.id.gridview);

        final TextView textView = root.findViewById(R.id.textView2);
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        CustomAdapter customAdapter = new CustomAdapter(imageResources, requireContext());
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener((adapterView, view, i, l) -> {

            switch (i) {
                case 0:
                Intent intent = new Intent(requireActivity(), Item_Activity.class);
                startActivity(intent);
                break;

                case 1:
                    Intent intent1=new Intent(requireActivity(), ItemActivityJavaLang.class);
                    startActivity(intent1);
                    break;
                case 2:
                    Intent intent2=new Intent(requireActivity(), ItemActivityAndroidLang.class);
                    startActivity(intent2);
                    break;
                case 3:
                    Intent intent3=new Intent(requireActivity(), ItemActivityXmlLang.class);
                    startActivity(intent3);
                    break;
                case 4:
                    Intent intent4=new Intent(requireActivity(), ItemActivityPython.class);
                    startActivity(intent4);
                    break;
                case 5:
                    Intent intent5=new Intent(requireActivity(), ItemActivityhtmlLang.class);
                    startActivity(intent5);
                    break;
                case 6:
                    Intent intent6=new Intent(requireActivity(), ItemActivitycssLang.class);
                    startActivity(intent6);
                    break;

            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
