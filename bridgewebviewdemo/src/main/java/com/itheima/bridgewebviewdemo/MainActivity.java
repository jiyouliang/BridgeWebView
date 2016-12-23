package com.itheima.bridgewebviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.itheima.view.BridgeWebView;

public class MainActivity extends AppCompatActivity {

    private BridgeWebView mWeview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mWeview = (BridgeWebView) findViewById(R.id.weview);

//        mWeview.addBridgeInterface(new JavaSctiptMethods(MainActivity.this), "http://10.0.2.2:8080/BridgeWebView/index.html");
        mWeview.addBridgeInterface(new JavaSctiptMethods(MainActivity.this), "file:///android_asset/BridgeWebView/index.html");
        //mWeview.loadUrl("http://10.0.2.2:8080/BridgeWebView/index.html");
//        mWeview.loadUrl("file:///android_asset/BridgeWebView/index.html");//本地模板，动态刷新UI
    }
}
