package com.example.coderkranti.studentdata.clang;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coderkranti.R;

import java.util.ArrayList;
import java.util.List;

public class FunctionandStruct extends AppCompatActivity {
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
                        "Functions in C",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FFunctions%2FFunctions%20in%20C.pdf?alt=media&token=f9b6aa09-b750-4578-90e7-51b0a10d78f7"
                ));
        productList.add(
                new Product(
                        2,
                        "Types & Recursion",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FFunctions%2FTypes%20%26%20Recursion.pdf?alt=media&token=ee9114f7-95e5-4067-9a3a-7fb79a3fdce4"
                ));
        productList.add(
                new Product(
                        3,
                        "Types of Function calls",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FFunctions%2FTypes%20of%20Function%20calls.pdf?alt=media&token=d15883aa-fdbf-4d77-acda-111b97041b17"
                ));
        productList.add(
                new Product(
                        4,
                        "Passing Array to function",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FFunctions%2FPassing%20Array%20to%20a%20Function.pdf?alt=media&token=340e4574-86b3-45d9-b04d-2600b1e3c271"
                ));
        productList.add(
                new Product(
                        5,
                        "Structure in C",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FFunctions%2FStructure%20in%20C.pdf?alt=media&token=9e818bb3-662b-4d7c-bcb1-39494152ba5a"
                 ));

        productList.add(
                new Product(
                        6,
                        "typedef in C",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FFunctions%2Ftypedef.pdf?alt=media&token=19268cf7-1599-4736-b9db-1b1cab679703"
                 ));
        productList.add(
                new Product(
                        7,
                        "Unions in C",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FFunctions%2FUnions%20in%20C.pdf?alt=media&token=5ba67c45-5e28-4013-8484-1def01d733d4"
                ));





        ProductAdapter adapter=new ProductAdapter(FunctionandStruct.this, productList);

        recyclerView.setAdapter(adapter);
        setListViewAnimation(recyclerView);

    }
    private void setListViewAnimation(RecyclerView recyclerView) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.list_item_animation);

        animation.setDuration(200);
        // Use LayoutAnimationController to apply the animation to each item in the ListView
        LayoutAnimationController controller = new LayoutAnimationController(animation, 0.5f);
        recyclerView.setLayoutAnimation(controller);

        // Enable animation for each view within the ListView
        recyclerView.scheduleLayoutAnimation();
    }
}
