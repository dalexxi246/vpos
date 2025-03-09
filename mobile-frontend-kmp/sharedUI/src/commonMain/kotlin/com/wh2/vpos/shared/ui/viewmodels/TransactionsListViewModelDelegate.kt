package com.wh2.vpos.shared.ui.viewmodels

import com.wh2.vpos.usecases.GetTransactions
import com.wh2.vpos.shared.ui.views.TransactionsListContract
import com.wh2.vpos.shared.ui.views.TransactionsListContract.State
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.stateIn

class TransactionsListViewModelDelegate(
    getTransactions: GetTransactions,
    scope: CoroutineScope = CoroutineScope(Dispatchers.Main.immediate + SupervisorJob())
) : TransactionsListContract.ViewModel {

    override val state: StateFlow<State> = combine(
        getTransactions.invoke(),
        flowOf(emptyList()),
        ::State,
    ).stateIn(
        scope = scope,
        started = SharingStarted.WhileSubscribed(stopTimeoutMillis = 5_000),
        initialValue = State(),
    )

    override fun processAction(input: TransactionsListContract.Input) {
        // TODO Pending implementation of inputs
    }
}