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

public class PointerFIle extends AppCompatActivity {
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
                        "Pointer in C",
                        60000,
                        R.drawable.c,
                       "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FPointers%2FPointers%20in%20C.pdf?alt=media&token=5bf99458-9fd3-423e-b695-9af3cedf4df4"
                        ));
        productList.add(
                new Product(
                        2,
                        "Declaring & Initializing",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FPointers%2FDeclaring%20a%20Pointer%20in%20C.pdf?alt=media&token=fbae7874-ba9a-444a-b140-0cdf57000f23"
                  ));
        productList.add(
                new Product(
                        3,
                        "Pointer to a pointer",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FPointers%2FPointer%20to%20a%20Pointer.pdf?alt=media&token=352fd044-b9c4-4c84-9d0d-c956d32efcfb"
                    ));
        productList.add(
                new Product(
                        4,
                        "Pointer to Array",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FPointers%2FPointer%20and%20Arrays.pdf?alt=media&token=a53aa9c5-2159-42b9-a0fc-c32bbbd38736"
                 ));
        productList.add(
                new Product(
                        5,
                        "Pointer to Structure",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FPointers%2FPointer%20to%20Array%20of%20Structures.pdf?alt=media&token=1048a11d-a932-49e4-8168-4e9dbffdce4c"
                 ));

        productList.add(
                new Product(
                        6,
                        "Pointer Arithmetic",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FPointers%2FPointer%20Arithmetic%20in%20C.pdf?alt=media&token=3a5541a7-00f2-414a-846d-ad10c2e1cd11"
                ));
        productList.add(
                new Product(
                        7,
                        "Pointer as Function",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FPointers%2FPointers%20as%20Function%20Argument.pdf?alt=media&token=6cfcce20-aee5-4c5f-8db3-48dc3a8dbf5c"
                 ));
        productList.add(
                new Product(
                        8,
                        "File Handling ",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FPointers%2FFile%20handling.pdf?alt=media&token=928851ad-c462-4d93-a453-73751c35e9b8"
                 ));
        productList.add(
                new Product(
                        9,
                        "Error Handling in C",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FPointers%2FError%20Handling.pdf?alt=media&token=2b2c7d65-a6c9-49b6-9819-cfc7cb0fc630"
                ));
        productList.add(
                new Product(
                        10,
                        "Dynamic Memory Allocation",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FPointers%2FDynamic%20Memory%20Allocation%20in%20C.pdf?alt=media&token=bbdd14b2-24f9-423c-8b21-8eef3bf7afac"
                  ));
        productList.add(
                new Product(
                        11,
                        "Command Line Argument",
                        60000,
                        R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FPointers%2FCommand%20Line%20Argument%20in%20C.pdf?alt=media&token=db435ca7-da5d-4dc3-bdab-6b8d89e60417"
                 ));





        ProductAdapter adapter=new ProductAdapter(PointerFIle.this, productList);

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
