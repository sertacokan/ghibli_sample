package com.example.ghiblisampleapp.network

import com.example.ghiblisampleapp.network.models.PeopleResponseModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface PeopleService {

    @GET("people")
    fun getPeople():Single<List<PeopleResponseModel>>

    @GET("people/{id}")
    fun getPeopleInfo(
        @Path("id") peopleId:String
    ):Single<PeopleResponseModel>
}