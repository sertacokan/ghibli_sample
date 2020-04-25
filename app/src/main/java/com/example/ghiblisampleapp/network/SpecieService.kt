package com.example.ghiblisampleapp.network

import com.example.ghiblisampleapp.network.models.SpecieResponseModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface SpecieService {

    @GET("species")
    fun getSpecies():Single<List<SpecieResponseModel>>

    @GET("species/{id}")
    fun getSpecieInfo(
        @Path("id") specieId:String
    ):Single<SpecieResponseModel>

}