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
            val date1 = TransactionDate(2023, 10, 1)
            val date2 = TransactionDate.fromIso8601Date(value = "2024-07-31T12:00:00Z")
            emit(
                buildList {
                    repeat(100) {
                        val isOdd = it % 2 == 0
                        add(
                            Transaction(
                                id = "id-$it",
                                amount = CurrencyValue(stringValue = "$ 99,00"),
                                description = "pertinacia $it",
                                category = TransactionCategory(id = "ipsum", name = "Rigoberto Armstrong"),
                                date = if (isOdd) date1 else date2,
                                account = Account(id = "omittantur"),
                            ),
                        )
                    }
                },
            )
        }
}