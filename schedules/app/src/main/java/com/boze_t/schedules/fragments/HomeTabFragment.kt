package com.boze_t.schedules.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.boze_t.schedules.R

class HomeTabFragment: Fragment() {

    companion object {
        fun newInstance() = HomeTabFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home_tab, container, false)
    }

}