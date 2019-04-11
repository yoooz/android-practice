package com.example.yooz.myapplication

import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView
import android.widget.ListView

import java.util.ArrayList
import java.util.Arrays

class ScrollContinuousActivity : AppCompatActivity(), AbsListView.OnScrollListener {
    private var listView: ListView? = null
    private var count: Int = 0
    private var addListThread: AddListThread? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_continuous)
        count = 0

        val adapter = ScrollContinuousAdapter(this,
                ArrayList())

        listView = findViewById(R.id.listview)
        listView!!.adapter = adapter
        listView!!.setOnScrollListener(this)
        addListThread = AddListThread(0, 0, count++)
        addListThread!!.start()
    }

    inner class AddListThread constructor(private val position: Int, private val y: Int, private val start: Int) : Thread() {
        private val handler: Handler

        init {
            handler = Handler()
        }

        override fun run() {
            try {
                Thread.sleep(1000)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }

            handler.post {
                val list = ArrayList<Int>()
                for (i in 0..9) {
                    list.add(start + i)
                }
                val adapter = listView!!.adapter as ScrollContinuousAdapter
                adapter.addAll(list)
                listView!!.adapter = adapter
                listView!!.setSelectionFromTop(position, y)
            }
        }
    }

    override fun onScrollStateChanged(view: AbsListView, scrollState: Int) {

    }

    override fun onScroll(view: AbsListView, firstVisibleItem: Int, visibleItemCount: Int, totalItemCount: Int) {
        if (totalItemCount == 0) {
            return
        }

        if (totalItemCount == firstVisibleItem + visibleItemCount && !addListThread!!.isAlive) {
            val position = listView!!.firstVisiblePosition
            val y = listView!!.getChildAt(0).top
            addListThread = AddListThread(position, y, count++)
            addListThread!!.start()
        }

    }
}
