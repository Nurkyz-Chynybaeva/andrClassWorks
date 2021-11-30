package com.example.andrclassworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<AppCompatButton>(R.id.btn1M1)
        val btn2 = findViewById<AppCompatButton>(R.id.btn2M1)

    }
}