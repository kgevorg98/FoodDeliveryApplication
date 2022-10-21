package com.example.fooddeliveryapplication.domain.interactors

import com.example.fooddeliveryapplication.core.Resource
import com.example.fooddeliveryapplication.data.models.remote.Pizza
import kotlinx.coroutines.flow.Flow

interface GetPizzasInteractor {
     operator fun invoke(): Flow<Resource<List<Pizza>>>
}