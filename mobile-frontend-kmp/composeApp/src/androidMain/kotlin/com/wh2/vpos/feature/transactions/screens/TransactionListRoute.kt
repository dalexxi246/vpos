@file:OptIn(ExperimentalMaterial3Api::class)

package com.wh2.vpos.feature.transactions.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.UiMode
import com.wh2.vpos.core.ui.designsystem.AppIcons
import com.wh2.vpos.core.ui.theme.AppTheme

@Composable
fun TransactionListRoute(
    modifier: Modifier = Modifier,
    addTransaction: () -> Unit = {}
) {
    TransactionsListScreen(addTransaction = addTransaction)
}

@Composable
fun TransactionsListScreen(modifier: Modifier = Modifier, addTransaction: () -> Unit) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .then(modifier),
        floatingActionButton = {
            CompositionLocalProvider() {
                FloatingActionButton(onClick = addTransaction) {
                    Icon(
                        imageVector = AppIcons.Filled.AddNewItem,
                        contentDescription = "add new transaction"
                    )
                }
            }
        },
        topBar = {
            TransactionsScreenAppBar()
        }
    ) {
        TransactionsList(modifier = Modifier.padding(it))
    }
}

@Composable
private fun TransactionsScreenAppBar() {
    TopAppBar(
        title = { Text(text = "Transacciones") },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        navigationIcon = {
//            IconButton(onClick = { /*TODO*/ }) {
//                Icon(
//                    imageVector = AppIcons.Filled.ToggleNavigationDrawer,
////                    contentDescription = stringResource(id = CoreUiR.string.content_description_navigation_side_panel)
//                    contentDescription = "open side options"
//                )
//            }
        }
    )
}


@Composable
fun TransactionsList(modifier: Modifier = Modifier) {
    // TODO Create transaction data class
    Column {
        (0..100).forEach {
            Text("Transaccion $it")
        }
    }
}

@Preview
@Composable
private fun PreviewTransactionsListScreen() {
    AppTheme { TransactionsListScreen(addTransaction = { }) }
}