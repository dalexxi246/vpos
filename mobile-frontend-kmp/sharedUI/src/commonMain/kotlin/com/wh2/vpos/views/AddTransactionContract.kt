package com.wh2.vpos.views

import com.wh2.vpos.contracts.ViewModelDelegate
import com.wh2.vpos.model.Account
import com.wh2.vpos.model.Category
import com.wh2.vpos.model.CurrencyValue
import com.wh2.vpos.model.Transaction
import com.wh2.vpos.model.TransactionDate
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow


object AddTransactionContract {
    data class State(
        val transaction: Transaction = Transaction(
            amount = CurrencyValue(stringValue = ""),
            description = "",
            category = Category(id = "", name = ""),
            id = "",
            date = TransactionDate(""),
            account = Account(id = "")
        )
    )

    sealed interface Input {
        data class SubmitTransaction(val transaction: Transaction): Input
    }

    interface ViewModel: ViewModelDelegate<State, Input>
}