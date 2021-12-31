package com.example.componentbase

import android.content.res.Configuration

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2021/12/31 18:03
 * @Description 描述：IApplication的抽象类
 **/
abstract class ModuleApplication : IApplication {
    override fun onCreate() {

    }

    override fun onConfigurationChanged(newConfig: Configuration) {

    }

    override fun onTerminate() {

    }

    override fun onLowMemory() {

    }
}