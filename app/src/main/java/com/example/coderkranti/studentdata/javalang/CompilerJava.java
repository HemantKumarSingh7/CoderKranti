package com.example.coderkranti.studentdata.javalang;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.coderkranti.R;

public class CompilerJava extends AppCompatActivity {
    private static final String TAG = "CodeComplierActivity";
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_complier);

        webView = findViewById(R.id.webView);
        WebView webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.programiz.com/java-programming/online-compiler/");

    }
}
