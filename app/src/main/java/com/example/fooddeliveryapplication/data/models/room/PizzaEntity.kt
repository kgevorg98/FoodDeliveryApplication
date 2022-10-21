package com.example.fooddeliveryapplication.data.models.room

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "pizzas")
data class PizzaEntity(
    @PrimaryKey val id: String,
    val country: String,
    val description: String,
    val url: String,
    val name: String,
    val price: Double
)