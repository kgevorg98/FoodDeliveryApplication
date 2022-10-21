package com.example.fooddeliveryapplication.presentation.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.dct.sdk.ui.appbase.adapter.BaseViewHolder
import com.example.fooddeliveryapplication.databinding.CategoryItemBinding
import com.example.fooddeliveryapplication.domain.model.CategoryModel
import com.example.fooddeliveryapplication.presentation.base.adapters.BaseAdapter

class CategoryAdapter :
    BaseAdapter<ViewBinding, CategoryModel, BaseViewHolder<CategoryModel, ViewBinding>>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<CategoryModel, ViewBinding> {
        return CategoryViewHolder(
            CategoryItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    private class CategoryViewHolder(
        private val binding: CategoryItemBinding
    ) : BaseViewHolder<CategoryModel, ViewBinding>(binding) {
        @SuppressLint("CheckResult")
        override fun bind(item: CategoryModel, context: Context) {
            val itemWidth = context.resources.displayMetrics.widthPixels * 0.81
            with(binding) {
                tvCategoryTitle.text = item.categoryName
            }
        }
    }
}