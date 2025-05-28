package com.example.coderkranti.studentdata.javalang;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coderkranti.R;
import com.example.coderkranti.studentdata.clang.InterviewQuestionActivity;
import com.example.coderkranti.studentdata.clang.Product;
import com.example.coderkranti.studentdata.clang.ProductAdapter;

import java.util.ArrayList;
import java.util.List;

public class InterviewQuestionJava extends AppCompatActivity {
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
                        "Interview Questions",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/java%2Finterview%20question%2FJava%20Interview%20Questions%20and%20Answers%20with%20PDF.pdf?alt=media&token=16f9a474-a37c-4028-b01e-2b087d75a228"
                ));

        ProductAdapter adapter=new ProductAdapter(InterviewQuestionJava.this, productList);

        recyclerView.setAdapter(adapter);





    }
}
