package com.example.yooz.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.ScrollView
import android.widget.Toast

import java.util.ArrayList

class FakeHiddenMenuActivity : AppCompatActivity(), View.OnClickListener {
    private var scrollView: ScrollView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fake_hidden_menu)

        val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                createItems()
        )

        findViewById<View>(R.id.text_view).setOnClickListener(this)

        scrollView = findViewById(R.id.scroll_view)

        val listView = findViewById<ListView>(R.id.list_view)
        listView.adapter = adapter
        listView.setOnTouchListener { v, event ->
            v.parent.requestDisallowInterceptTouchEvent(true)
            false
        }
    }

    private fun createItems(): List<String> {
        val result = ArrayList<String>()
        for (i in 0..99) {
            result.add("item ---$i")
        }

        return result
    }

    override fun onClick(v: View) {

        if (scrollView!!.scrollY == 0) {
            scrollView!!.scrollY = 442

        } else {
            scrollView!!.scrollY = 0
        }
        Toast.makeText(this, scrollView!!.scrollY.toString(), Toast.LENGTH_SHORT).show()
    }
}



