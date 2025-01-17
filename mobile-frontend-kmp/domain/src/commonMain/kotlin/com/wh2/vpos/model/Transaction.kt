package com.wh2.vpos.model

data class Transaction(
    val id: String,
    val amount: CurrencyValue,
    val description: String,
    val category: Category,
    val date: TransactionDate,
    val account: Account
)
