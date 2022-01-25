package com.example.componentbase

import android.content.Context

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2022/1/25 21:03
 * @Description 描述：
 **/
interface IBDialogManager {
    fun showAlertDialog(context: Context, title: String, callback: BaseCallback)
}