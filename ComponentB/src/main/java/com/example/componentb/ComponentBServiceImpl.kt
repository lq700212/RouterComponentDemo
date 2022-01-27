package com.example.componentb

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.componentbase.BaseCallback
import com.example.componentbase.ComponentBService
import com.example.componentbase.Router

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2021/12/23 15:33
 * @Description 描述：
 **/
@Route(path = Router.DIALOG_DIALOG_MANAGER_B)
class ComponentBServiceImpl : ComponentBService {
    override fun showAlertDialog(context: Context, title: String, callback: BaseCallback) {
        DialogManager.showAlertDialog(context, title, callback)
    }

    override fun init(context: Context?) {

    }
}