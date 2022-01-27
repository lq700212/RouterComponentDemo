package com.example.componentbase

import android.app.Application
import android.content.res.Configuration
import com.alibaba.android.arouter.launcher.ARouter

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2021/12/24 12:20
 * @Description 描述：
 **/
class RealApplication : Application() {
    private val isDebugARouter = true

    companion object {
        private var mApplication: RealApplication? = null
        fun getRealApplication() = mApplication
    }

    override fun onCreate() {
        super.onCreate()
        mApplication = this
        if (isDebugARouter) {
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this)
        ApplicationDispatcher.onCreate()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        ApplicationDispatcher.onConfigurationChanged(newConfig)
    }

    override fun onLowMemory() {
        super.onLowMemory()
        ApplicationDispatcher.onLowMemory()
    }

    override fun onTerminate() {
        super.onTerminate()
        ApplicationDispatcher.onTerminate()
    }
}