package com.wh2.vpos.repositories

import com.wh2.vpos.model.Transaction

interface TransactionsRepository {
    fun getTransactions(): List<Transaction>
}