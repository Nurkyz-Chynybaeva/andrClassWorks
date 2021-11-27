package com.example.andrclassworks

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.example.andrclassworks.MainActivity3.Companion.ACTION_1
import com.example.andrclassworks.MainActivity3.Companion.ACTION_2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<AppCompatButton>(R.id.btn1M1)
        button1.setOnClickListener {
         val intent = Intent(Intent.ACTION_VIEW)
            intent.type = "image/*"
            startActivity(intent)

        }

    }


}



















