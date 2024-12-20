package com.wh2.vpos.app.navigation.bottombar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import com.wh2.vpos.core.ui.navigation.TopLevelDestination

@Stable
data class BottomNavigationBarState(
    val availableTopLevelDestinations: List<TopLevelDestination> = listOf(
        TopLevelDestination.Transaction,
        TopLevelDestination.Accounts,
        TopLevelDestination.Categories,
        TopLevelDestination.Budget
    )
)

@Composable
fun rememberBottomNavigationBarState() = remember {
    BottomNavigationBarState()
}
