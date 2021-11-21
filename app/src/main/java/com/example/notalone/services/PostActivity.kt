package com.example.notalone.services

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import com.example.notalone.R

class PostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)
        supportActionBar?.hide()

        findViewById<Toolbar>(R.id.tol).setNavigationOnClickListener {
            finish()
        }
    }
}