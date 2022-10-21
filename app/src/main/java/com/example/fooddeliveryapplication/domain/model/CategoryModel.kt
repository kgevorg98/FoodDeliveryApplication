package com.example.fooddeliveryapplication.domain.model

import com.example.fooddeliveryapplication.core.model.DiffUtilModel


data class CategoryModel(
    override val id: Int,
    val categoryName: String
): DiffUtilModel<Int>()
