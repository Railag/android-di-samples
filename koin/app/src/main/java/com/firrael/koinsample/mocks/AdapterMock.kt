package com.firrael.koinsample.mocks

import android.content.Context
import android.view.View
import com.google.android.material.snackbar.Snackbar

class AdapterMock constructor(
        private val context: Context
) {
    fun displaySnackbar(rootView: View) {
        Snackbar.make(context, rootView, "Adapter snackbar", Snackbar.LENGTH_LONG).show()
    }
}