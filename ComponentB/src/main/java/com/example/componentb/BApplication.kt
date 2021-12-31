package com.example.componentb

import com.example.componentbase.ModuleApplication

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2021/12/24 14:44
 * @Description 描述：
 **/
class BApplication : ModuleApplication() {
    override fun onCreate() {
        BProviderManager.init(applicationContext)
    }
}