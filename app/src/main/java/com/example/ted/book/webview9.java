package com.example.ted.book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class webview9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview9);

        final WebView webview9;
        webview9=(WebView) findViewById(R.id.webview9);
        webview9.getSettings().setJavaScriptEnabled(true);
        webview9.loadUrl("https://sites.google.com/view/ted820525/%E9%A6%96%E9%A0%81/%E5%90%8D%E8%A8%80%E4%BD%B3%E5%8F%A5");
    }
}
