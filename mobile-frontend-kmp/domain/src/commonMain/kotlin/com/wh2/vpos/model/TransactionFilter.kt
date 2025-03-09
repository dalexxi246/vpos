package com.wh2.vpos.model

sealed class TransactionFilter(
    val id: Int,
    val name: String,
    val selected: Boolean,
) {
    data class AccountFilter(val value: Account) : TransactionFilter(
        id = 0,
        name = "Account",
        selected = false,
    )

    data class CategoryFilter(val value: TransactionCategory) : TransactionFilter(
        id = 1,
        name = "Category",
        selected = false,
    )

    data class DateFilter(val value: TransactionDate) : TransactionFilter(
        id = 2,
        name = "Date",
        selected = false,
    )
}
