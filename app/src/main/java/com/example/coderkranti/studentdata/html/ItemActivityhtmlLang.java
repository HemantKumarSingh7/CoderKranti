package com.example.coderkranti.studentdata.html;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.coderkranti.R;
import com.example.coderkranti.studentdata.clang.Item;
import com.example.coderkranti.studentdata.clang.MyAdapter;
import com.example.coderkranti.studentdata.javalang.CompilerJava;
import com.example.coderkranti.studentdata.javalang.InterviewQuestionJava;
import com.example.coderkranti.studentdata.javalang.NotesJavaActivity;
import com.example.coderkranti.studentdata.javalang.ProgramJavaFile;

import java.util.ArrayList;

public class ItemActivityhtmlLang extends AppCompatActivity {
    private GridView gridView;
    ArrayList langlist=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        gridView=findViewById(R.id.gridview);
        langlist.add(new Item("Html Notes",R.drawable.c,"Learn step by step "));
        langlist.add(new Item("Programs",R.drawable.programs,"programs codes"));
        langlist.add(new Item("Code Compiler",R.drawable.codecompiler,"Code write here"));
        langlist.add(new Item("Interview Questions",R.drawable.jobinterview,"Asking in IT companies"));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:

                        Intent intent = new Intent(getApplicationContext(), NoteshtmlActivity.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1=new Intent(getApplicationContext(), ProgramhtmlFile.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), Compilerhtml.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), InterviewQuestionhtml.class);
                        startActivity(intent3);
                        break;


                }
            }
        });
        MyAdapter myAdapter=new MyAdapter(this, R.layout.card_data,langlist);
        gridView.setAdapter(myAdapter);

    }
}
