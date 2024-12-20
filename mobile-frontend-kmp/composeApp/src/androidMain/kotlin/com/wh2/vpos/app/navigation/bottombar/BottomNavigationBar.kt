package com.wh2.vpos.app.navigation.bottombar

import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.wh2.vpos.app.navigation.NavigationAppState
import com.wh2.vpos.app.navigation.rememberNavigationAppState

@Composable
internal fun BottomNavigationBar(
    bottomNavigationBarState: BottomNavigationBarState,
    navController: NavHostController,
    navigationAppState: NavigationAppState
) {
    NavigationBar {
        bottomNavigationBarState.availableTopLevelDestinations.forEach { destination ->
            NavigationBarItem(
                selected = false,
                onClick = {
                    navController.navigate(destination.route) {
                        launchSingleTop = true
                        popUpTo(destination.route) {
                            inclusive = true
                        }
                    }
                },
                icon = {
                    navigationAppState.SelectedDestinationIcon(
                        destination = destination,
                        colorTint = Color.Black
                    )
                },
                enabled = true,
                label = { Text(text = stringResource(id = destination.iconTextId)) },
                alwaysShowLabel = true
            )
        }
    }
}

@Preview
@Composable
private fun BottomNavigationBarPreview() {
    BottomNavigationBar(
        bottomNavigationBarState = rememberBottomNavigationBarState(),
        navController = rememberNavController(),
        navigationAppState = rememberNavigationAppState(
            navController = rememberNavController(),
            context = LocalContext.current
        )
    )
}