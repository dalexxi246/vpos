package com.wh2.vpos.views

import com.wh2.vpos.model.Transaction

object TransactionsListContract {

    data class State(
        val transactions: List<Transaction>
    )

    sealed interface Inputs {
        data object GetLatestTransactions: Inputs
    }

    interface ViewModel
}