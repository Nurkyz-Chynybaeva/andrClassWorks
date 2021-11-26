package com.example.andrclassworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

//        val recycler = findViewById<RecyclerView>(R.id.recycler)
//        val layoutManager = LinearLayoutManager(this)
//        val adapter = SimpleAdapter {
//            Toast.makeText(this, "ITEM -$it", Toast.LENGTH_SHORT).show()
//           val fragment = supportFragmentManager.beginTransaction()
//                fragment.add(R.id.container, Fragment1())
//                fragment.commit()
//
////            val intent = Intent(this, MainActivity2::class.java)
////            intent.putExtra("text", "item - $it")
////            startActivity(intent)
//        }
//
//        recycler.layoutManager = layoutManager
//        recycler.adapter = adapter
//        recycler.addItemDecoration(DividerItemDecoration(this, RecyclerView.VERTICAL))
//
//        val list = mutableListOf<String>()
//        for (i in 0..20) {
//            list.add("ITEM -$i")
//        }
//        adapter.setData(list)
        }
}