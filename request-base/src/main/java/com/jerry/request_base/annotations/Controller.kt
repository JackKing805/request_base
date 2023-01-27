package com.jerry.request_base.annotations

import com.jerry.request_base.bean.RequestMethod
import java.lang.annotation.Inherited


@Target(AnnotationTarget.CLASS,AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@Bean
annotation class Controller(
    val value:String="",
    val requestMethod: RequestMethod = RequestMethod.GET,
    val isRest:Boolean = false
)
