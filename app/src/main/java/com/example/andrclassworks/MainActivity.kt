package com.example.andrclassworks

import android.icu.lang.UCharacter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import com.example.andrclassworks.databinding.ActivityMainBinding
import com.google.android.material.appbar.AppBarLayout
import kotlin.math.exp

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            //numbers
            one.setOnClickListener { appendonExpresstion("1", true)}
            two.setOnClickListener { appendonExpresstion("2", true)}
            three.setOnClickListener { appendonExpresstion("3", true)}
            four.setOnClickListener { appendonExpresstion("4", true)}
            five.setOnClickListener { appendonExpresstion("5", true)}
            six.setOnClickListener { appendonExpresstion("6", true)}
            seven.setOnClickListener { appendonExpresstion("7", true)}
            eight.setOnClickListener { appendonExpresstion("8", true)}
            nine.setOnClickListener { appendonExpresstion("9", true)}
            zero.setOnClickListener { appendonExpresstion("0", true)}
            //operators
            plus.setOnClickListener{appendonExpresstion("+", false)}
            minus.setOnClickListener{appendonExpresstion("-", false)}
            multiplication.setOnClickListener{appendonExpresstion("*", false)}
            division.setOnClickListener{appendonExpresstion("/", false)}
            firstBracket.setOnClickListener{appendonExpresstion("(", false)}
            secondBracket.setOnClickListener{appendonExpresstion(")", false)}

            clean.setOnClickListener{
                expression.text = ""
                result.text = ""
            }
            back.setOnClickListener{
                val string = expression.text.toString()
                if (string.isNotEmpty()){
                    expression.text = string.substring(0, string.length-1)
                }
                result.text = ""
            }



        }
    }

    fun appendonExpresstion(string: String, canClear: Boolean) {
        if (canClear) {
            binding.result.text = ""
            binding.expression.append(string)
        } else {
            binding.expression.append(binding.result.text)
            binding.expression.append(string)
            binding.result.text = ""
        }
    }

}


















