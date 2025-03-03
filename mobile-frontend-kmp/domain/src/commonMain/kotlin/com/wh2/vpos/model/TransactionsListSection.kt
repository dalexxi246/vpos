package com.wh2.vpos.model

data class TransactionsListSection(
    val date: String,
    val transactions: List<Transaction>,
)