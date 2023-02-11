package com.jerry.request_base.interfaces

import android.content.Context
import com.jerry.rt.core.http.pojo.Request
import com.jerry.rt.core.http.pojo.Response
import com.jerry.request_base.annotations.Configuration
import com.jerry.request_base.bean.ControllerReferrer
import com.jerry.request_base.bean.ControllerResult
import com.jerry.request_base.bean.ResourceReferrer

/**
 * 配置注册类，需要搭配ConfigRegister 注解同时使用
 */
open class IConfig {
    open fun onCreate(){}

    open fun init(annotation: Configuration, clazz: Any){

    }


    open fun onRequestPre(context: Context, request: Request, response: Response, controllerReferrer: ControllerReferrer):Boolean{
        return true
    }

    open fun onRequestEnd(context: Context, request: Request, response: Response, controllerResult: ControllerResult) :Boolean{
        return true
    }

    open fun onResourceRequest(context: Context,request: Request,response: Response,resourceReferrer: ResourceReferrer):Boolean{
        return true
    }
}