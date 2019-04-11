package com.example.yooz.myapplication

import android.graphics.Color
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MyPager : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_pager)

        val viewPager = findViewById<ViewPager>(R.id.view_pager)
        val adapter = CustomPagerAdapter(applicationContext)
        adapter.add(Color.BLACK)
        adapter.add(Color.RED)
        adapter.add(Color.GREEN)
        adapter.add(Color.BLUE)
        adapter.add(Color.CYAN)
        adapter.add(Color.MAGENTA)

        viewPager.adapter = adapter
    }
}
