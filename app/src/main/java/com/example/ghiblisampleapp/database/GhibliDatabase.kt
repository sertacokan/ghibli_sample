package com.example.ghiblisampleapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.ghiblisampleapp.database.daos.*
import com.example.ghiblisampleapp.database.entities.*

@Database(
    entities = [FilmEntity::class, LocationEntity::class, PeopleEntity::class, SpecieEntity::class, VehicleEntity::class],
    version = 1, exportSchema = false
)
abstract class GhibliDatabase : RoomDatabase() {

    abstract val filmDao: FilmDao
    abstract val locationDao: LocationDao
    abstract val peopleDao: PeopleDao
    abstract val specieDao: SpecieDao
    abstract val vehicleDao: VehicleDao

}