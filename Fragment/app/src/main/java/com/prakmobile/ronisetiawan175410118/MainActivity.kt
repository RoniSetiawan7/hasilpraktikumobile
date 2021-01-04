package com.prakmobile.ronisetiawan175410118

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.
        beginTransaction().
        add(R.id.fragmentContainer,FragmentOne(),"FragmentOne").commit()

    }
}