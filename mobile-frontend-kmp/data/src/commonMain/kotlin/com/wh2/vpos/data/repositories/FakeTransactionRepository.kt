package com.wh2.vpos.data.repositories

import com.wh2.vpos.model.Account
import com.wh2.vpos.model.TransactionCategory
import com.wh2.vpos.model.CurrencyValue
import com.wh2.vpos.model.Transaction
import com.wh2.vpos.model.TransactionDate
import com.wh2.vpos.model.TransactionFilter
import com.wh2.vpos.repositories.TransactionsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

internal class FakeTransactionRepository: TransactionsRepository {
    override fun getTransactions(filters: List<TransactionFilter>): Flow<List<Transaction>> =
        flow {
            emit(
                buildList {
                    repeat(100) {
                        add(
                            Transaction(
                                id = "id-$it",
                                amount = CurrencyValue(stringValue = "$ 99,00"),
                                description = "pertinacia $it",
                                category = TransactionCategory(id = "ipsum", name = "Rigoberto Armstrong"),
                                date = TransactionDate(value = "dui"),
                                account = Account(id = "omittantur"),
                            ),
                        )
                    }
                },
            )
        }
}