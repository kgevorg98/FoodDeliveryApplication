package com.example.fooddeliveryapplication.core

sealed class Resource<S>(val data: S? = null, val error: Throwable? = null) {
    class Success<S>(data: S?) : Resource<S>(data)
    class Error<S>(throwable: Throwable, data: S? = null) : Resource<S>(data, throwable)
    class Loading<S>(data: S? = null) : Resource<S>(data)
}