package ru.perelyginva.calculate

 import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.perelyginva.calculate.presentation.CalculatorScreen
import ru.perelyginva.calculate.presentation.CalculatorState
import ru.perelyginva.calculate.ui.theme.CalculateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculateTheme {
                val state = CalculatorState()
                CalculatorScreen(
                    state = state,
                    onButtonPress = {

                    }
                )
            }
        }
    }
}


