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

        val button1 = findViewById<AppCompatButton>(R.id.btn)
        val button2 = findViewById<AppCompatButton>(R.id.btn2)
        val button3 = findViewById<AppCompatButton>(R.id.btn3)
        val button4 = findViewById<AppCompatButton>(R.id.btn4)
        val button5 = findViewById<AppCompatButton>(R.id.btn5)

        button1.setOnClickListener {goTo1()}
        button2.setOnClickListener {goToWeb()}
        button3.setOnClickListener {goToGallery()}
        button4.setOnClickListener {goToActivityWithAction1()}
        button5.setOnClickListener {goToActivityWithAction2()}

    }

    private fun goTo1(){
        val intent = Intent("myAction")
        startActivity(intent)
    }

    private fun goToWeb(){
        val address = Uri.parse("http://google.com")
        val intent2 = Intent(Intent.ACTION_VIEW, address)
        if (intent2.resolveActivity(packageManager) != null){
            startActivity(intent2)
        }else{
            Toast.makeText(this, "hgiejgiegji", Toast.LENGTH_SHORT).show()
        }
    }

    private fun goToGallery() {
        val intent3 = Intent(Intent.ACTION_VIEW)
        intent3.type = "image/*"
        startActivity(intent3)
    }

    private fun goToActivityWithAction1(){
        val intent4 = Intent(ACTION_1)
        intent4.putExtra("key", "goToActivityWithAction1")
        startActivity(intent4)
    }
    private fun goToActivityWithAction2(){
        val intent4 = Intent(ACTION_2)
        intent4.putExtra("key", "goToActivityWithAction2")
        startActivity(intent4)
    }

}



















