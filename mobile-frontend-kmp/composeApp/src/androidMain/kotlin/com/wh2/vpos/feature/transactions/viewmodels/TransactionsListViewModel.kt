package com.wh2.vpos.feature.transactions.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wh2.vpos.usecases.GetTransactions
import com.wh2.vpos.shared.ui.viewmodels.TransactionsListViewModelDelegate
import com.wh2.vpos.shared.ui.views.TransactionsListContract
import kotlinx.coroutines.flow.StateFlow

class TransactionsListViewModel(
    getTransactions: GetTransactions
) : ViewModel(), TransactionsListContract.ViewModel {

    private val delegate = TransactionsListViewModelDelegate(getTransactions, viewModelScope)

    override val state: StateFlow<TransactionsListContract.State> = delegate.state

    override fun processAction(input: TransactionsListContract.Input) {
        delegate.processAction(input)
    }
}