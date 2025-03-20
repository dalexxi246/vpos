package com.wh2.vpos.model

sealed class TransactionFilter(
    open val id: Int,
    val name: String,
    val selected: Boolean,
) {
    data class AccountFilter(
        val value: Account,
        override val id: Int = 0
    ) : TransactionFilter(
        id = id,
        name = value.name,
        selected = false,
    )

    data class CategoryFilter(
        val value: TransactionCategory,
        override val id: Int = 1
    ) : TransactionFilter(
        id = id,
        name = value.name,
        selected = false,
    )

    data class DateFilter(
        val value: TransactionDate,
        override val id: Int = 2
    ) : TransactionFilter(
        id = id,
        name = value.value,
        selected = false,
    )
}
