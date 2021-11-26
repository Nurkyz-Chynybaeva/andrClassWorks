package com.example.andrclassworks

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import javax.xml.transform.ErrorListener

class Fragment1: Fragment(R.layout.fragment1){

    private lateinit var listener: OnButtonClicked

    override fun onAttach(context: Context) {
        super.onAttach(context)
       listener = context as OnButtonClicked
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button1 = view.findViewById<AppCompatButton>(R.id.btn1F1)
        val button2 = view.findViewById<AppCompatButton>(R.id.btn2F1)

        button1.setOnClickListener(::onClick)
        button2.setOnClickListener(::onClick)
    }

    private fun onClick(view: View){
        when(view.id){
            R.id.btn1F1 -> {
                listener.onButtonClicked("hello")

            }
            R.id.btn2F1 -> {
                listener.onButtonClicked("hi")

            }

        }
    }

}