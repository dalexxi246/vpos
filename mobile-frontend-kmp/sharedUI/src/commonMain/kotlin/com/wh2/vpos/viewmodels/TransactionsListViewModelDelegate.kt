package com.wh2.vpos.viewmodels

import com.wh2.vpos.model.Account
import com.wh2.vpos.model.Category
import com.wh2.vpos.model.CurrencyValue
import com.wh2.vpos.model.Transaction
import com.wh2.vpos.model.TransactionDate
import com.wh2.vpos.views.TransactionsListContract
import com.wh2.vpos.views.TransactionsListContract.State
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class TransactionsListViewModelDelegate(
    coroutineScope: CoroutineScope = CoroutineScope(Dispatchers.Main.immediate + SupervisorJob())
) : TransactionsListContract.ViewModel {

    override val state: StateFlow<State> = mockTransactions.map {
        State(transactions = it)
    }.stateIn(
        scope = coroutineScope,
        started = SharingStarted.WhileSubscribed(stopTimeoutMillis = 5_000),
        initialValue = State()
    )

    override fun processAction(input: TransactionsListContract.Input) {
        // TODO Pending implementation of inputs
    }
}

private val mockTransactions = flow {
    emit(buildList {
        repeat(100) {
            add(
                Transaction(
                    id = "id-$it",
                    amount = CurrencyValue(stringValue = "$ 99,00"),
                    description = "pertinacia $it",
                    category = Category(id = "ipsum", name = "Rigoberto Armstrong"),
                    date = TransactionDate(value = "dui"),
                    account = Account(id = "omittantur")
                )
            )
        }
    })
}