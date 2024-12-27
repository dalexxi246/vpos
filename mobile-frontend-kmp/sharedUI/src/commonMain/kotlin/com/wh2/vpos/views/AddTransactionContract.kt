package com.wh2.vpos.views

import com.wh2.vpos.contracts.ViewModelDelegate
import com.wh2.vpos.model.Category
import com.wh2.vpos.model.CurrencyValue
import com.wh2.vpos.model.Transaction
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow


object AddTransactionContract {
    data class State(
        val transaction: Transaction = Transaction(
            price = CurrencyValue(stringValue = ""),
            description = "",
            category = Category(id = "", name = "")
        )
    )

    sealed interface Inputs {
        data class SubmitTransaction(val transaction: Transaction): Inputs
    }

    interface ViewModel: ViewModelDelegate {
        val mutableState: MutableStateFlow<State>
        val state: StateFlow<State>
        fun processAction(input: Inputs)
    }
}