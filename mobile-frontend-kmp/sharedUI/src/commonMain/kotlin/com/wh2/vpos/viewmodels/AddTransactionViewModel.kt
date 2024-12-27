package com.wh2.vpos.viewmodels

import com.wh2.vpos.views.AddTransactionContract
import com.wh2.vpos.views.AddTransactionContract.Inputs
import com.wh2.vpos.views.AddTransactionContract.State
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class AddTransactionViewModel: AddTransactionContract.ViewModel {

    override val mutableState: MutableStateFlow<State> =
        MutableStateFlow(State())
    override val state: StateFlow<State>
        get() = mutableState

    override fun processAction(input: Inputs) {
        when (input) {
            is Inputs.SubmitTransaction -> {
                mutableState.update { it.copy(transaction = input.transaction) }
            }
        }
    }

}