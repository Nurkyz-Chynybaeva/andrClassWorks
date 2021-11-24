package com.example.andrclassworks

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class Fragment2: Fragment(R.layout.fragment2) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text = view.findViewById<AppCompatTextView>(R.id.txtM2)

//        val item = view.intent.getStringExtra("text")
//        text.text = item
    }
}