package com.example.componentbase

/**
 * @author 作者：ryan.lei
 * @date 创建时间：2021/12/23 18:51
 * @Description 描述：
 **/
object Warehouse {
    private val providers = hashMapOf<String, IProvider>()

    fun register(key: String, provider: IProvider) {
        providers[key] = provider
    }

    fun get(key: String): IProvider? =
        if (providers.containsKey(key) && providers[key] != null) providers[key] else null
}