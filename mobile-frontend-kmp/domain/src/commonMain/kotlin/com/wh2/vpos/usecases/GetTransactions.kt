package com.wh2.vpos.usecases

import com.wh2.vpos.model.TransactionFilter
import com.wh2.vpos.model.TransactionsListSection
import com.wh2.vpos.repositories.TransactionsRepository

class GetTransactions(private val repository: TransactionsRepository) {
    operator fun invoke(filters: List<TransactionFilter> = emptyList()): List<TransactionsListSection> {
        return repository.getTransactions().groupBy { it.date }.map {
            TransactionsListSection(
                date = it.key.value,
                transactions = it.value,
            )
        }
    }
}