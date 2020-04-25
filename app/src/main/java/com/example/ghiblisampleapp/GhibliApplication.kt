package com.example.ghiblisampleapp

import android.app.Application
import com.example.ghiblisampleapp.di.databaseModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class GhibliApplication :Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {

            androidContext(this@GhibliApplication)
            modules(databaseModule)
        }

    }
}