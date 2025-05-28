package com.example.coderkranti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.coderkranti.admindata.AdminLoginActivity;

public class MainActivity extends AppCompatActivity {

    ImageView loginImg;
    Button adminbtn,studentbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginImg=findViewById(R.id.loginlogo);
        adminbtn=findViewById(R.id.admin_btn);
        studentbtn=findViewById(R.id.student_btn);
        adminbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, AdminLoginActivity.class);
                i.putExtra("user_type", "admin");
                startActivity(i);
                finish();
            }
        });

        studentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Login_Activity.class);
                intent.putExtra("user_type", "Student Login");
                startActivity(intent);
                finish();
            }
        });

    }
}