package com.example.yooz.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

import java.util.ArrayList

class ScrollContinuousAdapter(context: Context, private val list: ArrayList<Int>): ArrayAdapter<Int>(context, 0, list) {
    private val inflater: LayoutInflater

    init {
        inflater = LayoutInflater.from(context)

    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = inflater.inflate(R.layout.scroll_continuous_item, parent, false)

        val textView = view.findViewById<View>(R.id.number) as TextView
        textView.text = getItem(position).toString()

        return view
    }

    override fun getItem(position: Int): Int? {
        return list[position]
    }

    override fun getCount(): Int {
        return list.size
    }

    fun addAll(collection: ArrayList<Int>) {
        list.addAll(collection )
    }


    override fun add(`object`: Int?) {
        if (`object` == null) return
        list.add(`object`)
    }
}
