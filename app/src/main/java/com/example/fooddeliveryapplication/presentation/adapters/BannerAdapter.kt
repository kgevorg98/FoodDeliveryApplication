package com.example.fooddeliveryapplication.presentation.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewbinding.ViewBinding
import com.dct.sdk.ui.appbase.adapter.BaseViewHolder
import com.example.fooddeliveryapplication.databinding.BannerItemBinding
import com.example.fooddeliveryapplication.domain.model.BannerModel
import com.example.fooddeliveryapplication.presentation.base.adapters.BaseAdapter

class BannerAdapter :
    BaseAdapter<ViewBinding, BannerModel, BaseViewHolder<BannerModel, ViewBinding>>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<BannerModel, ViewBinding> {
        return BannerViewHolder(
            BannerItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    private class BannerViewHolder(
        private val binding: BannerItemBinding
    ) : BaseViewHolder<BannerModel, ViewBinding>(binding) {
        @SuppressLint("CheckResult")
        override fun bind(item: BannerModel, context: Context) {
            with(binding) {
                ivBanner.setImageResource(item.drawable)
                ivBanner.scaleType = ImageView.ScaleType.CENTER_CROP
            }
        }
    }
}