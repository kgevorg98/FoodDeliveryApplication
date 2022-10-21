package com.example.fooddeliveryapplication.data.di

import android.app.Application
import androidx.room.Room
import com.example.fooddeliveryapplication.data.apiservice.PizzaService
import com.example.fooddeliveryapplication.data.repository.PizzaRepositoryImpl
import com.example.fooddeliveryapplication.data.sqlservice.PizzaDatabase
import com.example.fooddeliveryapplication.data.utils.Constants.BASE_URL
import com.example.fooddeliveryapplication.data.utils.HeaderInterceptor
import com.example.fooddeliveryapplication.domain.repository.PizzaRepository
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val apiModule = module {
    single<Retrofit> {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .apply {
                client(
                    OkHttpClient.Builder()
                        .addInterceptor(HeaderInterceptor())
                        .addInterceptor(HttpLoggingInterceptor().apply {
                            level = HttpLoggingInterceptor.Level.BODY
                        })
                        .build()
                )
            }
            .build()
    }

    single<PizzaService> {get<Retrofit>().create(PizzaService::class.java)}
}

val repositoryModule = module {
    single<PizzaRepository> { PizzaRepositoryImpl(get(), get())}
}

val databaseModule = module{
    fun provideDatabase(application: Application):PizzaDatabase{
        return Room.databaseBuilder(application, PizzaDatabase::class.java, "PizzaDatabase")
            .allowMainThreadQueries()
            .build()
    }

    single { provideDatabase(androidApplication()) }
    single { get<PizzaDatabase>().pizzaDao() }
}