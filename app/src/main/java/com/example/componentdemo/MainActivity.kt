package com.example.componentdemo

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.componentdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnToA.setOnClickListener {
            val intent = Intent()
            intent.action = "com.example.componenta.ACTIVITY"
            try {
                startActivity(intent)
            } catch (e: Exception) {
                Toast.makeText(applicationContext, "未找到A", Toast.LENGTH_LONG).show()
            }
        }

        binding.btnToB.setOnClickListener {
            val intent = Intent()
            intent.action = "com.example.componentb.ACTIVITY"
            try {
                startActivity(intent)
            } catch (e: Exception) {
                Toast.makeText(applicationContext, "未找到B", Toast.LENGTH_LONG).show()
            }
        }
    }
}