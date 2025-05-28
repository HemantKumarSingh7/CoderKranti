package com.example.coderkranti.studentdata.html;

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

public class NoteshtmlActivity extends AppCompatActivity {
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
                        "HTML Complete Notes",
                        60000,
                        R.drawable.c,
                      "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/html%2Fnotes%2FBeginners_Guide_to_HTML.pdf?alt=media&token=107d51e2-12b3-446c-aaec-beff8a362469"
                ));
        ProductAdapter adapter = new ProductAdapter(NoteshtmlActivity.this, productList);

        recyclerView.setAdapter(adapter);



    }







}
