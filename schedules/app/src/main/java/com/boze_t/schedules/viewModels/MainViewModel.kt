package com.boze_t.schedules.viewModels

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.support.design.widget.BottomNavigationView
import android.view.MenuItem
import android.view.View

class MainViewModel(application: Application) : AndroidViewModel(application) {
    fun onClick(view: View?) {

    }
    fun onNavigationItemSelected(menuItem: MenuItem) {
        println(menuItem.itemId)

    }

    val onNavigationItemSelectedListener =
        object : BottomNavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(menu: MenuItem): Boolean {
                return true
            }
        }
}