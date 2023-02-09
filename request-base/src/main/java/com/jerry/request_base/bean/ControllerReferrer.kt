package com.jerry.request_base.bean

import java.lang.reflect.Method

data class ControllerReferrer(
    val path:String,
    val instance:Any,
    val method: Method,
)