package com.jerry.request_base.annotations

/**
 * 从bean中注入
 */

@Target(AnnotationTarget.FIELD,AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.RUNTIME)
annotation class Inject(
    val name:String=""
)
