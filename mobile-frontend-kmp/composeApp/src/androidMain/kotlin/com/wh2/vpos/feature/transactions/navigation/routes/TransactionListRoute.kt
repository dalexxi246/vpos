package com.wh2.vpos.feature.transactions.navigation.routes

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.wh2.vpos.feature.transactions.screens.TransactionsListScreen
import com.wh2.vpos.feature.transactions.viewmodels.TransactionsListViewModel
import com.wh2.vpos.model.Account
import com.wh2.vpos.model.Category
import com.wh2.vpos.model.CurrencyValue
import com.wh2.vpos.model.Transaction
import com.wh2.vpos.model.TransactionDate
import com.wh2.vpos.views.TransactionsListContract
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun TransactionListRoute(
    addTransaction: () -> Unit = {},
    modifier: Modifier = Modifier
) {

    // TODO DELETE THIS
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

    val viewModel: TransactionsListViewModel = koinViewModel()
    val state = viewModel.state.collectAsStateWithLifecycle(TransactionsListContract.State())

    val getLatestTransactions: () -> Unit = {
        viewModel.processAction(TransactionsListContract.Input.GetLatestTransactions)
    }

    TransactionsListScreen(
        addTransaction = addTransaction,
        getLatestTransactions = getLatestTransactions,
        transactions = state.value.transactions,
        modifier = modifier
    )
}
