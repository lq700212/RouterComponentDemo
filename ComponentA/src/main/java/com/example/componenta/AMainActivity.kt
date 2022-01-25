package com.example.componenta

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.componenta.databinding.ActivityMainABinding
import com.example.componentbase.BaseCallback
import com.example.componentbase.IBDialogManager
import com.example.componentbase.Router

@Route(path = Router.ACTIVITY_A_MAIN_ACTIVITY)
class AMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainABinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenBDialog.setOnClickListener {
            val bDialogManager =
                (Router.navigation(Router.DIALOG_Dialog_Manager_B) as IBDialogManager?)
            bDialogManager?.showAlertDialog(this@AMainActivity, "A调用了B", object : BaseCallback {
                override fun onCallback() {
                    Toast.makeText(this@AMainActivity, "A调用B的弹窗成功", Toast.LENGTH_LONG).show()
                }
            })
        }
    }
}