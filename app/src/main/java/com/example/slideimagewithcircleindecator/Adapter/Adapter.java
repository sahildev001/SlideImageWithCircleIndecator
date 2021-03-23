package com.example.slideimagewithcircleindecator.Adapter;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.slideimagewithcircleindecator.DataFragment;
import com.example.slideimagewithcircleindecator.MainActivity;

import java.util.ArrayList;


public class Adapter extends FragmentPagerAdapter {
    Context context;



    public Adapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }






    @Override
    public int getCount() {
        return 0;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }
}
