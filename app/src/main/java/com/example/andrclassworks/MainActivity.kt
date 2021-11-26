package com.example.andrclassworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG, "Berg: onCreate")

        val text = findViewById<TextView>(R.id.txtM1)
        val button = findViewById<Button>(R.id.btnM1)

        button.setOnClickListener {
//            val intent = Intent(this, MainActivity2::class.java)
//            startActivity(intent)

            val expr = "2+2*2"
            val exprs = ExpressionBuilder(expr).build()
            val result = exprs.evaluate()
            text.text = result.toString()

        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("key", "value")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val value = savedInstanceState.getString("key")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "Berg: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "Berg: onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "Berg: onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "Berg: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "Berg: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "Berg: onDestroy")
    }

    companion object {
        private const val TAG = "MainActivity1"
    }
}