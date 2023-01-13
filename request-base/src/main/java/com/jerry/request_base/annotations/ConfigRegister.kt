package com.jerry.request_base.annotations

import java.lang.annotation.Inherited
import kotlin.reflect.KClass

/**
 * 配置注册注解，需要搭配IConfig同时使用
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Inherited
annotation class ConfigRegister(
  val priority:Int = 0,
  val registerClass:KClass<*> = Any::class
)
