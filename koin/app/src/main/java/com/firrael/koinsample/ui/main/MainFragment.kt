package com.firrael.koinsample.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.firrael.koinsample.R
import com.firrael.koinsample.mocks.AdapterMock
import com.firrael.koinsample.mocks.NetworkMock
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class MainFragment : Fragment() {

    private val networkMock: NetworkMock by inject()
    private val adapterMock: AdapterMock by inject { parametersOf(activity) }

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        view?.let { rootView ->
            rootView.findViewById<View>(R.id.sendNetworkRequestButton)
                    .setOnClickListener { networkMock.sendRequest(rootView) }

            rootView.findViewById<View>(R.id.sendSnackbarAdapterButton)
                    .setOnClickListener { adapterMock.displaySnackbar(rootView) }
        }
    }

}