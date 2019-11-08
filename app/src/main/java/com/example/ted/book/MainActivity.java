package com.example.ted.book;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity




        implements NavigationView.OnNavigationItemSelectedListener {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





        final Context context= this;




        button1 =(Button)findViewById(R.id.button1);
        button2 =(Button)findViewById(R.id.button2);
        button3 =(Button)findViewById(R.id.button3);
        button4 =(Button)findViewById(R.id.button4);
        button5 =(Button)findViewById(R.id.button5);
        button6 =(Button)findViewById(R.id.button6);
        button7 =(Button)findViewById(R.id.button7);
        button8 =(Button)findViewById(R.id.button8);
        button9 =(Button)findViewById(R.id.button9);
        button10 =(Button)findViewById(R.id.button10);

        final WebView wv1 = (WebView) findViewById(R.id.webview1);


        wv1.loadUrl("https://ok.ru/video/1497445047924");
        wv1.getSettings().setBuiltInZoomControls(true);
        wv1.getSettings().setJavaScriptEnabled(true);





        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view){
                Intent intent = new Intent(context, webview.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
                public void onClick (View view){
                    Intent intent = new Intent(context, webview2.class);
                    startActivity(intent);
                }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view){
                Intent intent1 = new Intent(context, webview3.class);
                startActivity(intent1);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view){
                Intent intent = new Intent(context, webview4.class);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view){
                Intent intent = new Intent(context, webview5.class);
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view){
                Intent intent = new Intent(context, webview6.class);
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view){
                Intent intent = new Intent(context, webview7.class);
                startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view){
                Intent intent = new Intent(context, webview8.class);
                startActivity(intent);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view){
                Intent intent = new Intent(context, webview9.class);
                startActivity(intent);
            }
        });


        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view){
                Intent intent = new Intent(context, webview10.class);
                startActivity(intent);
            }
        });




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

    }





    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
