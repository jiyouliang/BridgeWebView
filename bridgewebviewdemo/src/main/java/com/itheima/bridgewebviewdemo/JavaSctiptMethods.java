package com.itheima.bridgewebviewdemo;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by youliang.ji on 2016/12/23.
 */

public class JavaSctiptMethods {
    private Activity mContext;

    public JavaSctiptMethods(Activity mContext) {
        this.mContext = mContext;
    }

    public void callphone(String[] json){
        try {
            JSONObject jsonObject = new JSONObject(json[0]);
            System.out.println("Demo callphone方法被调用:"+jsonObject.toString());
            //解析json
            String phone = jsonObject.optString("phone");
            Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+phone));
//            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){//拨号：android 6.0运行时权限
//                if(mContext.checkSelfPermission(Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_DENIED){
//                    mContext.requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 100);
//                }
//            }
            mContext.startActivity(intent);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public void showToast(String[] json){
        Toast.makeText(mContext, json[0], Toast.LENGTH_SHORT).show();
    }
}
