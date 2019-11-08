package com.example.ted.book;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.ted.book.R.id.fab;

public class webview8 extends AppCompatActivity {
  FloatingActionButton fab;

  boolean isOpen;
    private View view;


    Button button;
    EditText editText2;


    private boolean isShowOrNot = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview8);
      fab=(FloatingActionButton)findViewById(R.id.fab);
        editText2= (EditText) findViewById(R.id.editText2);
        button =(Button)findViewById(R.id.button);
        FloatingActionButton mFloatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (isShowOrNot == false) {
                    editText2.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                    isShowOrNot = true;
                }else {
                    editText2.setVisibility(View.INVISIBLE);
                    button.setVisibility(View.INVISIBLE);
                    isShowOrNot = false;

                }
            }
        });

        final WebView webview8;
        webview8=(WebView) findViewById(R.id.webview8);
        webview8.getSettings().setJavaScriptEnabled(true);
        webview8.loadUrl("https://sites.google.com/view/ted820525/%E9%A6%96%E9%A0%81/%E9%BD%8A%E8%AB%96%E8%AA%9E-%E7%9F%A5%E9%81%93%E7%AF%87");
    }
}
