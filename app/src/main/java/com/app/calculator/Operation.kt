package com.app.calculator

sealed class Operation(val symbol: String) {
    object Add: Operation("+")
    object Subtract: Operation("-")
    object Multiply: Operation("x")
    object Divide: Operation("/")
}
