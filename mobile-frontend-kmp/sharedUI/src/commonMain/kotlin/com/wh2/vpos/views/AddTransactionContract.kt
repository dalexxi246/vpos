package com.wh2.vpos.views

import com.wh2.vpos.contracts.ViewModelDelegate
import com.wh2.vpos.model.Account
import com.wh2.vpos.model.TransactionCategory
import com.wh2.vpos.model.CurrencyValue
import com.wh2.vpos.model.Transaction
import com.wh2.vpos.model.TransactionDate


object AddTransactionContract {
    data class State(
        val transaction: Transaction = Transaction(
            amount = CurrencyValue(stringValue = ""),
            description = "",
            category = TransactionCategory(id = "", name = ""),
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