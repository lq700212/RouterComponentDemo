package com.example.componentbase

import com.alibaba.android.arouter.launcher.ARouter

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2022/1/25 20:20
 * @Description 描述：
 **/
object Router {
    /**
     * Application
     */
    const val APPLICATION_A = "/componentA/AApplication"
    const val APPLICATION_B = "/componentB/BApplication"

    /**
     * Activity
     */
    const val ACTIVITY_A_MAIN_ACTIVITY = "/componentA/AMainActivity"
    const val ACTIVITY_B_MAIN_ACTIVITY = "/componentB/BMainActivity"

    /**
     * Dialog
     */
    const val DIALOG_DIALOG_MANAGER_B = "/componentB/BDialogManager"

    fun navigation(url: String): Any? = ARouter.getInstance().build(url).navigation()
}