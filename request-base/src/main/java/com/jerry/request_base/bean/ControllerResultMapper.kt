package com.jerry.request_base.bean


data class ControllerResultMapper(
    val isControllerRequest:Boolean,
    val controllerResult:Any?=null
)