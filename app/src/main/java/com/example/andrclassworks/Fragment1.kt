package com.example.andrclassworks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Fragment1: Fragment(R.layout.fragment1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//
//        val recycler = view.findViewById<RecyclerView>(R.id.recycler)
//        val layoutManager = LinearLayoutManager(this@Fragment1)
//        val adapter = SimpleAdapter {
//
//            requireContext()
////            val oFragment =
////            intent.putExtra("text", "item - $it")
////            startActivity(intent)
//
//        }
//        recycler.layoutManager = layoutManager
//        recycler.adapter = adapter
//        recycler.addItemDecoration(DividerItemDecoration(this@Fragment1, RecyclerView.VERTICAL))
//
//        val list = mutableListOf<String>()
//        for (i in 0..20) {
//            list.add("ITEM -$i")
//        }
//        adapter.setData(list)
//    }
}


    fun setText(enteredText: String){
        
    }

}