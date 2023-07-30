package ru.perelyginva.calculate.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.perelyginva.calculate.ui.theme.CalculateTheme
import ru.perelyginva.calculate.ui.theme.ScreenBackground

@Composable
fun HistoryDisplay(state: CalculatorState, modifier: Modifier = Modifier) {

    val listState = rememberLazyListState()
    LaunchedEffect(state.equations.size) {
        listState.animateScrollToItem(index = state.equations.size)
    }

    LazyColumn(
        state = listState,
        modifier = modifier
    ) {
        items(state.equations) { eqation ->
            Row(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(15.dp))
                    .background(ScreenBackground)
                    .padding(4.dp)
            ) {
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = eqation,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    fontSize = 28.sp,
                    modifier = Modifier
                        .background(ScreenBackground)
                )
                Spacer(modifier = Modifier.width(4.dp))
            }
            Spacer(modifier = Modifier.height(4.dp))
        }
    }
}
@Preview
@Composable
fun HistoryPreview(){
     CalculateTheme {
         var state = CalculatorState()
         state = state.copy(
           equations = listOf("7 * 7 = 49", "16 / 2 = 8", "2 + 8 = 10", "14 - 8 = 6 ")
         )
         HistoryDisplay(state = state)
     }
}