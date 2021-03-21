package com.firrael.hiltsample.mocks

import android.view.View
import com.google.android.material.snackbar.Snackbar

class NetworkMock {
    fun sendRequest(rootView: View) {
        Snackbar.make(rootView, "Network sent request", Snackbar.LENGTH_LONG).show()
    }
}