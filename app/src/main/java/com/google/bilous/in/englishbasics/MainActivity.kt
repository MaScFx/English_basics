package com.google.bilous.`in`.englishbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.google.bilous.`in`.englishbasics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBunding:ActivityMainBinding
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBunding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBunding.root)

    }

    override fun onStart() {
        super.onStart()
        toolbar=mBunding.mainToolbar
        setSupportActionBar(toolbar)
    }
}