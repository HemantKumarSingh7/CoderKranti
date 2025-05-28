package com.example.coderkranti.studentdata.android;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coderkranti.R;
import com.example.coderkranti.studentdata.clang.Product;
import com.example.coderkranti.studentdata.clang.ProductAdapter;
import com.example.coderkranti.studentdata.javalang.InterviewQuestionJava;

import java.util.ArrayList;
import java.util.List;

public class InterviewQuestionAndroid extends AppCompatActivity{

    List<Product> productList;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.list_item_animation);

        RelativeLayout relativeLayout = findViewById(R.id.rl);
        relativeLayout.startAnimation(animation);
        recyclerView=findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList=new ArrayList<>();

        productList.add(
                new Product(
                        1,
                        "Interview Questions ",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/android%2Finterviewquestion%2Fandroid-interview-questions1.pdf?alt=media&token=ad6d7247-fe64-4f12-916e-d94277dce381"
                           ));

        ProductAdapter adapter=new ProductAdapter(InterviewQuestionAndroid.this, productList);

        recyclerView.setAdapter(adapter);





    }

}
