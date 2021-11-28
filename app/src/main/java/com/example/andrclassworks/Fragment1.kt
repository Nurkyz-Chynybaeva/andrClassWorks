package com.example.andrclassworks

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class Fragment1: Fragment(R.layout.fragment1) {
    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn = view.findViewById<AppCompatButton>(R.id.btnF1)
        btn.setOnClickListener {
            Toast.makeText(requireContext(), "This is Fragment1", Toast.LENGTH_SHORT).show()
        }
    }

    companion object{
        const val TAG = "Fragment1"
    }

}
