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

public class MainActivity2 extends AppCompatActivity {

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
                         " Overview of C Language",
                         60000,
                         R.drawable.c,
                         "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FC%20Basics%2FOverview%20of%20C%20Language.pdf?alt=media&token=c059a94c-b9f3-49aa-8da5-7e58550f8792"
                 ));
         productList.add(
         new Product(
                 2,
                 " Frist C Program",
                 60000,
                 R.drawable.c,
                 "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FC%20Basics%2FFirst%20C%20Program.pdf?alt=media&token=c73f57e1-18d9-4bb9-b9b4-f634573ed9d1"
         ));
         productList.add(
                 new Product(
                         3,
                         " Compile and Run C Program",
                         60000,
                         R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FC%20Basics%2FCompile%20and%20Run%20C%20Program.pdf?alt=media&token=10ec5bd0-2124-4a6c-855f-05898e21a92d"
                         ));
         productList.add(
                 new Product(
                         4,
                         " Basic Syntax Rules",
                         60000,
                         R.drawable.c,
                         "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FC%20Basics%2FBasic%20Syntax%20Rules.pdf?alt=media&token=92051240-0542-4c88-893d-e4fc36d8db49"
                  ));
         productList.add(
                 new Product(
                         5,
                         " Keywords and Identifier",
                         60000,
                         R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FC%20Basics%2FKeyword%20%26%20Identifier.pdf?alt=media&token=d3966a9a-abb9-485a-85a5-ca335212dd4e"
                  ));

         productList.add(
                 new Product(
                         6,
                         " Operators",
                         60000,
                         R.drawable.c,
                         "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FC%20Basics%2FOperators.pdf?alt=media&token=f60ab6ee-69c1-45f8-b171-3bbdb66103ec"
                  ));
         productList.add(
                 new Product(
                         7,
                         " Data Types in C",
                         60000,
                         R.drawable.c,
                         "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FC%20Basics%2FData%20types%20in%20C.pdf?alt=media&token=0871188b-fff4-44fd-9527-16890fc7d739"
                 ));
         productList.add(
                 new Product(
                         8,
                         " Variables in C",
                         60000,
                         R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FC%20Basics%2FVariables%20in%20C.pdf?alt=media&token=37fa8143-0e02-4c68-a93e-0e7e0ef7fc33"
                   ));
         productList.add(
                 new Product(
                         9,
                         " C Input and Output",
                         60000,
                         R.drawable.c,
                         "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FC%20Basics%2FC%20Input%20and%20Output.pdf?alt=media&token=90201fa6-4116-4b76-8607-216756cf3972"
                  ));
         productList.add(
                 new Product(
                         10,
                         " Decision making in C",
                         60000,
                         R.drawable.c,
                         "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FC%20Basics%2FDecision%20making%20in%20C.pdf?alt=media&token=77d6334f-e1ec-4aee-8de0-480144d2e3a2"
                  ));
         productList.add(
                 new Product(
                         11,
                         " Switch statement in C",
                         60000,
                         R.drawable.c,
                         "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FC%20Basics%2FSwitch%20statement%20in%20C.pdf?alt=media&token=0285c50a-38f4-422a-9d2a-d713e8fa356b"
                  ));
         productList.add(
                 new Product(
                         12,
                         "Loops in C",
                         60000,
                         R.drawable.c,
                        "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FC%20Basics%2FLoops%20in%20C.pdf?alt=media&token=907d07ac-662b-421d-beab-5018a22d2d58"
                   ));
         productList.add(
                 new Product(
                         13,
                         "Arrays in C",
                         60000,
                         R.drawable.c,
                         "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FC%20Basics%2FArrays%20in%20C.pdf?alt=media&token=74d1eed7-cdb4-4ad2-9186-a1a6a5de9f7a"
                  ));
         productList.add(
                 new Product(
                         14,
                         "String and Character Array",
                         60000,
                         R.drawable.c,
                         "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FC%20Basics%2FString%20and%20Character%20Array.pdf?alt=media&token=4768c749-4983-4c95-a342-1adfd19003d6"
                  ));
         productList.add(
                 new Product(
                         15,
                         "Storage classes in C",
                         60000,
                         R.drawable.c,
                         "https://firebasestorage.googleapis.com/v0/b/coderkranti-16bd3.appspot.com/o/C%2FC%20Basics%2FStorage%20classes%20in%20C.pdf?alt=media&token=e8c496a5-7859-4eec-bbd8-ee6d29aaa005"
                  ));





         ProductAdapter adapter=new ProductAdapter(MainActivity2.this, productList);

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
