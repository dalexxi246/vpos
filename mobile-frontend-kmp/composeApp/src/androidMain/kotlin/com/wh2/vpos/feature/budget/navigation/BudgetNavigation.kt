package com.wh2.vpos.feature.budget.navigation

import androidx.compose.material3.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.wh2.vpos.core.ui.navigation.TopLevelDestination

internal fun NavGraphBuilder.budgetNavigation(navController: NavHostController) {
    composable(TopLevelDestination.Budget.route) {
        Text("Budget")
    }
}