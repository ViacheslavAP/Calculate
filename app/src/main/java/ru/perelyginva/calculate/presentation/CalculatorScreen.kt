package ru.perelyginva.calculate.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.perelyginva.calculate.domain.ButtonAction
import ru.perelyginva.calculate.domain.MathOperation
import ru.perelyginva.calculate.ui.theme.BackgroundGray
import ru.perelyginva.calculate.ui.theme.CalculateTheme

@Composable
fun CalculatorScreen(
    state: CalculatorState,
    onButtonPress: (ButtonAction) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundGray)
            .padding(horizontal = 8.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalAlignment = Alignment.End
    ) {
        HistoryDisplay(
            state = state,
            modifier = Modifier.weight(1f))
        DisplayScreen(state = state)
         Keypad(onButtonPress = onButtonPress)
    }

}

@Preview
@Composable
fun CalculatorScreenPreview(){
    CalculateTheme {
        var state = CalculatorState()
        state = state.copy(
            displayNumber = "3.14",
            number1 = "3",
            number2 = "3.14",
            operation = MathOperation.Multiplication,
            currentEquation = "3 * 3.14",
            equations = listOf("7 * 7 = 49", "16 / 2 = 8", "2 + 8 = 10", "14 - 8 = 6 "),


        )
         CalculatorScreen(state = state, onButtonPress = {})
    }
}