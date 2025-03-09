package com.wh2.vpos.repositories

import com.wh2.vpos.model.Transaction
import com.wh2.vpos.model.TransactionFilter
import kotlinx.coroutines.flow.Flow

interface TransactionsRepository {
    fun getTransactions(filters: List<TransactionFilter>): Flow<List<Transaction>>
}