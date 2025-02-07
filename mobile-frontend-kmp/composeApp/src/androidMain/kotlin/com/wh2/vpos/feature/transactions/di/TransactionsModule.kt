package com.wh2.vpos.feature.transactions.di

import com.wh2.vpos.feature.transactions.viewmodels.AddTransactionViewModel
import com.wh2.vpos.feature.transactions.viewmodels.TransactionsListViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

internal val transactionsModule = module {
    viewModel { TransactionsListViewModel() }
    viewModel { AddTransactionViewModel() }
}