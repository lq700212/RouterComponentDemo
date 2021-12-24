package com.example.componentb

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.componentb.databinding.ActivityMainBBinding
import com.example.componentbase.BaseCallback

class BMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowDialog.setOnClickListener {
            DialogManager.showAlertDialog(this, "我是弹窗，是否点击关闭", object : BaseCallback {
                override fun onCallback() {
                    Toast.makeText(application, "关闭取消", Toast.LENGTH_LONG).show()
                }
            })
        }
    }
}