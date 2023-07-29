package ru.perelyginva.calculate.domain

data class ButtonData(
    val text: String,
    val onPress: () -> Unit
)
