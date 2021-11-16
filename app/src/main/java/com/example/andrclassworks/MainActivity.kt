package com.example.andrclassworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andrclassworks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            txtMain.text = "this is NNNNN"
            btnMain.setOnClickListener {
                startActivity(Intent(this@MainActivity, MainActivity2::class.java))
            }
        }
    }
}