package ru.perelyginva.calculate.presentation

import ru.perelyginva.calculate.domain.MathOperation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val displayNumber: String = "0",
    val operation: MathOperation? = null,
    val currentEquation: String = "",
    val equation: List<String> = emptyList()
)
