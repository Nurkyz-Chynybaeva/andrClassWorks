package com.example.andrclassworks

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class Fragment1: Fragment(R.layout.fragment1) {
    private lateinit var listener: OnButtonClicked2
    private lateinit var text : AppCompatTextView

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnButtonClicked2
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        text = view.findViewById(R.id.txt1F1)
        val button = view.findViewById<AppCompatButton>(R.id.btnF1)
        button.setOnClickListener {
            listener.onClick2("message from the Fragment1")
        }
    }
    fun setText(message: String) {
        text.text = message
    }
}
