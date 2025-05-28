package com.example.coderkranti.studentdata.clang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.coderkranti.R;

import java.util.ArrayList;

public class Item_Activity extends AppCompatActivity {
    private GridView gridView;
    ArrayList langlist=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        gridView=findViewById(R.id.gridview);
        langlist.add(new Item("C Basics",R.drawable.c,"Learn step by step "));
        langlist.add(new Item("Functions & Structures",R.drawable.function,"C advanced concepts "));
        langlist.add(new Item("Pointers & files",R.drawable.file,"C advanced concepts"));
        langlist.add(new Item("Programs",R.drawable.programs,"C programs codes"));
        langlist.add(new Item("Code Compiler",R.drawable.codecompiler,"Code write here"));
        langlist.add(new Item("Interview Questions",R.drawable.jobinterview,"Asking in IT companies"));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:

                        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1=new Intent(getApplicationContext(), FunctionandStruct.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), PointerFIle.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), ProgramFile.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getApplicationContext(), CodeComplierActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5=new Intent(getApplicationContext(),InterviewQuestionActivity.class);
                        startActivity(intent5);
                        break;

                }
            }
        });
        MyAdapter myAdapter=new MyAdapter(this, R.layout.card_data,langlist);
        gridView.setAdapter(myAdapter);

    }
}