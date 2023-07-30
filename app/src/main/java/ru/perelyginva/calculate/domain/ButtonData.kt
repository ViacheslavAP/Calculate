package ru.perelyginva.calculate.domain

data class ButtonData(
    var text: String,
    val onPress: () -> Unit
)
