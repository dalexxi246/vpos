package com.wh2.vpos.feature.transactions.viewmodels

import androidx.lifecycle.ViewModel
import com.wh2.vpos.usecases.GetTransactions
import com.wh2.vpos.viewmodels.TransactionsListViewModelDelegate
import com.wh2.vpos.views.TransactionsListContract

class TransactionsListViewModel(
    getTransactions: GetTransactions
) : ViewModel(),
    TransactionsListContract.ViewModel by TransactionsListViewModelDelegate(getTransactions = getTransactions)