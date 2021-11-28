package com.example.andrclassworks

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class FragmentMain1 : Fragment(R.layout.fragment_main) {
    private lateinit var text: AppCompatTextView
    private lateinit var listener: OnButtonClicked

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnButtonClicked
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text = view.findViewById(R.id.txt1F1)
        val edit = view.findViewById<AppCompatEditText>(R.id.editF1)
        val button = view.findViewById<AppCompatButton>(R.id.btnFM)

        button.setOnClickListener {
            listener.onClicked(edit.text.toString())
        }
    }

    fun setText(enteredText: String){
        text.text = enteredText
    }
}