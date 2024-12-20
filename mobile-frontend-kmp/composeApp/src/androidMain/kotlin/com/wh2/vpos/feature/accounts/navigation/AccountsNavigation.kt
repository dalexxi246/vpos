package com.wh2.vpos.feature.accounts.navigation

import androidx.compose.material3.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.wh2.vpos.core.ui.navigation.TopLevelDestination

internal fun NavGraphBuilder.accountsNavigation(navController: NavHostController) {
    composable(TopLevelDestination.Accounts.route) {
        Text("Accounts")
    }
}