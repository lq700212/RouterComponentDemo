package com.example.componentbase

import android.app.Application
import android.content.Context
import android.content.pm.PackageManager
import java.lang.reflect.Method

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2021/12/24 12:20
 * @Description 描述：
 **/
open class BaseApplication : Application() {
    private val moduleApps = ArrayList<Application>()

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        initModuleApplication()
    }

    override fun onCreate() {
        super.onCreate()
        moduleApps.forEach { it.onCreate() }
    }

    private fun initModuleApplication() {
        val info = packageManager.getApplicationInfo(packageName, PackageManager.GET_META_DATA)
        if (info.metaData == null) {
            return
        }
        val apps = info.metaData.keySet()
        apps.forEach {
            try {
                val cls = Class.forName(it.toString())
                val app = cls.newInstance()
                if (app is Application && cls.name != this::class.java.name) {
                    initModuleAppAttach(app)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    private fun initModuleAppAttach(app: Application) {
        val method: Method? =
            Application::class.java.getDeclaredMethod("attach", Context::class.java)
        if (method != null) {
            method.isAccessible = true
            method.invoke(app, baseContext)
            moduleApps.add(app)
        }
    }
}