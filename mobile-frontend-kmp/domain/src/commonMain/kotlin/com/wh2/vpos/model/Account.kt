@file:OptIn(ExperimentalUuidApi::class)

package com.wh2.vpos.model

import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

data class Account(
    val id: String = Uuid.random().toString(),
)
