package com.wh2.vpos.app.navigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.wh2.vpos.core.ui.designsystem.CreateIcon
import com.wh2.vpos.core.ui.navigation.TopLevelDestination

@Stable
class NavigationAppState(
    private val navController: NavController,
    private val context: Context
) {

    companion object {
        val startDestination = TopLevelDestination.Transaction.route
    }

    private val currentDestination: NavDestination?
        @Composable get() = navController.currentBackStackEntryAsState().value?.destination

    /**
     * The currently selected top level position.
     *
     * It returns a [TopLevelDestination] that matches with the current route
     * (should be the value of any NAV_ROUTE_* string constant).
     */
    private val currentTopLevelDestination: TopLevelDestination?
        @Composable get() = when (currentDestination?.route) {
            TopLevelDestination.Categories.route -> TopLevelDestination.Categories
            TopLevelDestination.Transaction.route -> TopLevelDestination.Transaction
            TopLevelDestination.Budget.route -> TopLevelDestination.Budget
            TopLevelDestination.Accounts.route -> TopLevelDestination.Accounts
            else -> null
        }

    @Composable
    fun SelectedDestinationIcon(destination: TopLevelDestination, colorTint: Color) {
        if (destination == currentTopLevelDestination) {
            destination.selectedIcon.CreateIcon(
                contentDescription = context.getString(destination.iconTextId),
                colorTint = colorTint
            )
        } else {
            destination.unselectedIcon.CreateIcon(
                contentDescription = context.getString(destination.iconTextId),
                colorTint = colorTint
            )
        }
    }
}

@Composable
fun rememberNavigationAppState(
    navController: NavController,
    context: Context
) = remember { NavigationAppState(navController, context) }