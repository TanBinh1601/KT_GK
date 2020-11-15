package com.nghia.pvn.baicuoiky;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

public class activity1 extends Fragment {

    private View view;
    private ViewPager viewPager;
    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_1,container,false);
        viewPager= view.findViewById(R.id.viewp);
        viewPager.setAdapter(new PagerAdapter(getFragmentManager()));
        TabLayout tabLayout=view.findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);
        return view;

    }


}
