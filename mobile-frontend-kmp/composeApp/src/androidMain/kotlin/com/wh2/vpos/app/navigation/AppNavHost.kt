package com.wh2.vpos.app.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.wh2.vpos.feature.accounts.navigation.accountsNavigation
import com.wh2.vpos.feature.budget.navigation.budgetNavigation
import com.wh2.vpos.feature.categories.navigation.categoriesNavigation
import com.wh2.vpos.feature.transactions.navigation.transactionsNavigation

/**
 * AppNavHost is the main [NavHost] that define the navigation across all features.
 * Top-level navigation graphs must be included into the NavHost builder function (NavGraphBuilder)
 *  to enable navigation to all destinations defined under the graph.
 */
@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = NavigationAppState.startDestination
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        transactionsNavigation(navController = navController)
        accountsNavigation(navController = navController)
        budgetNavigation(navController = navController)
        categoriesNavigation(navController = navController, modifier = modifier)
    }
}