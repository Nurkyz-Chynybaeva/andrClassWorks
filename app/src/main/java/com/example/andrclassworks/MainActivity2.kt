package com.example.andrclassworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity(), OnButtonClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun onClicked(enteredText: String) {
        val fragment2 = supportFragmentManager.findFragmentById(R.id.secondContainer) as Fragment2
        fragment2.setText(enteredText)

    }
}