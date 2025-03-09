package com.wh2.vpos.feature.transactions.navigation.routes

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.wh2.vpos.feature.transactions.screens.TransactionsListScreen
import com.wh2.vpos.feature.transactions.viewmodels.TransactionsListViewModel
import com.wh2.vpos.views.TransactionsListContract
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun TransactionsListRoute(
    modifier: Modifier = Modifier,
    addTransaction: () -> Unit = {}
) {

    val viewModel: TransactionsListViewModel = koinViewModel()
    val state: TransactionsListContract.State = viewModel.state
        .collectAsStateWithLifecycle(TransactionsListContract.State())
        .value

    TransactionsListScreen(
        state = state,
        modifier = modifier,
        addTransaction = addTransaction,
    )
}
