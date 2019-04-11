package com.example.yooz.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter

import java.util.ArrayList
import java.util.HashMap

class SimpleAdapter2Activity : AppCompatActivity() {


    private val listData: List<Map<String, String>>
        get() {
            val listData = ArrayList<Map<String, String>>()
            listData.add(getMapData(arrayOf(arrayOf("no", "01"), arrayOf("name", "あいうえお"))))
            listData.add(getMapData(arrayOf(arrayOf("no", "02"), arrayOf("name", "かきくけこ"))))
            listData.add(getMapData(arrayOf(arrayOf("no", "03"), arrayOf("name", "さしすせそ"))))
            listData.add(getMapData(arrayOf(arrayOf("no", "04"), arrayOf("name", "たちつてと"))))
            listData.add(getMapData(arrayOf(arrayOf("no", "05"), arrayOf("name", "なにぬねの"))))
            listData.add(getMapData(arrayOf(arrayOf("no", "06"), arrayOf("name", "はひふへほ"))))
            listData.add(getMapData(arrayOf(arrayOf("no", "07"), arrayOf("name", "まみむめも"))))
            listData.add(getMapData(arrayOf(arrayOf("no", "08"), arrayOf("name", "やゆよ"))))
            listData.add(getMapData(arrayOf(arrayOf("no", "09"), arrayOf("name", "らりるれろ"))))
            listData.add(getMapData(arrayOf(arrayOf("no", "10"), arrayOf("name", "わをん"))))
            return listData
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listView = ListView(this)
        setContentView(listView)

        if (listView != null) {
            val adapter = SimpleAdapter(
                    this,
                    listData,
                    R.layout.simple_list_item_2,
                    arrayOf("no", "name"),
                    intArrayOf(android.R.id.text1, android.R.id.text2)
            )
            listView.adapter = adapter
        }
    }

    private fun getMapData(values: Array<Array<String>>): Map<String, String> {
        val map = HashMap<String, String>()
        for (value in values) {
            map[value[0]] = value[1]
        }
        return map
    }
}
