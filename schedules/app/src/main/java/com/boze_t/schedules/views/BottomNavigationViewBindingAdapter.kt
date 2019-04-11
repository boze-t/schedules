package com.boze_t.schedules.views

import android.databinding.BindingAdapter
import android.support.design.widget.BottomNavigationView

object BottomNavigationViewBindingAdapter {
    @BindingAdapter("onNavigationItemSelectedListener")
    fun setOnNavigationItemSelectedListener(view: BottomNavigationView, listener: BottomNavigationView.OnNavigationItemSelectedListener) {
        view.setOnNavigationItemSelectedListener(listener)
    }
}
