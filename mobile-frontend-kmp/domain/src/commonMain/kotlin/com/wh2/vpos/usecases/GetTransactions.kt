package com.wh2.vpos.usecases

import com.wh2.vpos.model.TransactionFilter
import com.wh2.vpos.model.TransactionsListSection
import com.wh2.vpos.repositories.TransactionsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetTransactions(private val transactionsRepository: TransactionsRepository) {

    operator fun invoke(
        filters: List<TransactionFilter> = emptyList()
    ): Flow<List<TransactionsListSection>> =
        transactionsRepository.getTransactions(filters).map { transactions ->
            transactions.groupBy { it.date }.map {
                TransactionsListSection(
                    date = it.key.value,
                    transactions = it.value,
                )
            }
        }
}