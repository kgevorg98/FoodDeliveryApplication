package com.example.fooddeliveryapplication.data.repository

import androidx.room.withTransaction
import com.example.fooddeliveryapplication.data.apiservice.PizzaService
import com.example.fooddeliveryapplication.domain.repository.PizzaRepository
import kotlinx.coroutines.flow.Flow
import com.example.fooddeliveryapplication.core.Resource
import com.example.fooddeliveryapplication.core.networkBoundResource
import com.example.fooddeliveryapplication.data.models.remote.Pizza
import com.example.fooddeliveryapplication.data.sqlservice.PizzaDatabase
class PizzaRepositoryImpl(
    private val pizzaService: PizzaService,
    private val db: PizzaDatabase
) : PizzaRepository {
    private val pizzaDao = db.pizzaDao()

    override fun getPizzas(): Flow<Resource<List<Pizza>>> = networkBoundResource(
        query = {
            pizzaDao.getPizzas()
        },
        fetch = {
            pizzaService.getPizzas()
        },
        saveFetchResult = { pizzas ->
            db.withTransaction {
                with(pizzaDao) {
                    deleteAllPizzas()
                    insertPizzas(pizzas)
                }

            }
        }
    )

}