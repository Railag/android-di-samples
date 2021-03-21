package com.firrael.hiltsample.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.firrael.hiltsample.R
import com.firrael.hiltsample.mocks.AdapterMock
import com.firrael.hiltsample.mocks.NetworkMock
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment() {

    @Inject
    lateinit var networkMock: NetworkMock

    @Inject
    lateinit var adapterMock: AdapterMock

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
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