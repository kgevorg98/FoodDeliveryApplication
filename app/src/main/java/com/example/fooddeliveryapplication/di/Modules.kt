package com.example.fooddeliveryapplication.di

import com.example.fooddeliveryapplication.presentation.menuFragment.MenuFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MenuFragmentViewModel(get()) }
}
