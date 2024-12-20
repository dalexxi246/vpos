package com.wh2.vpos.feature.transactions.navigation

import androidx.compose.material3.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.wh2.vpos.core.ui.navigation.TopLevelDestination
import com.wh2.vpos.feature.transactions.screens.TransactionListRoute

internal fun NavGraphBuilder.transactionsNavigation(navController: NavHostController) {
    composable(TopLevelDestination.Transaction.route) {
        TransactionListRoute()
    }
}