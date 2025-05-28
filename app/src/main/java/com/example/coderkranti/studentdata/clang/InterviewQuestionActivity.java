package com.example.coderkranti.studentdata.clang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.RelativeLayout;

import com.example.coderkranti.R;

import java.util.ArrayList;
import java.util.List;

public class InterviewQuestionActivity extends AppCompatActivity {
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
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FInterview%20Ques%2Fc-programming-interview-questions.pdf?alt=media&token=5f7c8bc9-0e04-4454-a8de-87fb37b0e392"  ));

        ProductAdapter adapter=new ProductAdapter(InterviewQuestionActivity.this, productList);

        recyclerView.setAdapter(adapter);





    }

}