package com.example.xy.smartbutler;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.xy.smartbutler.fragment.BulterFragment;
import com.example.xy.smartbutler.fragment.GirlFragment;
import com.example.xy.smartbutler.fragment.UserFragment;
import com.example.xy.smartbutler.fragment.WechatFragment;
import com.example.xy.smartbutler.ui.SettingActivity;
import com.tencent.bugly.crashreport.CrashReport;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //TabLayout
    private TabLayout mTabLayout;
    //ViewPager
    private ViewPager mViewPager;
    //Title
    private List<String> mTitle;
    //Fragment
    private List<Fragment> mFragment;
    //悬浮窗
    //private FloatingActionButton fab_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //去掉阴影
        getSupportActionBar().setElevation(0);

        initDate();
        initView();

    }

    //初始化数据
    private void initDate() {
        mTitle = new ArrayList<>();
        mTitle.add("服务管家");
        mTitle.add("微信精选");
        mTitle.add("快递查询");
        mTitle.add("个人中心");

        mFragment = new ArrayList<>();
        mFragment.add(new BulterFragment());
        mFragment.add(new WechatFragment());
        mFragment.add(new GirlFragment());
        mFragment.add(new UserFragment());
    }

    //初始化View
    private void initView() {
        //fab_setting = (FloatingActionButton) findViewById(R.id.fab_setting);
        //fab_setting.setOnClickListener(this);
        //默认隐藏 右下角的悬浮设置按钮,滑到第二,三,四屏显示出来
       // fab_setting.setVisibility(View.GONE);
        mTabLayout = (TabLayout) findViewById(R.id.mTabLayout);
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);

        //预加载
        mViewPager.setOffscreenPageLimit(mFragment.size());

        //mViewPager的滑动监听
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(){

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Log.i("TAG","positon:" + position);
                if(position == 0){
                  //  fab_setting.setVisibility(View.GONE);
                }else {
                 //   fab_setting.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        //设置适配器
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            //获取选中的item
            @Override
            public Fragment getItem(int position) {
                return mFragment.get(position);
            }

            //返回item的个数
            @Override
            public int getCount() {
                return mFragment.size();
            }

            //设置标题
            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle.get(position);
            }
        });
        //绑定
        mTabLayout.setupWithViewPager(mViewPager);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.fab_setting:
                startActivity(new Intent(this, SettingActivity.class));
                break;
        }
    }
}
