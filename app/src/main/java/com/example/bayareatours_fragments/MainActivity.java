package com.example.bayareatours_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the viewpager that will allow to swipe between the fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        NewFragmentPagerAdapter adapter = new NewFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
}