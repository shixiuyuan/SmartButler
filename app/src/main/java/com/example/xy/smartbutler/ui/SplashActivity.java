package com.example.xy.smartbutler.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.xy.smartbutler.MainActivity;
import com.example.xy.smartbutler.R;
import com.example.xy.smartbutler.utils.ShareUtils;
import com.example.xy.smartbutler.utils.StaticClass;
import com.example.xy.smartbutler.utils.UtilTools;

import static android.graphics.Typeface.createFromAsset;
import static com.example.xy.smartbutler.utils.ShareUtils.getBoolean;

/*
 *   项目名: SmartButler
 *     包名:  com.example.xy.smartbutler.ui
 *    文件名: SplashActivity
 *   创建者:  xy
 *  创建时间: 2017/5/28 12:52
 *   描述 :   闪屏页
 */
public class SplashActivity extends AppCompatActivity {

    /**
     * 1.延时2000ms
     * 2.判断程序是否第一次运行
     * 3.自定义字体
     * 4.Activity全屏主题
     */

    private TextView tv_splash;

    //用Handler进行延时
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case StaticClass.HANDLER_SPLASH:
                    //判断程序是否第一次运行
                    if(isFirst()){
                        startActivity(new Intent(SplashActivity.this,GuideActivity.class));
                    }else{
                        startActivity(new Intent(SplashActivity.this,GuideActivity.class));
                    }
                    finish();
                    break;
            }
        }

    };
    //判断程序是否第一次运行
    private boolean isFirst() {
       boolean isFirst = ShareUtils.getBoolean(this,StaticClass.SHARE_IS_FIRST,true);
        if(isFirst){
            ShareUtils.putBoolean(this,StaticClass.SHARE_IS_FIRST,false);
            //是第一次运行
            return true;
        }else{
            return false;
        }
    }

    //禁用返回键
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initView();
    }

    //初始化View
    private void initView(){
        //延时2秒
        handler.sendEmptyMessageDelayed(StaticClass.HANDLER_SPLASH,2000);
        tv_splash = (TextView) findViewById(R.id.tv_splash);

        //在assets/fonts下加载字体
//        Typeface fontType = Typeface.createFromAsset(getAssets(),"fonts/FONT.TTF");
//        tv_splash.setTypeface(fontType);

        //将上面设置字体的方法封装成工具类里的方法
        UtilTools.setFont(this,tv_splash);
    }

}














