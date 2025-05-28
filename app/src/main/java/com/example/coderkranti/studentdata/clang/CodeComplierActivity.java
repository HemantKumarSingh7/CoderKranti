package com.example.coderkranti.studentdata.clang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;

import android.webkit.WebView;


import com.example.coderkranti.R;


public class CodeComplierActivity extends AppCompatActivity {
    private static final String TAG = "CodeComplierActivity";
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_complier);

        webView = findViewById(R.id.webView);
        WebView webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.tutorialspoint.com/compile_c_online.php");

    }
}