package com.example.ted.book;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class webview5 extends AppCompatActivity {

    EditText et_key;
    TextView tv_position;
    Button btn_pre;
    Button btn_next;
    WebView webview;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview5);

        initView();
        initEvent();
        loadWebview();



    }

    /**
     * 初始化控件
     */
    private void initView() {
        final WebView webview10;
        et_key = (EditText) findViewById(R.id.et_key);
        tv_position = (TextView) findViewById(R.id.tv_position);
        btn_pre = (Button) findViewById(R.id.btn_pre);
        btn_next = (Button) findViewById(R.id.btn_next);
        webview = (WebView) findViewById(R.id.webview5);
        webview.getSettings().setJavaScriptEnabled(true);



    }

    /**
     * 初始化事件
     */



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

    /**
     * 加载webview
     */

    private void loadWebview() {
        webview.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        webview.loadUrl("https://sites.google.com/view/ted820525/%E9%A6%96%E9%A0%81/%E9%80%9A%E7%94%A8%E6%8B%BC%E9%9F%B3");

    }
    /*
       final WebView webview5;
        webview5=(WebView) findViewById(R.id.webview5);
        webview5.getSettings().setJavaScriptEnabled(true);
        webview5.loadUrl("https://sites.google.com/view/ted820525/%E9%A6%96%E9%A0%81/%E9%80%9A%E7%94%A8%E6%8B%BC%E9%9F%B3");
     */
}
