package com.example.andrclassworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val text = findViewById<AppCompatTextView>(R.id.txtM3)

        when (intent.action) {
            ACTION_1 -> {
                val extra = intent.getStringExtra("key")
                text.text = "this activity3 action1 $extra"
            }
            ACTION_2 -> {
                val extra = intent.getStringExtra("key")
                text.text = "this activity3 action2 $extra"
            }
            else -> {
                text.text = "this activity3 no action"
            }
        }

    }

    companion object{
        const val ACTION_1 = "action1"
        const val ACTION_2 = "action2"
    }
}