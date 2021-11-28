package com.example.andrclassworks

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment

class Fragment3: Fragment(R.layout.fragment3) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn = view.findViewById<AppCompatButton>(R.id.btnF3)
        btn.setOnClickListener {
            Toast.makeText(requireContext(), "This is Fragment3", Toast.LENGTH_SHORT).show()
        }
    }

    companion object{
        const val TAG = "Fragment3"
    }
}