package com.firrael.hiltsample.modules

import android.content.Context
import com.firrael.hiltsample.mocks.AdapterMock
import com.firrael.hiltsample.mocks.NetworkMock
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext

@Module
@InstallIn(ActivityComponent::class)
object GeneralModule {

    @Provides
    fun provideNetworkMock(
    ): NetworkMock {
        return NetworkMock()
    }

    @Provides
    fun provideAdapterMock(@ActivityContext context: Context
    ): AdapterMock {
        return AdapterMock(context)
    }
}