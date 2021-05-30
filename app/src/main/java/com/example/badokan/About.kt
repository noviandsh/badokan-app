package com.example.badokan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val backBtn: Button = findViewById(R.id.btn_back_about)

        backBtn.setOnClickListener{
            finish()
        }
    }
}