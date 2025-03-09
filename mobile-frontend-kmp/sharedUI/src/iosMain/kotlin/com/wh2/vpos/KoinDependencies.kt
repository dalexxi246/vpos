package com.wh2.vpos

import com.wh2.vpos.usecases.GetTransactions
import com.wh2.vpos.shared.ui.viewmodels.TransactionsListViewModelDelegate
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class KoinDependencies: KoinComponent {
    private val getTransactions: GetTransactions by inject()
    private val viewModelScope = CoroutineScope(Dispatchers.Main.immediate + SupervisorJob())

    val transactionsListViewModelDelegate = TransactionsListViewModelDelegate(
        getTransactions = getTransactions,
        scope = viewModelScope
    )
}

