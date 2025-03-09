package com.wh2.vpos.views

import com.wh2.vpos.contracts.ViewModelDelegate
import com.wh2.vpos.model.TransactionFilter
import com.wh2.vpos.model.TransactionsListSection

object TransactionsListContract {

    data class State(
        val sections: List<TransactionsListSection> = emptyList(),
        val filters: List<TransactionFilter> = emptyList()
    )

    sealed interface Input

    interface ViewModel: ViewModelDelegate<State, Input>
}