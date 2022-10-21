package com.example.fooddeliveryapplication.presentation.basketfragment

import com.example.fooddeliveryapplication.databinding.BasketFragmentBinding
import com.example.fooddeliveryapplication.presentation.base.fragments.FragmentBaseNCMVVM
import com.example.fooddeliveryapplication.presentation.base.utils.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class BasketFragment: FragmentBaseNCMVVM<BasketFragmentViewModel, BasketFragmentBinding>() {

    override val binding: BasketFragmentBinding by viewBinding()

    override val viewModel: BasketFragmentViewModel by viewModel()
}