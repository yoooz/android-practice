package com.example.yooz.myapplication

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import java.util.ArrayList

class CustomPagerAdapter(private val context: Context) : PagerAdapter() {
    private val items = ArrayList<Int>()

    fun add(item: Int) {
        items.add(item)
    }

    override fun getCount(): Int {
        return items.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val textView = TextView(context)
        textView.text = "Page: $position"
        textView.textSize = 30f
        textView.setTextColor(items[position])
        textView.gravity = Gravity.CENTER
        container.addView(textView)
        return textView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}
