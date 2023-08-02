package ru.perelyginva.calculate.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import ru.perelyginva.calculate.presentation.CalculatorScreen
import ru.perelyginva.calculate.presentation.CalculatorState
import ru.perelyginva.calculate.presentation.CalculatorViewModel
import ru.perelyginva.calculate.ui.theme.CalculateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculateTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                CalculatorScreen(
                    state = state,
                    onButtonPress = viewModel::onButton
                )
            }
        }
    }
}


