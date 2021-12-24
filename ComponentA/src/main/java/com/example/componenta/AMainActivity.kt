package com.example.componenta

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.componenta.databinding.ActivityMainABinding
import com.example.componentbase.BaseCallback
import com.example.componentbase.IBProviderManager
import com.example.componentbase.Warehouse

class AMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainABinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenBDialog.setOnClickListener {
            val bProviderManager = Warehouse.get("IBProviderManager") as IBProviderManager?
            bProviderManager?.showDialog(this@AMainActivity, "A调用B的弹窗", object : BaseCallback {
                override fun onCallback() {
                    Toast.makeText(this@AMainActivity, "A调用B的弹窗成功", Toast.LENGTH_LONG).show()
                }
            })
        }
    }
}