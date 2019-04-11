package com.example.yooz.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.widget.LinearLayout

class ButtonListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_list)

        val myToolBar = findViewById<Toolbar>(R.id.my_toolbar)
        setSupportActionBar(myToolBar)
        val actionBar = supportActionBar
        actionBar!!.title = "Button List"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val parent = findViewById<LinearLayout>(R.id.scroll_content)
        val inf = LayoutInflater.from(this)

        for (i in 0..19) {
            inf.inflate(R.layout.scroll_child, parent, true)
        }
    }
}
