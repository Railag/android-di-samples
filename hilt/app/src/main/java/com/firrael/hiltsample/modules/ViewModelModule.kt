package com.firrael.hiltsample.modules

import com.firrael.hiltsample.mocks.NetworkMock
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object ViewModelModule {

    @Provides
    fun provideNetworkMock(
    ): NetworkMock {
        return NetworkMock()
    }
}