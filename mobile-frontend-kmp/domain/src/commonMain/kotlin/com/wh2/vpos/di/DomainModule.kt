package com.wh2.vpos.di

import com.wh2.vpos.usecases.GetTransactions
import org.koin.dsl.module

val domainModule = module {
    factory { GetTransactions(get()) }
}