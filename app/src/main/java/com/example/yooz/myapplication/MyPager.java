package com.example.yooz.myapplication;

import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyPager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_pager);

        ViewPager viewPager = findViewById(R.id.view_pager);
        CustomPagerAdapter adapter = new CustomPagerAdapter(getApplicationContext());
        adapter.add(Color.BLACK);
        adapter.add(Color.RED);
        adapter.add(Color.GREEN);
        adapter.add(Color.BLUE);
        adapter.add(Color.CYAN);
        adapter.add(Color.MAGENTA);

        viewPager.setAdapter(adapter);
    }
}
