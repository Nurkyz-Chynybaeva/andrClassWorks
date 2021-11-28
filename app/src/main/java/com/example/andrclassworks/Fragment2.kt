package com.example.andrclassworks

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class Fragment2: Fragment(R.layout.fragment2){
    private lateinit var text: AppCompatTextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       text = view.findViewById(R.id.txtF2)
    }

    fun setText(string: String){
     text.text = string
    }
}