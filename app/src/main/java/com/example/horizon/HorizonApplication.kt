package com.example.horizon

import android.app.Application
import com.example.horizon.data.AppContainer
import com.example.horizon.data.DefaultAppContainer

class HorizonApplication : Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()

        container = DefaultAppContainer()
    }
}