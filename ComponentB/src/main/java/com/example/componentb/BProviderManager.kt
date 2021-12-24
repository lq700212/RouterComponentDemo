package com.example.componentb

import android.content.Context
import com.example.componentbase.BaseCallback
import com.example.componentbase.IBProviderManager
import com.example.componentbase.Warehouse

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2021/12/23 18:15
 * @Description 描述：
 **/
object BProviderManager : IBProviderManager() {
    override fun init(context: Context) {
        Warehouse.register("IBProviderManager", BProviderManager)
    }

    override fun showDialog(context: Context, title: String, callback: BaseCallback) {
        DialogManager.showAlertDialog(context, title, callback)
    }
}