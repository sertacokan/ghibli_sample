package com.example.ghiblisampleapp.network.models

data class FilmResponseModel(
    val id: String,
    val title: String,
    val description: String,
    val director: String,
    val producer: String,
    val release_date: String
)