package com.example.andrclassworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andrclassworks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnButtonClicked, OnButtonClicked2 {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initFragment()

        binding.btn1M1.setOnClickListener {
            val fragment1 = supportFragmentManager.findFragmentByTag("fragment1")
            val fragment2 = supportFragmentManager.findFragmentByTag("fragment2")
            supportFragmentManager.beginTransaction()
                .show(fragment1!!)
                .hide(fragment2!!)
                .commit()

        }
        binding.btn2M1.setOnClickListener {
            val fragment1 = supportFragmentManager.findFragmentByTag("fragment1")
            val fragment2 = supportFragmentManager.findFragmentByTag("fragment2")
            supportFragmentManager.beginTransaction()
                .show(fragment2!!)
                .hide(fragment1!!)
                .commit()
        }
        binding.btn3M1.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    private fun initFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.containerM1, Fragment1(), "fragment1")
            .addToBackStack(null)
            .commit()

        supportFragmentManager.beginTransaction()
            .add(R.id.containerM1, Fragment2(), "fragment2")
            .addToBackStack(null)
            .commit()
    }

    override fun onClick(text: String) {

    }

    override fun onClick2(text2: String) {

    }

}