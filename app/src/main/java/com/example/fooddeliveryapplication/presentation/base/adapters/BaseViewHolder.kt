package com.dct.sdk.ui.appbase.adapter

import android.content.*
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseViewHolder<Item, ItemViewBinding : ViewBinding>(binding: ItemViewBinding) :
    RecyclerView.ViewHolder(binding.root) {

    abstract fun bind(item: Item, context: Context)
    open fun onItemClick(item: Item) {}
}