package com.example.andrclassworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFragment()
    }

        private fun initFragment(){
            supportFragmentManager.beginTransaction()
                .add(R.id.containerForFragment1, Fragment1())
                .commit()
        }

}