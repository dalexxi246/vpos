package com.wh2.vpos.viewmodels

import com.wh2.vpos.model.Account
import com.wh2.vpos.model.Category
import com.wh2.vpos.model.CurrencyValue
import com.wh2.vpos.model.Transaction
import com.wh2.vpos.model.TransactionDate
import com.wh2.vpos.views.TransactionsListContract
import com.wh2.vpos.views.TransactionsListContract.State
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class TransactionsListViewModelDelegate : TransactionsListContract.ViewModel {

    override val mutableState: MutableStateFlow<State> =
        MutableStateFlow(State(transactions = emptyList()))

    override val state: StateFlow<State>
        get() = mutableState

    override fun processAction(input: TransactionsListContract.Input) {
        when (input) {
            is TransactionsListContract.Input.GetLatestTransactions -> {
                mutableState.update {
                    State(
                        transactions = mockTransactions
                    )
                }
                println("Getting latest transactions")
            }
        }
    }
}

private val mockTransactions = listOf(
    Transaction(
        id = "mei",
        amount = CurrencyValue(stringValue = "ei"),
        description = "pertinacia",
        category = Category(id = "ipsum", name = "Rigoberto Armstrong"),
        date = TransactionDate(value = "dui"),
        account = Account(id = "omittantur")
    ),

    Transaction(
        id = "mei",
        amount = CurrencyValue(stringValue = "ei"),
        description = "pertinacia",
        category = Category(id = "ipsum", name = "Rigoberto Armstrong"),
        date = TransactionDate(value = "dui"),
        account = Account(id = "omittantur")
    ),

    Transaction(
        id = "mei",
        amount = CurrencyValue(stringValue = "ei"),
        description = "pertinacia",
        category = Category(id = "ipsum", name = "Rigoberto Armstrong"),
        date = TransactionDate(value = "dui"),
        account = Account(id = "omittantur")
    ),
)
