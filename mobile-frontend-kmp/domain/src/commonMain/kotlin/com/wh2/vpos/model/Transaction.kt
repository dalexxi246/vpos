package com.wh2.vpos.model

data class Transaction(
    val price: CurrencyValue,
    val description: String,
    val category: Category
)
