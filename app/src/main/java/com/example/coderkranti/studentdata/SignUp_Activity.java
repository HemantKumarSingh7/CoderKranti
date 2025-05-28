package com.example.coderkranti.studentdata;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.coderkranti.Login_Activity;
import com.example.coderkranti.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class SignUp_Activity extends AppCompatActivity {

    TextView SignText ,loginRedirectText;
    EditText name,email,contactNo,password,confirmpass;
    Button signupbtn;

    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        firebaseAuth=FirebaseAuth.getInstance();

        loginRedirectText=findViewById(R.id.loginRedirectText);
        SignText=findViewById(R.id.SignText);
        name=findViewById(R.id.nametext);
        email=findViewById(R.id.emailtext);
        contactNo=findViewById(R.id.phonetext);
        password=findViewById(R.id.passwordtext);
        confirmpass=findViewById(R.id.confirmpassowrd);
        signupbtn=findViewById(R.id.Signup_btn);


        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignUp_Activity.this, Login_Activity.class);
                startActivity(intent);
            }
        });
        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });
    }
    private void signUp(){
        String name1=name.getText().toString().trim();
        String email1=email.getText().toString().trim();
        String pass1=password.getText().toString().trim();
        String confirmpass1=confirmpass.getText().toString().trim();

        if (TextUtils.isEmpty(name1)) {
            name.setError("Name cannot be empty");
            return;
        }else {
            name.setError(null);
        }
        if(TextUtils.isEmpty(email1)){
            email.setError("Email cannot be empty");
            return;
        }else {
            email.setError(null);
        }
        if(TextUtils.isEmpty(pass1)) {
            password.setError("Password cannot be empty");
            return;
        }else {
            password.setError(null);
        }
        if(TextUtils.isEmpty(confirmpass1)){
            confirmpass.setError("Password cannot be empty");
            return;
        }else {
            confirmpass.setError(null);
        }
        if (!pass1.equals(confirmpass1)){
            confirmpass.setError("Check Your Password");
            return;
        }else {
            confirmpass.setError(null);
        }

        firebaseAuth.createUserWithEmailAndPassword(email1,pass1)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(SignUp_Activity.this,"Sign up successful",Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(SignUp_Activity.this, Login_Activity.class);
                            startActivity(intent);
                    }else{
                            Toast.makeText(SignUp_Activity.this,"Authentication failed:" +task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                    }

                }

                });



    }
}