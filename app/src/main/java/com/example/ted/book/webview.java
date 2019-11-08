package com.example.ted.book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;

public class webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        final WebView webview;
        webview=(WebView) findViewById(R.id.webview1);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://sites.google.com/view/ted820525/%E9%A6%96%E9%A0%81");


    }
}


