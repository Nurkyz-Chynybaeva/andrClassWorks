package com.example.andrclassworks

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Fragment1 : Fragment(R.layout.fragment1) {

    private lateinit var listener: OnItemClicked

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnItemClicked

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycler = view.findViewById<RecyclerView>(R.id.recycler)
        val layoutManager = LinearLayoutManager(requireContext())
        val adapter = SimpleAdapter {
            Toast.makeText(requireContext(), "item -$it", Toast.LENGTH_SHORT).show()
            // val fragment2 =

        }

        recycler.layoutManager = layoutManager
        recycler.adapter = adapter
        recycler.addItemDecoration(DividerItemDecoration(requireContext(), RecyclerView.VERTICAL))

        val list = mutableListOf<String>()
        for (i in 0..20) {
            list.add("item - $i")
        }
        adapter.setData(list)
    }
}