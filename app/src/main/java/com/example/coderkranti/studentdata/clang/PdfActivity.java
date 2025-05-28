package com.example.coderkranti.studentdata.clang;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.coderkranti.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.shockwave.pdfium.PdfDocument;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


public class PdfActivity extends AppCompatActivity   {

    PDFView pdfView;
    String link="", productList="", product="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        product=getIntent().getStringExtra("title");
        productList=getIntent().getStringExtra("productList");
        link=getIntent().getStringExtra("link");

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        ActionBar actionBar1 = getSupportActionBar();
        if (actionBar1 != null) {
            actionBar1.setDisplayShowHomeEnabled(true);
        }

        ActionBar actionBar3 = getSupportActionBar();
        if (actionBar3 != null) {
            actionBar3.setTitle(productList);
        }


        pdfView = findViewById(R.id.pdfView);

        if (isConnected())
        {
            Toast.makeText(getApplicationContext(),"Internet Connected", Toast.LENGTH_SHORT).show();

        }else {
            Toast.makeText(getApplicationContext(),"No Internet Connection",Toast.LENGTH_SHORT).show();
            AlertDialog.Builder builder=new AlertDialog.Builder(PdfActivity.this);
            builder.setTitle("NoInternet Connection Alert")
                    .setMessage("Go to Setting?")
                    .setCancelable(false)
                    .setPositiveButton("yes", (dialog, which)->{
                        startActivity(new Intent(Settings.ACTION_WIRELESS_SETTINGS));
                    })
                    .setNegativeButton("No", (dialog, which)->{
                        Toast.makeText(PdfActivity.this, "GO Back to HomePage!", Toast.LENGTH_SHORT).show();
                    });

            AlertDialog dialog=builder.create();
            dialog.show();

        }
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            link=getIntent().getStringExtra("link");

        }
        new PdfActivity.RetrievePDFStream().execute(link);

    }
    public boolean isConnected(){
        boolean connected = false;

        try {
            ConnectivityManager cm= (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo nInfo=cm.getActiveNetworkInfo();
            connected = nInfo !=null && nInfo.isAvailable() && nInfo.isConnected();
            return connected;
        } catch (Exception e){
            Log.e("Connectivity Exception", e.getMessage());
        }
        return connected;
    }

    class RetrievePDFStream extends AsyncTask<String, Void, InputStream>{
        ProgressDialog progressDialog;
        protected  void onPreExecute()
        {
            progressDialog=new ProgressDialog(PdfActivity.this);
            progressDialog.setTitle("getting the book content....");
            progressDialog.setMessage("Please wait...");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();
        }

        protected  InputStream doInBackground(String... strings){
            InputStream inputStream=null;

            try{
                URL urlx=new URL(strings[0]);
                HttpURLConnection urlConnection=(HttpURLConnection) urlx.openConnection();
                if(urlConnection.getResponseCode()==200){
                    inputStream=new BufferedInputStream(urlConnection.getInputStream());
                }
            }catch (IOException e){
                return null;
            }
            return inputStream;
        }
        protected  void onPostExecute(InputStream inputStream){
            pdfView.fromStream(inputStream).load();
            progressDialog.dismiss();
        }
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==android.R.id.home){
            onBackPressed();
            return true;
        }
        return false;
    }

    }
