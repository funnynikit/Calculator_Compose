package com.app.calculator

data class CState(
    val number1: String = "",
    val number2: String = "",
    val operation: Operation? = null
)