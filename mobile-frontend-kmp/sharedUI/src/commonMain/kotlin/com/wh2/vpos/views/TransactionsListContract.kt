package com.wh2.vpos.views

import com.wh2.vpos.contracts.ViewModelDelegate
import com.wh2.vpos.model.Transaction

object TransactionsListContract {

    data class State(
        val transactions: List<Transaction> = emptyList()
    )

    sealed interface Input {
        data object GetLatestTransactions: Input
    }

    interface ViewModel: ViewModelDelegate<State, Input>
}