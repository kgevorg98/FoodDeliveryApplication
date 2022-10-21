package com.example.fooddeliveryapplication.presentation.basketfragment

import androidx.fragment.app.Fragment
import com.example.fooddeliveryapplication.databinding.BasketFragmentBinding
import com.example.fooddeliveryapplication.presentation.base.utils.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class BasketFragment: Fragment() {


     val viewModel: BasketFragmentViewModel by viewModel()
}