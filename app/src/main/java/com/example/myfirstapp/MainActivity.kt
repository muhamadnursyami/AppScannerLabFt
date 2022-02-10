package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstapp.R
import android.content.Intent
import android.os.Handler
import com.example.myfirstapp.HomeActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()
        val handler = Handler()
        handler.postDelayed({
            startActivity(Intent(applicationContext, HomeActivity::class.java))
            finish()
        }, 3000L)
    }
}