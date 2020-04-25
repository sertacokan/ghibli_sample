package com.example.ghiblisampleapp.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "PeopleTable")
data class PeopleEntity(
    @PrimaryKey
    @ColumnInfo(name = "peopleId")
    val id: String,
    val name: String,
    val gender: String,
    val age: String,
    val eye_color: String,
    val hairColor: String
)