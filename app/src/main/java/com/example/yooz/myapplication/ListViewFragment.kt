package com.example.yooz.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView

import java.util.ArrayList

class ListViewFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.list_view_fragment, container, false)
        var number = 0
        val bundle = arguments
        if (bundle != null) {
            number = bundle.getInt(KEY_ARG_NUMBER)
        }
        val listView = view.findViewById<ListView>(R.id.list_view)
        val adapter = ArrayAdapter(
                context!!,
                android.R.layout.simple_list_item_1,
                createData(number)
        )
        listView.adapter = adapter

        return view
    }

    private fun createData(number: Int): ArrayList<String> {
        val data = ArrayList<String>()
        for (i in 1..20) {
            data.add("Item$number-$i")
        }
        return data
    }

    companion object {
        private val KEY_ARG_NUMBER = "ARG_NUMBER"

        fun newInstance(number: Int): ListViewFragment {
            val bundle = Bundle()
            bundle.putInt(KEY_ARG_NUMBER, number)
            val fragment = ListViewFragment()
            fragment.arguments = bundle

            return fragment
        }
    }

}
