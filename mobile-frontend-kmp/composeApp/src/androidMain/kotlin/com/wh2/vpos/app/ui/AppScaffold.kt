package com.wh2.vpos.app.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.wh2.vpos.app.navigation.AppNavHost
import com.wh2.vpos.app.navigation.bottombar.BottomNavigationBar
import com.wh2.vpos.core.ui.theme.AppTheme
import com.wh2.vpos.app.navigation.bottombar.BottomNavigationBarState
import com.wh2.vpos.app.navigation.NavigationAppState
import com.wh2.vpos.app.navigation.bottombar.rememberBottomNavigationBarState
import com.wh2.vpos.app.navigation.rememberNavigationAppState

@Composable
internal fun AppScaffold(
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
                AppNavHost(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(it),
                    navController = navController
                )
            }
        )
    }
}

