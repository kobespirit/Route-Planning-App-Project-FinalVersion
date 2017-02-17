package com.example.maxim.routeplanning_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebView2Activity extends AppCompatActivity {

    private WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view2);
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");

//        String aurl="";
//        String turl="";
//        String furl="";
//        String lurl="";
//
//        if(! intent.getStringExtra("Aurl").isEmpty()){
//            aurl = intent.getStringExtra("Aurl");
//        }
//        else if (! intent.getStringExtra("Turl").isEmpty()){
//            turl = intent.getStringExtra("Turl");
//        }
//        else if (! intent.getStringExtra("Furl").isEmpty()){
//            furl = intent.getStringExtra("Furl");
//        }
//        else{
//            lurl = intent.getStringExtra("Lurl");
//        }

        webView2 = (WebView) findViewById(R.id.web_view);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.setWebViewClient(new WebViewClient());

        webView2.loadUrl(url);

        webView2.getSettings().setUseWideViewPort(true);
        webView2.getSettings().setLoadWithOverviewMode(true);
        webView2.getSettings().setBuiltInZoomControls(true);


//        if (turl.isEmpty() && furl.isEmpty() && lurl.isEmpty() ){
//            aurl="";
//            webView.loadUrl(aurl);
//        }
//        else if (aurl.isEmpty() && furl.isEmpty() && lurl.isEmpty() ){
//            turl="";
//            webView.loadUrl(turl);
//        }
//        else if (aurl.isEmpty() && turl.isEmpty() && lurl.isEmpty() ){
//            furl="";
//            webView.loadUrl(furl);
//        }
//        else {
//            lurl="";
//            webView.loadUrl(lurl);
//        }
    }

}

