package com.example.componentb

import android.os.Bundle
import android.widget.Toast
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.componentb.databinding.ComponentBActivityMainBinding
import com.example.componentbase.BaseActivity
import com.example.componentbase.BaseCallback
import com.example.componentbase.Router

@Route(path = Router.ACTIVITY_B_MAIN_ACTIVITY)
class BMainActivity : BaseActivity() {
    private lateinit var binding: ComponentBActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ComponentBActivityMainBinding.inflate(layoutInflater)
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