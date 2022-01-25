package com.example.componentbase

import android.content.Context
import android.content.res.Configuration

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2022/1/25 20:37
 * @Description 描述：
 **/
abstract class ModuleApplication : IModuleApplication {
    override fun onCreate() {

    }

    override fun onConfigurationChanged(newConfig: Configuration) {

    }

    override fun onTerminate() {

    }

    override fun onLowMemory() {

    }

    override fun init(context: Context?) {

    }
}