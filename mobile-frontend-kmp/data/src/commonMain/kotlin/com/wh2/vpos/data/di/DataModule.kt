package com.wh2.vpos.data.di

import com.wh2.vpos.data.repositories.FakeTransactionRepository
import com.wh2.vpos.repositories.TransactionsRepository
import org.koin.dsl.module

val dataModule = module {
    single<TransactionsRepository> { FakeTransactionRepository() }
}