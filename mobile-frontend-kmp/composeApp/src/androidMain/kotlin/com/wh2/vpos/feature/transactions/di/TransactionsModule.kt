package com.wh2.vpos.feature.transactions.di

import com.wh2.vpos.data.di.dataModule
import com.wh2.vpos.di.domainModule
import com.wh2.vpos.feature.transactions.viewmodels.AddTransactionViewModel
import com.wh2.vpos.feature.transactions.viewmodels.TransactionsListViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

internal val transactionsModule = module {
    includes(domainModule, dataModule)
    viewModel { TransactionsListViewModel(getTransactions = get()) }
    viewModel { AddTransactionViewModel() }
}