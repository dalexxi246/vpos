package com.wh2.vpos.feature.categories.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.wh2.vpos.core.ui.navigation.TopLevelDestination

internal fun NavGraphBuilder.categoriesNavigation(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    composable(TopLevelDestination.Categories.route) {
        Spacer(
            modifier
                .fillMaxSize()
                .background(Color.Red)
        )
    }
}