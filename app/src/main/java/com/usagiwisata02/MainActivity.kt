 package com.usagiwisata02

 import android.annotation.SuppressLint
 import android.content.Intent
 import android.os.Bundle
 import android.support.design.widget.NavigationView
 import android.support.v4.app.FragmentManager
 import android.support.v4.app.FragmentTransaction
 import android.support.v4.view.GravityCompat
 import android.support.v7.app.ActionBarDrawerToggle
 import android.support.v7.app.AppCompatActivity
 import android.view.Menu
 import android.view.MenuItem
 import kotlinx.android.synthetic.main.activity_main.*
 import kotlinx.android.synthetic.main.app_bar_main.*

 class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
     lateinit var fm: FragmentManager;
     lateinit var ft: FragmentTransaction;

     @SuppressLint("CommitTransaction")
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)
         setSupportActionBar(toolbar)

         val toggle = ActionBarDrawerToggle(
             this,
             drawer_layout,
             toolbar,
             R.string.navigation_drawer_open,
             R.string.navigation_drawer_close
         )
         drawer_layout.addDrawerListener(toggle)
         toggle.syncState()

         nav_view.setNavigationItemSelectedListener(this)

         fm = supportFragmentManager
         ft = fm.beginTransaction()
         ft.replace(R.id.container, Home()).commit()

     }

     override fun onNavigationItemSelected(item: MenuItem): Boolean {
         // Handle navigation view item clicks here.

         when (item.itemId) {
             R.id.home -> {
                 // Handle the camera action
                 fm = supportFragmentManager
                 ft = fm.beginTransaction()
                 ft.replace(R.id.container, Home()).commit()

             }

             R.id.walpaper -> {
                 fm = supportFragmentManager
                 ft = fm.beginTransaction()
                 ft.replace(R.id.container, Walpaper()).commit()
             }

             R.id.streaming -> {
                 fm = supportFragmentManager
                 ft = fm.beginTransaction()
                 ft.replace(R.id.container, Streaming()).commit()
             }
             R.id.profil -> {
                 fm = supportFragmentManager
                 ft = fm.beginTransaction()
                 ft.replace(R.id.container, Profil()).commit()
             }
         }
         drawer_layout.closeDrawer(GravityCompat.START)
         return true
     }
 }



