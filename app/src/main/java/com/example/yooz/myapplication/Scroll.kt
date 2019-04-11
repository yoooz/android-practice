package com.example.yooz.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.ScrollView

class Scroll : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll)
        val scroll = findViewById<LinearLayout>(R.id.scroll)
        val inf = LayoutInflater.from(this)
        for (i in 0..99) {
            inf.inflate(R.layout.scroll_child, scroll, true)

        }
    }
}
