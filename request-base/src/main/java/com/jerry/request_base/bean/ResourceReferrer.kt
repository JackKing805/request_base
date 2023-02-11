package com.jerry.request_base.bean

import java.lang.reflect.Method

data class ResourceReferrer(
    val referrerPath:String,
    val resourcesPath:String,
)