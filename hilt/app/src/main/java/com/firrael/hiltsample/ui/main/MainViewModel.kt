package com.firrael.hiltsample.ui.main

import android.content.Context
import androidx.lifecycle.ViewModel
import com.firrael.hiltsample.mocks.NetworkMock
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(networkMock: NetworkMock) : ViewModel()