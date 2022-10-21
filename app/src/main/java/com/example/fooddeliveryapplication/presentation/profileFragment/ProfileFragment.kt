package com.example.fooddeliveryapplication.presentation.profileFragment

import androidx.fragment.app.Fragment
import com.example.fooddeliveryapplication.databinding.ProfileFragmentBinding
import com.example.fooddeliveryapplication.presentation.base.utils.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProfileFragment: Fragment() {

     val viewModel: ProfileFragmentViewModel by viewModel()
}