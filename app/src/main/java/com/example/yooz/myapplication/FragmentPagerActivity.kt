package com.example.yooz.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class FragmentPagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_pager)

        if (savedInstanceState == null) {
            val fm = supportFragmentManager
            val ft = fm.beginTransaction()
            val fragment = MyFragment.newInstance(1)
            ft.add(R.id.container, fragment)
            ft.commit()

        }
    }
}
