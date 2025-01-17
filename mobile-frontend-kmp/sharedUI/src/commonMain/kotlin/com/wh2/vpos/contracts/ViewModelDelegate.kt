package com.wh2.vpos.contracts

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

interface ViewModelDelegate<S, I> {
    val mutableState: MutableStateFlow<S>
    val state: StateFlow<S>
    fun processAction(input: I)
}
