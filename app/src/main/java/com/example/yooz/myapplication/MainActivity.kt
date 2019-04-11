package com.example.yooz.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupLayout()

    }

    private fun setupLayout() {
        findViewById<View>(R.id.next).setOnClickListener(this)
        findViewById<View>(R.id.web).setOnClickListener(this)
        findViewById<View>(R.id.send).setOnClickListener(this)
        findViewById<View>(R.id.linear_layout).setOnClickListener(this)
        findViewById<View>(R.id.dynamic_layout).setOnClickListener(this)
        findViewById<View>(R.id.scroll_layout).setOnClickListener(this)
        findViewById<View>(R.id.button_list).setOnClickListener(this)
        findViewById<View>(R.id.map).setOnClickListener(this)
        findViewById<View>(R.id.sample_list_view).setOnClickListener(this)
        findViewById<View>(R.id.simple_list_view_2).setOnClickListener(this)
        findViewById<View>(R.id.fragment).setOnClickListener(this)
        findViewById<View>(R.id.view_pager).setOnClickListener(this)
        findViewById<View>(R.id.scroll_continuous).setOnClickListener(this)
        findViewById<View>(R.id.fake_hidden_menu).setOnClickListener(this)

    }

    override fun onClick(v: View) {
        val intent: Intent
        when (v.id) {
            R.id.next -> {
                intent = Intent(this@MainActivity, NextActivity::class.java)
                startActivity(intent)
            }
            R.id.web -> {
                val uri = Uri.parse("https://www.google.com/")
                intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
            R.id.send -> {
                intent = Intent(Intent.ACTION_SEND)
                intent.putExtra(Intent.EXTRA_TEXT, "Hello Send Action")
                intent.type = "text/plain"
                startActivity(intent)
            }
            R.id.linear_layout -> {
                intent = Intent(this@MainActivity, LinearLayoutActivity::class.java)
                startActivity(intent)
            }
            R.id.dynamic_layout -> {
                intent = Intent(this@MainActivity, DynamicLayout::class.java)
                startActivity(intent)
            }
            R.id.scroll_layout -> {
                intent = Intent(this@MainActivity, Scroll::class.java)
                startActivity(intent)
            }
            R.id.button_list -> {
                intent = Intent(this@MainActivity, ButtonListActivity::class.java)
                startActivity(intent)
            }
            R.id.map -> {
                intent = Intent(this@MainActivity, MapActivity::class.java)
                startActivity(intent)
            }
            R.id.sample_list_view -> {
                intent = Intent(this, SampleListViewActivity::class.java)
                startActivity(intent)
            }
            R.id.simple_list_view_2 -> {
                intent = Intent(this, SimpleAdapter2Activity::class.java)
                startActivity(intent)
            }
            R.id.fragment -> {
                intent = Intent(this, FragmentPagerActivity::class.java)
                startActivity(intent)
            }
            R.id.view_pager -> {
                intent = Intent(this, MyPager::class.java)
                startActivity(intent)
            }
            R.id.scroll_continuous -> {
                intent = Intent(this, ScrollContinuousActivity::class.java)
                startActivity(intent)
            }
            R.id.fake_hidden_menu -> {
                intent = Intent(this, FakeHiddenMenuActivity::class.java)
                startActivity(intent)
            }
            else -> {
            }
        }
    }
}
