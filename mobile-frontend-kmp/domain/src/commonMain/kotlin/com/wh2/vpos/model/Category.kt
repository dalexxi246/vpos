@file:OptIn(ExperimentalUuidApi::class)

package com.wh2.vpos.model

import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

data class Category(
    val id: String = Uuid.random().toString(),
    val name: String
)
