package com.example.andrclassworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity(), OnButtonClicked{

    private lateinit var text : AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFragment()

        text = findViewById(R.id.txtM1)
        val edit = findViewById<AppCompatEditText>(R.id.editM1)
        val button = findViewById<AppCompatButton>(R.id.btnM1)

//        button.setOnClickListener{
//        val fragment1 = supportFragmentManager.findFragmentById(R.id.containerM1) as? Fragment1
//            fragment1?.setText(edit.text.toString())
        button.setOnClickListener{
           val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }
    }

    override fun onButtonClicked(enteredText: String) {
        text.text = enteredText
    }


    private fun initFragment(){
        supportFragmentManager.beginTransaction()
            .add(R.id.containerM1, FragmentMain())
            .commit()
    }

}