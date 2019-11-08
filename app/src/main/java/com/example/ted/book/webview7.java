package com.example.ted.book;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class webview7 extends AppCompatActivity {


    FloatingActionButton fb1,fb2,fb3;
    Button button;
    EditText editText2;
    private boolean isShowOrNot = false;
   boolean isOpen=false;

    EditText et_key;
    TextView tv_position;
    Button btn_pre;
    Button btn_next;
    WebView webview;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview7);

       fb1 =(FloatingActionButton) findViewById(R.id.fb1);
        fb2 =(FloatingActionButton) findViewById(R.id.fb2);
        fb3 =(FloatingActionButton) findViewById(R.id.fb3);
        editText2= (EditText) findViewById(R.id.editText2);
        button =(Button)findViewById(R.id.button);

      fb1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if(isOpen)
              {
                  fb2.setVisibility(View.VISIBLE);
                  fb3.setVisibility(View.VISIBLE);
                  isOpen=true;
              }
              else
              {
                  fb2.setVisibility(View.INVISIBLE);
                  fb3.setVisibility(View.INVISIBLE);
                  isOpen=false;
              }
          }
      });
       fb3.setOnClickListener(new View.OnClickListener() {
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
        {

            final WebView webview7;
            webview7 = (WebView) findViewById(R.id.webview7);
            webview7.getSettings().setJavaScriptEnabled(true);

            webview7.loadUrl("https://sites.google.com/view/ted820525/%E9%A6%96%E9%A0%81/%E8%8B%B1%E6%96%87%E7%BF%BB%E8%AD%AF");
        }
    }

}
