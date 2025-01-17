package com.wh2.vpos.app

import android.app.Application
import com.wh2.vpos.feature.transactions.di.transactionsModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class VPOSApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@VPOSApplication)
            modules(appModules)
        }
    }

}

private val appModules = listOf(transactionsModule)
