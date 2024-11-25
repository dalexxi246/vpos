package com.wh2.vpos.views

import com.wh2.vpos.model.Category
import com.wh2.vpos.model.CurrencyValue
import com.wh2.vpos.model.Transaction


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


}