package com.wh2.vpos.model

import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.format.MonthNames
import kotlinx.datetime.format.char
import kotlinx.datetime.toLocalDateTime
import kotlin.jvm.JvmInline

@JvmInline
value class TransactionDate(val value: String) {
    constructor(year: Int, month: Int, day: Int) : this(LocalDate.Format {
        monthName(MonthNames.ENGLISH_FULL)
        char(' ')
        monthNumber()
        chars(", ")
        year()
    }.format(LocalDate(year, month, day)))

    companion object {
        fun fromIso8601Date(value: String): TransactionDate {
            val instant = Instant.parse(value)
            val localDateTime = instant.toLocalDateTime(TimeZone.currentSystemDefault())
            return TransactionDate(localDateTime.year, localDateTime.monthNumber, localDateTime.dayOfMonth)
        }
    }
}