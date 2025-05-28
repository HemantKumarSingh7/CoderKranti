package com.example.coderkranti.studentdata.html;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.coderkranti.R;

public class Compilerhtml extends AppCompatActivity {
    private static final String TAG = "CodeComplierActivity";
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_complier);

        webView = findViewById(R.id.webView);
        WebView webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.tutorialspoint.com/online_html_editor.php");

    }
}
