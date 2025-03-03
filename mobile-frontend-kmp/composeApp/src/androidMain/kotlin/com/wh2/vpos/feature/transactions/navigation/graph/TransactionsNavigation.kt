package com.wh2.vpos.feature.transactions.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.wh2.vpos.core.ui.navigation.TopLevelDestination
import com.wh2.vpos.feature.transactions.navigation.routes.AddTransactionDestinationParams
import com.wh2.vpos.feature.transactions.navigation.routes.AddTransactionRoute
import com.wh2.vpos.feature.transactions.navigation.routes.TransactionsListRoute

internal fun NavGraphBuilder.transactionsNavigation(navController: NavHostController) {
    composable(TopLevelDestination.Transaction.route) {
        TransactionsListRoute(addTransaction = { navController.navigate(AddTransactionDestinationParams) })
    }
    composable<AddTransactionDestinationParams> {
        AddTransactionRoute()
    }
}