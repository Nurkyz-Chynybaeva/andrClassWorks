package com.example.andrclassworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), OnItemClicked {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClicked(entered: String) {
        val fragment2 = supportFragmentManager.findFragmentById(R.id.containerFrag) as Fragment2
//        fragment2.setValut(entered)
    }

}