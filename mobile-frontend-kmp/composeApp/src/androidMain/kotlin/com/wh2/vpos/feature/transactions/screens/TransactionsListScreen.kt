@file:OptIn(
    ExperimentalMaterial3Api::class,
    ExperimentalFoundationApi::class,
)

package com.wh2.vpos.feature.transactions.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wh2.vpos.R
import com.wh2.vpos.core.ui.designsystem.AppIcons
import com.wh2.vpos.core.ui.designsystem.CreateIcon
import com.wh2.vpos.core.ui.designsystem.ImageVectorIcon
import com.wh2.vpos.core.ui.theme.AppTheme
import com.wh2.vpos.model.TransactionsListSection
import com.wh2.vpos.model.Account
import com.wh2.vpos.model.TransactionCategory
import com.wh2.vpos.model.CurrencyValue
import com.wh2.vpos.model.Transaction
import com.wh2.vpos.model.TransactionDate
import com.wh2.vpos.model.TransactionFilter
import com.wh2.vpos.views.TransactionsListContract

@Composable
fun TransactionsListScreen(
    state: TransactionsListContract.State,
    addTransaction: () -> Unit,
    modifier: Modifier = Modifier,
    onFilterSelected: (TransactionFilter) -> Unit = {},
    onTransactionSelected: (Transaction) -> Unit = {},
    onNavigationButtonClicked: () -> Unit = {},
    transactionFilters: List<TransactionFilter> = emptyList(),
) {

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .then(modifier),
        floatingActionButton = {
            FloatingActionButton(onClick = addTransaction) {
                Icon(
                    imageVector = AppIcons.Filled.AddNewItem,
                    contentDescription = "add new transaction",
                )
            }
        },
        topBar = { TransactionsScreenAppBar(onNavigationButtonClicked = onNavigationButtonClicked) },
        content = {
            Column(modifier = Modifier.padding(it)) {
                TransactionFilters(
                    filters = transactionFilters,
                )
                TransactionsList(
                    state = state.sections,
                )
            }
        },
    )
}

@Composable
fun TransactionFilters(
    filters: List<TransactionFilter> = emptyList(),
    onFilterSelected: (TransactionFilter) -> Unit = {}
) {
    if (filters.isEmpty().not()) {
        LazyRow(
            modifier = Modifier.padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(end = 8.dp),
        ) {
            item {
                IconButton(
                    onClick = {},
                    modifier = Modifier.wrapContentSize(),
                ) {
                    Icon(
                        imageVector = AppIcons.Filled.FilterList,
                        contentDescription = stringResource(R.string.more_transaction_filters),
                    )
                }
            }
            items(
                items = filters,
                key = { it.id },
            ) {
                FilterChip(
                    selected = it.selected,
                    onClick = { onFilterSelected.invoke(it) },
                    label = { Text(it.name) },
                    shape = CircleShape,
                )
            }
        }
    }
}

@Composable
private fun TransactionsScreenAppBar(onNavigationButtonClicked: () -> Unit = { }) {
    CenterAlignedTopAppBar(
        title = { Text(text = "Transacciones") },
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

@Composable
fun TransactionsList(
    modifier: Modifier = Modifier,
    state: List<TransactionsListSection>
) {
    LazyColumn(modifier = Modifier.then(modifier)) {
        state.forEach { sectionData ->
            stickyHeader(sectionData.date) {
                Text(sectionData.date)
            }
            items(sectionData.transactions) { transaction ->
                TransactionItem(transaction)
            }
        }
    }
}

@Composable
private fun TransactionItem(transaction: Transaction) {
    ListItem(
        headlineContent = { Text(transaction.category.name) },
        supportingContent = { Text(transaction.description) },
        trailingContent = { Text(transaction.amount.stringValue) },
        leadingContent = {
            ImageVectorIcon(AppIcons.Outlined.Transfers).CreateIcon(
                // TODO: Change icon based on category (create extension function to get ImageVectorIcon)
                contentDescription = "",
            )
        },
    )
}

@Preview
@Composable
private fun PreviewTransactionsListScreen() {
    val mockTransactions = buildList {
        add(
            TransactionsListSection(
                date = "Febrero 7",
                transactions = buildList {
                    repeat(10) {
                        add(
                            Transaction(
                                id = "id-$it",
                                amount = CurrencyValue(stringValue = "$ 99,00"),
                                description = "pertinacia $it",
                                category = TransactionCategory(
                                    id = "ipsum",
                                    name = "Rigoberto Armstrong",
                                ),
                                date = TransactionDate(value = "dui"),
                                account = Account(id = "omittantur"),
                            ),
                        )
                    }
                },
            ),
        )
        add(
            TransactionsListSection(
                date = "Febrero 10",
                transactions = buildList {
                    repeat(50) {
                        add(
                            Transaction(
                                id = "id-$it",
                                amount = CurrencyValue(stringValue = "$ 99,00"),
                                description = "pertinacia $it",
                                category = TransactionCategory(
                                    id = "ipsum",
                                    name = "Rigoberto Armstrong",
                                ),
                                date = TransactionDate(value = "dui"),
                                account = Account(id = "omittantur"),
                            ),
                        )
                    }
                },
            ),
        )
    }
    val mockFilters = emptyList<TransactionFilter>()

    AppTheme {
        TransactionsListScreen(
            state = TransactionsListContract.State(
                sections = mockTransactions,
                filters = mockFilters,
            ),
            addTransaction = { },
        )
    }
}