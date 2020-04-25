package com.example.ghiblisampleapp.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "LocationTable")
data class LocationEntity (
    @PrimaryKey
    @ColumnInfo(name = "locationId")
     val id:String,
    val name:String,
    val climate:String,
    val terrain:String,
    val surfaceWater:String
)