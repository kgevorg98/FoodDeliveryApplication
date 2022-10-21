package com.example.fooddeliveryapplication

import android.app.Application
import com.example.fooddeliveryapplication.data.di.apiModule
import com.example.fooddeliveryapplication.data.di.databaseModule
import com.example.fooddeliveryapplication.data.di.repositoryModule
import com.example.fooddeliveryapplication.di.viewModelModule
import com.example.fooddeliveryapplication.domain.di.interactorModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.*

class FoodDeliveryApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@FoodDeliveryApp)
            androidLogger()
            modules(modules)
        }
    }

    private val modules = listOf(
        apiModule,
        repositoryModule,
        interactorModule,
        viewModelModule,
        databaseModule

    )
}