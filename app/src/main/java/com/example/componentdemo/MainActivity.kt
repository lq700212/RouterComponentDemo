package com.example.componentdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.componentbase.Router
import com.example.componentdemo.databinding.AppActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: AppActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AppActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnToA.setOnClickListener {
            Router.navigation(Router.ACTIVITY_A_MAIN_ACTIVITY)
        }

        binding.btnToB.setOnClickListener {
            Router.navigation(Router.ACTIVITY_B_MAIN_ACTIVITY)
        }
    }
}