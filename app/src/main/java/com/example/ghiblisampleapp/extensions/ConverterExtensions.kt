package com.example.ghiblisampleapp.extensions

import com.example.ghiblisampleapp.database.entities.FilmEntity
import com.example.ghiblisampleapp.network.models.FilmResponseModel

fun List<FilmResponseModel>.toFilmEntity():List<FilmEntity>{
    return map {
        FilmEntity(it.id,it.title,it.description,it.director,it.producer,it.release_date)
    }
}

