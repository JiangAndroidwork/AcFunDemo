package com.laojiang.acfundemo.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.laojiang.acfundemo.fragment.FanJuFragment;
import com.laojiang.acfundemo.fragment.GuanZhuFragment;
import com.laojiang.acfundemo.fragment.PinDaoFragment;
import com.laojiang.acfundemo.fragment.TuiJianFragment;
import com.laojiang.acfundemo.fragment.WenZhangFragment;
import com.laojiang.acfundemo.fragment.YuLeFragment;

/**
 * 类介绍（必填）：主页viewpageradapter
 * Created by Jiang on 2017/1/11 10:52.
 */

public class HomeViewPagerAdapter extends FragmentPagerAdapter {
    private Context context;
    private String[] str;
    public HomeViewPagerAdapter(FragmentManager fm, Context context, String[] str) {
        super(fm);
        this.context = context;
        this.str = str;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment pageFragment =null;
        switch (position){
            case 0:
                pageFragment = new GuanZhuFragment();
                break;
            case 1:
                pageFragment = new TuiJianFragment();
                break;
            case 2:
                pageFragment = new FanJuFragment();
                break;
            case 3:
                pageFragment = new YuLeFragment();
                break;
            case 4:
                pageFragment = new WenZhangFragment();
                break;
            case 5:
                pageFragment = new PinDaoFragment();
                break;

        }
        return pageFragment;
    }

    @Override
    public int getCount() {
        return str.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return str[position];
    }
}
