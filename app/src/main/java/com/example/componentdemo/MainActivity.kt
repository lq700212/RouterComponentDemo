package com.example.componentdemo

import android.os.Bundle
import com.example.componentbase.BaseActivity
import com.example.componentbase.Router
import com.example.componentdemo.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnToA.setOnClickListener {
            Router.navigation(Router.ACTIVITY_A_MAIN_ACTIVITY)
        }

        binding.btnToB.setOnClickListener {
            Router.navigation(Router.ACTIVITY_B_MAIN_ACTIVITY)
        }
    }
}