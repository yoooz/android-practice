package com.example.yooz.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class SampleListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listView = ListView(this)
        listView.choiceMode = ListView.CHOICE_MODE_SINGLE
        setContentView(listView)

        val items = arrayOf("あいうえお", "かきくけこ", "さしすせそ", "たいつてと", "なにぬねの", "はひふへほ", "まみむめも", "やゆよ", "らりるれろ", "わをん")
        val adapter = ArrayAdapter(
                applicationContext,
                R.layout.simple_list_view,
                items
        )
        listView.adapter = adapter

        listView.setItemChecked(2, true)
    }
}
