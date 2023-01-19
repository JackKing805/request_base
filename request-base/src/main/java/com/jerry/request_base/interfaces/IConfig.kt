package com.jerry.request_base.interfaces

import android.content.Context
import com.jerry.rt.core.http.pojo.Request
import com.jerry.rt.core.http.pojo.Response
import com.jerry.request_base.annotations.Configuration
import com.jerry.rt.core.http.pojo.s.IResponse

/**
 * 配置注册类，需要搭配ConfigRegister 注解同时使用
 */
abstract class IConfig {
    abstract fun init(annotation: Configuration, clazz: Class<*>)

    abstract fun onRequest(context: Context,request: Request,response: IResponse):Boolean
}