package com.example.fooddeliveryapplication.domain.repository

import kotlinx.coroutines.flow.Flow
import com.example.fooddeliveryapplication.core.Resource
import com.example.fooddeliveryapplication.data.models.remote.Pizza

interface PizzaRepository {
 fun getPizzas(): Flow<Resource<List<Pizza>>>
}