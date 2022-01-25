package com.example.componentbase

import android.content.Context
import android.content.res.Configuration

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2022/1/25 19:55
 * @Description 描述：
 **/
object ApplicationDispatcher : IModuleApplication {

    /**
     * 各子业务Application对象
     */
    private val mApps = ArrayList<IModuleApplication?>()

    init {
//        if (App.isModuleRunAlone()) {
//            val currentAppRouter: String = BuildConfig.APP_ROUTER
//            if (!TextUtils.isEmpty(currentAppRouter)) {
//                mApps.add(Router.navigation(currentAppRouter) as IModuleApplication)
//            }
//        } else {
        // 完整包模式，添加各业务Application对象
        mApps.add(Router.navigation(Router.APPLICATION_A) as IModuleApplication?)
        mApps.add(Router.navigation(Router.APPLICATION_B) as IModuleApplication?)
//        }
    }

    override fun onCreate() {
        for (app in mApps) app?.onCreate()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        for (app in mApps) app?.onConfigurationChanged(newConfig)
    }

    override fun onTerminate() {
        for (app in mApps) app?.onTerminate()
    }

    override fun onLowMemory() {
        for (app in mApps) app?.onLowMemory()
    }

    override fun init(context: Context?) {

    }
}