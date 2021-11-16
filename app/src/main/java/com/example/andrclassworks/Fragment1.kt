package com.example.andrclassworks

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.andrclassworks.databinding.Fragment1Binding

class Fragment1 : Fragment(R.layout.fragment1) {

    private var _binding: Fragment1Binding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = Fragment1Binding.bind(view)
        binding.apply {
            txtFragment.text = "hi this is fragment"
            btnFragment.setOnClickListener{
                Toast.makeText(requireContext(), "TOAST" , Toast.LENGTH_SHORT).show()
            }
        }
//        click(5)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun click(clickable: Clickable){
        clickable.clicked()

    }
    interface Clickable {
        fun clicked()
    }








}