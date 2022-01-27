package com.example.componenta

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.componenta.databinding.ComponentAActivityMainBinding
import com.example.componentbase.BaseCallback
import com.example.componentbase.ComponentBService
import com.example.componentbase.Router

@Route(path = Router.ACTIVITY_A_MAIN_ACTIVITY)
class AMainActivity : AppCompatActivity() {
    private lateinit var binding: ComponentAActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ComponentAActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenBDialog.setOnClickListener {
            val componentBService =
                Router.navigation(Router.DIALOG_DIALOG_MANAGER_B) as ComponentBService?
            componentBService?.showAlertDialog(this@AMainActivity, "A调用了B", object : BaseCallback {
                override fun onCallback() {
                    Toast.makeText(this@AMainActivity, "A调用B的弹窗成功", Toast.LENGTH_LONG).show()
                }
            })
        }
    }
}