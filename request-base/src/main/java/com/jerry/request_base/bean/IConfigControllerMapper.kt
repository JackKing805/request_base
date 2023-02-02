package com.jerry.request_base.bean

import java.lang.reflect.Method

data class IConfigControllerMapper(
    val instance:Any,
    val method: Method
)