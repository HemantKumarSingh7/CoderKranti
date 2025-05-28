package com.example.coderkranti.studentdata.xml;

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

import java.util.ArrayList;
import java.util.List;

public class InterviewQuestionXml extends AppCompatActivity {
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
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/Xml%2Finterview%20question%2Fxml-interview-questions1.pdf?alt=media&token=5fb3915a-1b72-440c-82c8-247bccd7b188"
                 ));

        ProductAdapter adapter=new ProductAdapter(InterviewQuestionXml.this, productList);

        recyclerView.setAdapter(adapter);





    }
}
