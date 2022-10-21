package com.example.fooddeliveryapplication.presentation.base.adapters

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.viewbinding.ViewBinding
import com.dct.sdk.ui.appbase.adapter.BaseViewHolder
import com.example.fooddeliveryapplication.core.model.DiffUtilModel

abstract class BaseAdapter<ItemViewBinding : ViewBinding, Item : DiffUtilModel<*>, ViewHolder : BaseViewHolder<Item, ItemViewBinding>> :
    ListAdapter<Item, ViewHolder>(EventsDiffCallback()) {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            getItem(position)?.let { item ->
                bind(item, itemView.context)
                itemView.setOnClickListener {
                    if (position <= itemCount - 1)
                        onItemClick(item)
                }
            }
        }
    }

    class EventsDiffCallback<Item : DiffUtilModel<*>> : DiffUtil.ItemCallback<Item>() {
        override fun areItemsTheSame(oldItem: Item, newItem: Item) =
            (oldItem as DiffUtilModel<*>).id == (newItem as DiffUtilModel<*>).id

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean =
            oldItem == newItem
    }

}