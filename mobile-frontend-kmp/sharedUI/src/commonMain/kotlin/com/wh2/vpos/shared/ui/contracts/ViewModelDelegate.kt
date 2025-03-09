package com.wh2.vpos.shared.ui.contracts

import kotlinx.coroutines.flow.StateFlow

interface ViewModelDelegate<S, I> {
    val state: StateFlow<S>
    fun processAction(input: I)
}
