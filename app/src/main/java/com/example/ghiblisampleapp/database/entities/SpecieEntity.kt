package com.example.ghiblisampleapp.database.entities

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "SpecieTable")
data class SpecieEntity(
    @PrimaryKey
    @ColumnInfo(name = "specieId")
     val id:String,
    val name:String,
    val classification:String,
    val eyeColors:String,
    val hairColors:String
)
