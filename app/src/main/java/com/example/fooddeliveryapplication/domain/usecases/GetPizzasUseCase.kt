package com.example.fooddeliveryapplication.domain.usecases

import com.example.fooddeliveryapplication.core.Resource
import com.example.fooddeliveryapplication.data.models.remote.Pizza
import com.example.fooddeliveryapplication.domain.interactors.GetPizzasInteractor
import com.example.fooddeliveryapplication.domain.repository.PizzaRepository
import kotlinx.coroutines.flow.Flow

class GetPizzasUseCase(
    private val pizzaRepository: PizzaRepository
) : GetPizzasInteractor {
    override suspend fun invoke(): Flow<Resource<List<Pizza>>> = pizzaRepository.getPizzas()
}