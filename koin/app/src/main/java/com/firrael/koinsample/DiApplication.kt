package com.firrael.koinsample

import android.app.Application
import com.firrael.koinsample.modules.generalModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class DiApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@DiApplication)
            modules(generalModule)
        }
    }
}