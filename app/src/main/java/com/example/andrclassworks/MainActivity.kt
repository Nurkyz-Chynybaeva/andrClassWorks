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

        button1.setOnClickListener { goTo1() }
        button2.setOnClickListener { goTo2() }
        button3.setOnClickListener { goToGallery() }

    }


    private fun goTo1(){
        val intent = Intent("myAction")
        startActivity(intent)
    }
    private fun goTo2(){
        val address = Uri.parse("https://github.com/Nurkyz-Chynybaeva?tab=repositories")
        val intent = Intent(Intent.ACTION_VIEW, address)

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Toast.makeText(this, "error not find", Toast.LENGTH_SHORT).show()
        }
    }
    private fun goToGallery() {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.type = "image/*"
        startActivity(intent)
    }
    private fun goToActivity3(){

//        val intent = Intent(ACTION_1)
        intent.putExtra("key", "hello")
        startActivity(intent)


    }
}




