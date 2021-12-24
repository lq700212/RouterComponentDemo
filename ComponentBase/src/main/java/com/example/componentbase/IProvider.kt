package com.example.componentbase

import android.content.Context

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2021/12/23 15:23
 * @Description 描述：
 **/
interface IProvider {
    fun init(context: Context)

    fun isNotFound(context: Context)
}