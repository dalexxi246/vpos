package com.wh2.vpos.app.navigation.topbar

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.wh2.budgetapp.ui.theme.Typography
import com.wh2.vpos.R
import com.wh2.vpos.app.navigation.NavigationAppState
import com.wh2.vpos.core.ui.designsystem.AppIcons

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopNavigationBar(
    navigationAppState: NavigationAppState,
    onNavigationButtonClicked: () -> Unit = { }
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = navigationAppState.currentTopLevelDestinationTitle,
                style = Typography.headlineSmall,
                fontWeight = FontWeight.SemiBold,
            )
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
        ),
        navigationIcon = {
            IconButton(onClick = onNavigationButtonClicked) {
                Icon(
                    imageVector = AppIcons.Filled.ToggleNavigationDrawer,
                    contentDescription = stringResource(id = R.string.content_description_navigation_side_panel),
                )
            }
        },
    )
}
