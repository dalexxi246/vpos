package com.wh2.vpos.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.wh2.vpos.core.ui.theme.AppTheme
import com.wh2.vpos.app.ui.state.BottomNavigationBarState
import com.wh2.vpos.app.ui.state.NavigationAppState
import com.wh2.vpos.app.ui.state.rememberBottomNavigationBarState
import com.wh2.vpos.app.ui.state.rememberNavigationAppState

@Composable
internal fun App(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    navigationAppState: NavigationAppState = rememberNavigationAppState(
        navController,
        LocalContext.current
    ),
    bottomNavigationBarState: BottomNavigationBarState = rememberBottomNavigationBarState()

) {
    AppTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize().then(modifier),
            bottomBar = {
                BottomNavigationBar(
                    bottomNavigationBarState = bottomNavigationBarState,
                    navController = navController,
                    navigationAppState = navigationAppState
                )
            },
            content = {
                Text("Hello", modifier = Modifier.padding(it))
            }
        )
    }
}

@Composable
private fun BottomNavigationBar(
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
        bottomNavigationBarState = rememberBottomNavigationBarState(), navController = rememberNavController(), navigationAppState = rememberNavigationAppState(
            navController = rememberNavController(),
            context = LocalContext.current
        )
    )
}