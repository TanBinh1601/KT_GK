package com.nghia.pvn.baicuoiky;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private String listTap[]={"Xem Gần Đây","Gần Tôi"};
    private F1 mF1;
    private F2 mF2;


    public PagerAdapter(FragmentManager fm){
        super(fm);
        mF1=new F1();
        mF2=new F2();
    }
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return mF1;
            case 1:
                return mF2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return listTap.length;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return listTap[position];
    }
}
