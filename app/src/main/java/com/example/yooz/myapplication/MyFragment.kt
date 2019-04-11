package com.example.yooz.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MyFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.my_fragment, container, false)

        val viewPager = view.findViewById<ViewPager>(R.id.fragment_view_pager)
        val fm = this.fragmentManager
        if (fm != null) {
            val adapter = MyFragmentPagerAdapter(fm)
            adapter.add(1)
            adapter.add(2)
            adapter.add(3)
            viewPager.adapter = adapter
        }
        return view
    }

    companion object {
        private val KEY_ARG_NUMBER = "ARG_NUMBER"

        fun newInstance(number: Int): MyFragment {
            val bundle = Bundle()
            bundle.putInt(KEY_ARG_NUMBER, number)
            val fragment = MyFragment()
            fragment.arguments = bundle

            return fragment
        }
    }
}
