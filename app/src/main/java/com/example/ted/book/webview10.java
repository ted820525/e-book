package com.example.ted.book;

import android.content.SharedPreferences;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class webview10 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview10);

        final WebView webview9;
        webview9=(WebView) findViewById(R.id.webview10);
        webview9.getSettings().setJavaScriptEnabled(true);
        webview9.loadUrl("https://www.google.com.tw/webhp?hl=zh-TW&ictx=2&sa=X&ved=0ahUKEwjZzOO44ujbAhWCE4gKHVh9B0EQPQgD");
    }
}

