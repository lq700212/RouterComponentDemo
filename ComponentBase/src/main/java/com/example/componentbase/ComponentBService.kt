package com.example.componentbase

import android.content.Context
import com.alibaba.android.arouter.facade.template.IProvider

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2022/1/25 21:03
 * @Description 描述：
 **/
interface ComponentBService : IProvider {
    fun showAlertDialog(context: Context, title: String, callback: BaseCallback)
}