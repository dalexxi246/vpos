package com.wh2.vpos.viewmodels

import com.wh2.vpos.views.AddTransactionContract.Inputs
import com.wh2.vpos.views.AddTransactionContract.State
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class AddTransactionViewModel {

    private val mutableState: MutableStateFlow<State> =
        MutableStateFlow(State())
    val state: StateFlow<State>
        get() = mutableState

    fun processAction(input: Inputs) {
        when (input) {
            is Inputs.SubmitTransaction -> {
                mutableState.update { it.copy(transaction = input.transaction) }
            }
        }
    }


}