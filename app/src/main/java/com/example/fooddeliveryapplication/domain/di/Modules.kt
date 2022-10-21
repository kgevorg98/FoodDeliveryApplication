package com.example.fooddeliveryapplication.domain.di

import com.example.fooddeliveryapplication.domain.interactors.GetPizzasInteractor
import com.example.fooddeliveryapplication.domain.usecases.GetPizzasUseCase
import org.koin.dsl.module

val interactorModule = module {
    factory<GetPizzasInteractor> {GetPizzasUseCase(get())}
}