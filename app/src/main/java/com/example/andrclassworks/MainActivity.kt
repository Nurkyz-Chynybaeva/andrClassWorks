package com.example.andrclassworks

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<AppCompatTextView>(R.id.btn1M1)
        val button2 = findViewById<AppCompatTextView>(R.id.btn2M1)
        val button3 = findViewById<AppCompatTextView>(R.id.btn3M1)

        button1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.type = "image/*"
            startActivity(intent)
        }

    }


}