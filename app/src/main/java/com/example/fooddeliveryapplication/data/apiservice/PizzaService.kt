package com.example.fooddeliveryapplication.data.apiservice

import com.example.fooddeliveryapplication.data.models.remote.Pizza
import retrofit2.http.GET

interface PizzaService {
    @GET("pizzas")
    suspend fun getPizzas():List<Pizza>
}