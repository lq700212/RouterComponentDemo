package com.example.componentb

import android.widget.Toast
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.componentbase.ModuleApplication
import com.example.componentbase.RealApplication
import com.example.componentbase.Router

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2021/12/24 14:44
 * @Description 描述：
 **/
@Route(path = Router.APPLICATION_B)
class BApplication : ModuleApplication() {
    override fun onCreate() {
        super.onCreate()
        Toast.makeText(RealApplication.getRealApplication(), "测试A Application", Toast.LENGTH_LONG)
            .show()
    }
}