package com.usagiwisata02

import android.content.Intent
import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash_Screen : AppCompatActivity() {

    lateinit var handler : Handler;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash__screen)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        handler = Handler()

        handler.postDelayed(Runnable {
            var intent : Intent

            intent = Intent(this@Splash_Screen, MainActivity::class.java)
            startActivity(intent)
            this@Splash_Screen.finish()
        }, 2000)
    }

}