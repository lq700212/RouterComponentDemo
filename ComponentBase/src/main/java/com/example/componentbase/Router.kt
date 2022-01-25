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
    const val APPLICATION_A = "/Application/AApplication"
    const val APPLICATION_B = "/Application/BApplication"

    /**
     * Activity
     */
    const val ACTIVITY_A_MAIN_ACTIVITY = "/Activity/AMainActivity"
    const val ACTIVITY_B_MAIN_ACTIVITY = "/Activity/BMainActivity"

    /**
     * Dialog
     */
    const val DIALOG_Dialog_Manager_B = "/Dialog/BDialogManager"

    fun navigation(url: String): Any? = ARouter.getInstance().build(url).navigation()
}