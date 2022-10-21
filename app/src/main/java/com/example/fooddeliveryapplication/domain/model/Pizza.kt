package com.example.fooddeliveryapplication.domain.model

import com.example.fooddeliveryapplication.core.model.DiffUtilModel


data class Pizza(
    override val id: String,
    val country: String,
    val description: String,
    val url: String,
    val name: String,
    val price: Double
): DiffUtilModel<String>()