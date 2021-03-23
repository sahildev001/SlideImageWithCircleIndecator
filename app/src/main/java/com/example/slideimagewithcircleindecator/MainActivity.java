package com.example.slideimagewithcircleindecator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.slideimagewithcircleindecator.Adapter.Adapter;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    CircleIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameMain,new DataFragment()).commit();

        indicator = findViewById(R.id.indicator);

    }
}