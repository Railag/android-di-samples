package com.firrael.hiltsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.firrael.hiltsample.mocks.AdapterMock
import com.firrael.hiltsample.mocks.NetworkMock
import com.firrael.hiltsample.ui.main.MainFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }
}