package com.example.andrclassworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val text = findViewById<AppCompatTextView>(R.id.txt1M3)
        when (intent.action){
            ACTION_1 -> {
               val extr = intent.getStringExtra("key")
                text.text = "this is action 1"
            }
            ACTION2-> {
                val extr = intent.getStringExtra("key")
                text.text = "this is action 2"
            }
            else -> {
                text.text="not found"
            }
        }
    }
    companion object{
        private const val ACTION_1 = "com.example.andrclassworks.action1"
        private const val ACTION2 = "action2"
    }
}