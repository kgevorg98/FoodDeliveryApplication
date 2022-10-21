package com.example.fooddeliveryapplication.data.sqlservice

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.fooddeliveryapplication.data.models.remote.Pizza
import kotlinx.coroutines.flow.Flow

@Dao
interface PizzaDao {
    @Query("SELECT * FROM pizzas")
    fun getPizzas(): Flow<List<Pizza>>

    @Query("DELETE FROM pizzas")
    suspend fun deleteAllPizzas()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPizzas(pizzas: List<Pizza>)
}