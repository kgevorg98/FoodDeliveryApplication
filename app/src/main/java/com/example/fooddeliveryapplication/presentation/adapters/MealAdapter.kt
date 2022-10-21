package com.example.fooddeliveryapplication.presentation.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.bumptech.glide.Glide
import com.dct.sdk.ui.appbase.adapter.BaseViewHolder
import com.example.fooddeliveryapplication.R
import com.example.fooddeliveryapplication.data.models.remote.Pizza
import com.example.fooddeliveryapplication.databinding.MealItemBinding
import com.example.fooddeliveryapplication.presentation.base.adapters.BaseAdapter
import java.util.*

class MealAdapter :
    BaseAdapter<ViewBinding, Pizza, BaseViewHolder<Pizza, ViewBinding>>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<Pizza, ViewBinding> {
        return MealViewHolder(
            MealItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    private class MealViewHolder(
        private val binding: MealItemBinding
    ) : BaseViewHolder<Pizza, ViewBinding>(binding) {
        @SuppressLint("CheckResult")
        override fun bind(item: Pizza, context: Context) {
            with(binding) {
                Glide.with(itemView)
                    .load(item.url)
                    .into(ivMeal)
                tvTitle.text = item.name
                tvDescription.text = item.description
                tvPrice.text = context.getString(R.string.meal_item_price, item.price)
            }
        }
    }
}