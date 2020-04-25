package com.example.ghiblisampleapp.di

import androidx.room.Room
import com.example.ghiblisampleapp.database.GhibliDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val databaseModule = module {

    single {
        Room.databaseBuilder(androidContext(), GhibliDatabase::class.java, "GhibliDatabase").build()
    }

    factory { get<GhibliDatabase>().filmDao }

    factory { get<GhibliDatabase>().locationDao }

    factory { get<GhibliDatabase>().peopleDao }

    factory { get<GhibliDatabase>().specieDao }

    factory { get<GhibliDatabase>().vehicleDao }

}