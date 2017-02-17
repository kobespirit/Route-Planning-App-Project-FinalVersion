package com.example.maxim.routeplanning_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageButton next1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton web = (ImageButton) findViewById(R.id.webview1);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WebViewActivity.class);
                String url = "http://www.aircasting.org/";
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        ImageButton web1 = (ImageButton) findViewById(R.id.webview2);
        web1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WebView2Activity.class);
                String url = "http://www.epa.vic.gov.au/";
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        next1 = (ImageButton) findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              sendRequestWithURLConnection();
                Intent intent = new Intent(MainActivity.this,MapsActivity.class);
                intent.setAction("action");

                startActivity(intent);
            }
        });



        ImageButton aboutus = (ImageButton) findViewById(R.id.about_us);
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AboutUsActivity.class);
                startActivity(intent);
            }
        });

    }
    }

