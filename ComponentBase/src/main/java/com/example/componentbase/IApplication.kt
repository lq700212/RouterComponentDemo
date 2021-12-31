package com.example.componentbase

import android.content.res.Configuration

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2021/12/31 15:51
 * @Description 描述：模拟Application生命周期的接口
 **/
interface IApplication {
    fun onCreate()

    fun onConfigurationChanged(newConfig: Configuration)

    fun onTerminate()

    fun onLowMemory()
}