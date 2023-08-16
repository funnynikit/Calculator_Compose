package com.app.calculator

sealed class Action {
    data class Number(val number: Int): Action()
    object Clear: Action()
    object Delete: Action()
    data class Operation(val operation: com.app.calculator.Operation): Action()
    object Calculate: Action()
    object Decimal: Action()
}