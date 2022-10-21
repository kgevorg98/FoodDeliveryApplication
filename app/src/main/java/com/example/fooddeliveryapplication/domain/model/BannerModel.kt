package com.example.fooddeliveryapplication.domain.model

import com.example.fooddeliveryapplication.core.model.DiffUtilModel


data class BannerModel(
    override val id: Int,
    val drawable: Int
) : DiffUtilModel<Int>()
