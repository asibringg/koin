package com.example.di.module

import com.example.ui.main.adapter.MainAdapter
import com.example.ui.main.viewmodel.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        MainViewModel(get())
    }

    factory {
        MainAdapter()
    }
}