package com.example.xy.smartbutler.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xy.smartbutler.R;

/*
 *   项目名: SmartButler
 *     包名:  com.example.xy.smartbutler.fragment
 *    文件名: UserFragment
 *   创建者:  xy
 *  创建时间: 2017/5/27 23:12
 *   描述 :   个人中心
 */
public class UserFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, null);
        return view;
    }

}
