package com.example.francis.miwcup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView mywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mywebView=(WebView)findViewById(R.id.webView);
        WebSettings webSettings = mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("https://www.google.com/search?q=fifa+world+cup+2018+fixtures&ie=UTF-8&oe=UTF-8&hl=en-gh&client=safari#sie=lg;/m/06qjc4;2;/m/030q7;mt;fp;1");
    }

    public void onBackPressed() {
        if(mywebView.canGoBack())
        {
            mywebView.goBack();
        }

        else{
            super.onBackPressed();
        }
    }
}
