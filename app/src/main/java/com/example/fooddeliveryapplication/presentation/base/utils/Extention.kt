package com.example.fooddeliveryapplication.presentation.base.utils

import androidx.lifecycle.LifecycleOwner
import com.example.fooddeliveryapplication.presentation.base.viewModels.FlowObserver
import kotlinx.coroutines.flow.Flow

inline fun <reified T> Flow<T>.observeInLifecycle(
    lifecycleOwner: LifecycleOwner
) = FlowObserver(lifecycleOwner, this)
