package com.example.yooz.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class DynamicLayout : AppCompatActivity(), View.OnClickListener {

    private var layout: LinearLayout? = null
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_layout)

        layout = findViewById(R.id.linear_layout)
        setupLayout()

    }

    private fun setupLayout() {
        findViewById<View>(R.id.add).setOnClickListener(this)
        findViewById<View>(R.id.remove).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.add -> {
                counter += 1
                val view = TextView(this)
                view.text = "counter :$counter"
                view.width = layout!!.width
                view.gravity = Gravity.CENTER_HORIZONTAL
                layout!!.addView(view)
            }
            R.id.remove -> if (counter > 0) {
                layout!!.removeViewAt(counter)
                counter -= 1
            }
        }
    }


}
