package com.example.ted.book;

import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class webview2 extends AppCompatActivity {

    FloatingActionButton fab;

    boolean isOpen;
    private View view;
    private boolean isShowOrNot = false;


    TextToSpeech t1;
    EditText ed1;
    Button b1;


    EditText et_key;
    TextView tv_position;
    Button btn_pre;
    Button btn_next;
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview2);
        ed1 = (EditText) findViewById(R.id.editText);
        b1 = (Button) findViewById(R.id.button11);

        initView();
        initEvent();

        {





            FloatingActionButton mFloatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
            mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if (isShowOrNot == false) {
                        ed1.setVisibility(View.VISIBLE);
                        b1.setVisibility(View.VISIBLE);
                        isShowOrNot = true;
                    }else {
                        ed1.setVisibility(View.INVISIBLE);
                        b1.setVisibility(View.INVISIBLE);
                        isShowOrNot = false;

                    }
                }
            });
        }

        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int staus) {
                if (staus != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.CHINA);
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String toSpeak = ed1.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        final WebView webview2;
        webview2=(WebView) findViewById(R.id.webview2);
        webview2.getSettings().setJavaScriptEnabled(true);
        webview2.loadUrl("https://sites.google.com/view/ted820525/%E9%A6%96%E9%A0%81/%E5%9C%8B%E9%9F%B3%E4%BA%8C%E5%BC%8F%E6%8B%BC%E9%9F%B3");
    }

    private void initView() {
        final WebView webview10;
        et_key = (EditText) findViewById(R.id.et_key);
        tv_position = (TextView) findViewById(R.id.tv_position);
        btn_pre = (Button) findViewById(R.id.btn_pre);
        btn_next = (Button) findViewById(R.id.btn_next);
        webview = (WebView) findViewById(R.id.webview2);
        webview.getSettings().setJavaScriptEnabled(true);



    }

    private void initEvent() {
        //上一个
        btn_pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webview.findNext(false);
            }
        });
        //下一个
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webview.findNext(true);
            }
        });
        //输入文本自动查询
        et_key.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void afterTextChanged(Editable key) {
                //搜索点击
                webview.findAllAsync(key.toString());
                webview.setFindListener(new WebView.FindListener() {
                    @Override
                    public void onFindResultReceived(int position, int all, boolean b) {
                        tv_position.setText("(位置：" + (position + 1) + "/" + all + ")");
                    }
                });
            }
        });
    }




    public void onPause()
    {
        if(t1!=null)

        {
            t1.stop();
            t1.shutdown();

        }
        super.onPause();
    }

}