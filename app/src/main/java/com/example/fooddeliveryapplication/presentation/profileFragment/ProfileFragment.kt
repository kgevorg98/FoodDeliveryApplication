package com.example.fooddeliveryapplication.presentation.profileFragment

import com.example.fooddeliveryapplication.databinding.ProfileFragmentBinding
import com.example.fooddeliveryapplication.presentation.base.fragments.FragmentBaseNCMVVM
import com.example.fooddeliveryapplication.presentation.base.utils.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProfileFragment: FragmentBaseNCMVVM<ProfileFragmentViewModel, ProfileFragmentBinding>() {

    override val binding: ProfileFragmentBinding by viewBinding()

    override val viewModel: ProfileFragmentViewModel by viewModel()
}