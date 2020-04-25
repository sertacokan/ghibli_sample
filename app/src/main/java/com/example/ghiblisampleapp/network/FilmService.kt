package com.example.ghiblisampleapp.network

import com.example.ghiblisampleapp.network.models.FilmResponseModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface FilmService {

    @GET("films")
    fun getFilms(): Single<List<FilmResponseModel>>

    @GET("films/{id}")
    fun getFilmInfo(
        @Path("id") filmId:String
    ): Single<FilmResponseModel>
}