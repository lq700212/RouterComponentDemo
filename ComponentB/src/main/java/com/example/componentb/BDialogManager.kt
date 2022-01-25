package com.example.componentb

import android.content.Context
import android.content.DialogInterface
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.template.IProvider
import com.example.componentbase.BaseCallback
import com.example.componentbase.IBDialogManager
import com.example.componentbase.Router

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2021/12/23 15:33
 * @Description 描述：
 **/
@Route(path = Router.DIALOG_Dialog_Manager_B)
object BDialogManager : IBDialogManager, IProvider {

    override fun showAlertDialog(context: Context, title: String, callback: BaseCallback) {
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

    override fun init(context: Context?) {

    }
}