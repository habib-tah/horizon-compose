package com.example.horizon.ui


import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.horizon.HorizonApplication

fun CreationExtras.horizonApplication(): HorizonApplication {
    return this[
        ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY
    ] as HorizonApplication
}