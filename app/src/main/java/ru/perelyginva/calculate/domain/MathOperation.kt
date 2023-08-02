package ru.perelyginva.calculate.domain

sealed class MathOperation(val symbol: String){
    object Addition: MathOperation("+")
    object Subtraction: MathOperation("-")
    object Multiplication: MathOperation("*")
    object Division: MathOperation("/")
}
