package com.firrael.hiltsample.mocks

import android.content.Context
import android.view.View
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Inject


class AdapterMock @Inject constructor(
    @ActivityContext
    private val context: Context
) {
    fun displaySnackbar(rootView: View) {
        Snackbar.make(context, rootView, "Adapter snackbar", Snackbar.LENGTH_LONG).show()
    }
}