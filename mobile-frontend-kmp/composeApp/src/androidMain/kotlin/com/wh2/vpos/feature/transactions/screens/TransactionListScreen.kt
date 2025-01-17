@file:OptIn(ExperimentalMaterial3Api::class)

package com.wh2.vpos.feature.transactions.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wh2.vpos.core.ui.designsystem.AppIcons
import com.wh2.vpos.core.ui.designsystem.CreateIcon
import com.wh2.vpos.core.ui.designsystem.ImageVectorIcon
import com.wh2.vpos.core.ui.theme.AppTheme
import com.wh2.vpos.model.Account
import com.wh2.vpos.model.Category
import com.wh2.vpos.model.CurrencyValue
import com.wh2.vpos.model.Transaction
import com.wh2.vpos.model.TransactionDate

@Composable
fun TransactionsListScreen(
    transactions: List<Transaction>,
    addTransaction: () -> Unit,
    getLatestTransactions: () -> Unit,
    modifier: Modifier = Modifier
) {
    LaunchedEffect(Unit) {
        getLatestTransactions()
    }

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .then(modifier),
        floatingActionButton = {
            FloatingActionButton(onClick = addTransaction) {
                Icon(
                    imageVector = AppIcons.Filled.AddNewItem,
                    contentDescription = "add new transaction"
                )
            }
        },
        topBar = { TransactionsScreenAppBar() },
        content = {
            TransactionsList(
                transactions = transactions,
                modifier = Modifier.padding(it)
            )
        }
    )
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
fun TransactionsList(
    transactions: List<Transaction>,
    modifier: Modifier = Modifier
) {
    // TODO Create transaction data class
    LazyColumn {
        items(transactions) {
            TransactionItem(it)
        }
    }
}

@Composable
private fun TransactionItem(transaction: Transaction) {
    ListItem(
        headlineContent = { Text(transaction.category.name) },
        supportingContent = { Text(transaction.description) },
        trailingContent = { Text("${transaction.amount.stringValue}") },
        leadingContent = {
            ImageVectorIcon(AppIcons.Outlined.Transfers).CreateIcon(
                // TODO: Change icon based on category (create extension function to get ImageVectorIcon)
                contentDescription = ""
            )
        }
    )
}

@Preview
@Composable
private fun PreviewTransactionsListScreen() {
    val mockTransactions = buildList {
        repeat(100) {
            add(
                Transaction(
                    id = "mei",
                    amount = CurrencyValue(stringValue = "$ 99,00"),
                    description = "pertinacia",
                    category = Category(id = "ipsum", name = "Rigoberto Armstrong"),
                    date = TransactionDate(value = "dui"),
                    account = Account(id = "omittantur")
                )
            )
        }
    }

    AppTheme {
        TransactionsListScreen(
            addTransaction = { },
            getLatestTransactions = { },
            transactions = mockTransactions
        )
    }
}