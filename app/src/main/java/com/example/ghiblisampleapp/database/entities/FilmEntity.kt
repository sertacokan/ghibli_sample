package com.example.ghiblisampleapp.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "FilmTable")
data class FilmEntity(
    @PrimaryKey
    @ColumnInfo(name = "filmId")
    val id: String,
    val title: String,
    val description: String,
    val director: String,
    val producer: String,
    val releaseDate: String
)