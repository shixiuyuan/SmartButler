package com.example.xy.smartbutler.application;

import android.app.Application;

import com.example.xy.smartbutler.utils.StaticClass;
import com.tencent.bugly.crashreport.CrashReport;

/*
 *   项目名: SmartButler
 *     包名:  com.example.xy.smartbutler.application
 *    文件名: BaseApplication
 *   创建者:  xy
 *  创建时间: 2017/5/27 20:28
 *   描述 :   TODO
 */
public class BaseApplication extends Application {

    //创建
   @Override
    public void onCreate() {
       super.onCreate();
        //初始化bugly
       CrashReport.initCrashReport(getApplicationContext(), StaticClass.BUGLY_APP_ID, true);

   }
}
