package com.wh2.vpos

import com.wh2.vpos.data.di.dataModule
import com.wh2.vpos.di.domainModule
import org.koin.core.context.startKoin

fun initKoin() {
    startKoin {
        modules(domainModule, dataModule)
    }
}