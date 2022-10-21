package com.example.fooddeliveryapplication.data.models.remote

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.fooddeliveryapplication.core.model.DiffUtilModel
import com.google.gson.annotations.SerializedName


@Entity(tableName = "pizzas")
data class Pizza(
    @SerializedName("id")
    @PrimaryKey override val id: String,
    @SerializedName("country")
    val country: String?,
    @SerializedName("dsc")
    val description: String?,
    @SerializedName("img")
    val url: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("price")
    val price: Double?
):DiffUtilModel<String>()