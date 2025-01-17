package com.wh2.vpos.model

import kotlin.jvm.JvmInline

@JvmInline
value class CurrencyValue(
    val stringValue: String
) {
//    init {
//        require(stringValue.startsWith("$")) {
//            error("Currency value must start with $")
//        }
//    }
//    TODO stringValue es el output de la clase ($ 900.000,00)
//    TODO crear constructor que reciba un double y lo convierta a stringValue formateado ($ 900.000,00)
}
