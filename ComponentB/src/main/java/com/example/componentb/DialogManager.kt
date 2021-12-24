package com.example.componentb

import android.content.Context
import android.content.DialogInterface
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.componentbase.BaseCallback

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2021/12/23 15:33
 * @Description 描述：
 **/
object DialogManager {

    fun showAlertDialog(context: Context, title: String, callback: BaseCallback) {
        AlertDialog.Builder(context)
            .setTitle(title)
            .setNegativeButton(
                "否",
                DialogInterface.OnClickListener { _, _ -> callback.onCallback() })
            .setPositiveButton("是", DialogInterface.OnClickListener { _, _ ->
                Toast.makeText(context, "确认成功", Toast.LENGTH_LONG).show()
            })
            .show()
    }
}