package com.example.componentbase

import android.content.Context
import android.widget.Toast

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2021/12/23 15:29
 * @Description 描述：
 **/
abstract class IBProviderManager : IProvider {
    override fun isNotFound(context: Context) {
        Toast.makeText(context, "未找到B组件", Toast.LENGTH_LONG).show()
    }

    open fun showDialog(context: Context, title: String, callback: BaseCallback) {}
}