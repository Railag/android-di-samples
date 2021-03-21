package com.firrael.koinsample.modules

import android.content.Context
import com.firrael.koinsample.mocks.AdapterMock
import com.firrael.koinsample.mocks.NetworkMock
import org.koin.dsl.module

val generalModule = module {

    factory { (activityContext: Context) ->
        AdapterMock(activityContext)
    }

    single { NetworkMock() }
}