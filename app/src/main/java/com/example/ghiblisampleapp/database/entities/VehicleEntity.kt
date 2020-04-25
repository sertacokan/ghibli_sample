package com.example.ghiblisampleapp.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "VehicleTable")
data class VehicleEntity(
    @PrimaryKey
    @ColumnInfo(name="vehicleId")
    val id: String,
    val description: String,
    val name: String,
    val vehicleClass: String
)