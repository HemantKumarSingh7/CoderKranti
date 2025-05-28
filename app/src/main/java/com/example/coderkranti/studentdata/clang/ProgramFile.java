package com.example.coderkranti.studentdata.clang;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ListView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coderkranti.R;

import java.util.ArrayList;
import java.util.List;

public class ProgramFile extends AppCompatActivity {

    List<Product> productList;
    RecyclerView recyclerView;

    // int[] arr2 ={R.drawable.c};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.list_item_animation);

        RelativeLayout relativeLayout = findViewById(R.id.rl);
        relativeLayout.startAnimation(animation);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList = new ArrayList<>();

        productList.add(
                new Product(
                        1,
                        "Program List",
                        60000,
                        R.drawable.c,
                        " https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FPrograms%2FC%20Programs%20for%20Practices.pdf?alt=media&token=0ce6b683-2da8-4531-ab80-9a1a0a799495"));
        ProductAdapter adapter = new ProductAdapter(ProgramFile.this, productList);

        recyclerView.setAdapter(adapter);



    }

}
