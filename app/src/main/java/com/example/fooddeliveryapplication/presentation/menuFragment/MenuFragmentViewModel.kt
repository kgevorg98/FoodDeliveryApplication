package com.example.fooddeliveryapplication.presentation.menuFragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.fooddeliveryapplication.domain.interactors.GetPizzasInteractor
import kotlinx.coroutines.flow.*

class MenuFragmentViewModel(
    private val getPizzasInteractor: GetPizzasInteractor
) : ViewModel() {

    val pizzas = getPizzasInteractor().asLiveData()
}