package com.wh2.vpos.viewmodels

import com.wh2.vpos.model.TransactionFilter
import com.wh2.vpos.usecases.GetTransactions
import com.wh2.vpos.views.TransactionsListContract
import com.wh2.vpos.views.TransactionsListContract.State
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.stateIn

class TransactionsListViewModelDelegate(
    getTransactions: GetTransactions
) : TransactionsListContract.ViewModel {

    private val scope = CoroutineScope(Dispatchers.Main.immediate + SupervisorJob())

    override val state: StateFlow<State> = combine(
        getTransactions.invoke(),
        emptyFlow<List<TransactionFilter>>(),
    ) { sections, filters -> State(sections, filters) }.stateIn(
        scope = scope,
        started = SharingStarted.WhileSubscribed(stopTimeoutMillis = 5_000),
        initialValue = State(),
    )

    override fun processAction(input: TransactionsListContract.Input) {
        // TODO Pending implementation of inputs
    }
}
