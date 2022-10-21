package com.example.fooddeliveryapplication.data.sqlservice

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.fooddeliveryapplication.data.models.remote.Pizza

@Database(entities = [Pizza::class], version = 2, exportSchema = false)
abstract class PizzaDatabase : RoomDatabase() {
    abstract fun pizzaDao():PizzaDao
}