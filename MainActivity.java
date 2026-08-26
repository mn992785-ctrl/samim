package com.watchwin.demo;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.graphics.Color;
import android.view.ViewGroup;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView web = new WebView(this);
        web.setBackgroundColor(Color.rgb(248,247,252));
        WebSettings s = web.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        web.loadUrl("file:///android_asset/index.html");
        setContentView(web, new ViewGroup.LayoutParams(-1,-1));
    }
}
