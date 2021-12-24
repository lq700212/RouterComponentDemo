package com.example.componentb

import com.example.componentbase.BaseApplication

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2021/12/24 14:44
 * @Description 描述：
 **/
class BApplication : BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        BProviderManager.init(applicationContext)
    }
}