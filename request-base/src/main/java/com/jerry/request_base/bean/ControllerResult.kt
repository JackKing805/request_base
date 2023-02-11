package com.jerry.request_base.bean


data class ControllerResult(
    val controllerReferrer: ControllerReferrer,
    val controllerResult:Any
)