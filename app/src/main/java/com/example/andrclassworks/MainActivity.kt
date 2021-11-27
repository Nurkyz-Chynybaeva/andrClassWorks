package com.example.andrclassworks

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.example.andrclassworks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            val email = binding.emailC.text.toString()
            val subject = binding.subjectC.text.toString()
            val message = binding.messageC.text.toString()

            val address = email.split(",".toRegex()).toTypedArray()

            val intent = Intent(Intent.ACTION_SENDTO).apply {

                data = Uri.parse("to:")
                putExtra(Intent.EXTRA_EMAIL, address)
                putExtra(Intent.EXTRA_SUBJECT, subject)
                putExtra(Intent.EXTRA_TEXT, message)
            }
            if (intent.resolveActivity(packageManager) != null){
                startActivity(intent)
            }else{
                Toast.makeText(this@MainActivity, "You do not have any mail applications preinstalled", Toast.LENGTH_SHORT).show()
            }


        }

    }


}