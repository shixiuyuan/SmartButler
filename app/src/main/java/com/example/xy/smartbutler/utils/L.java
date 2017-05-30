package com.example.xy.smartbutler.utils;

import android.util.Log;

/*
 *   项目名: SmartButler
 *     包名:  com.example.xy.smartbutler.utils
 *    文件名: L
 *   创建者:  xy
 *  创建时间: 2017/5/28 11:49
 *   描述 :   Log封装类
 */
public class L {

    //开关
    public static final boolean DEBUG = true;
    //TAG
    public static final String TAG = "Smartbutler";

    //五个等级  封装四个DIWE
    public static void d(String text){
        if(DEBUG){
            Log.d(TAG,text);
        }
    }

    public static void i(String text){
        if(DEBUG){
            Log.i(TAG,text);
        }
    }

    public static void w(String text){
        if(DEBUG){
            Log.w(TAG,text);
        }
    }

    public static void e(String text){
        if(DEBUG){
            Log.e(TAG,text);
        }
    }
}
