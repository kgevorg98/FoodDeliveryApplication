package com.example.fooddeliveryapplication.data.utils

import com.example.fooddeliveryapplication.data.models.room.PizzaEntity

//fun Pizza.toEntity():PizzaEntity =
//    PizzaEntity(
//        id = id ?: "",
//        country = country ?: "",
//        description = description ?:"",
//        url = url ?: "",
//        name = name ?:"",
//        price = price ?: -1.0
//    )

fun PizzaEntity.toDomain(): com.example.fooddeliveryapplication.domain.model.Pizza =
    com.example.fooddeliveryapplication.domain.model.Pizza(
        id = id,
        country = country,
        description = description,
        url = url,
        name = name,
        price = price
    )
//fun PizzaEntity.toData():Pizza =
//    Pizza(
//        id = id,
//        country = country,
//        description = description,
//        url = url,
//        name = name,
//        price = price
//    )
//


