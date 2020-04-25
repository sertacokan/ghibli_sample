package com.example.ghiblisampleapp.network

import com.example.ghiblisampleapp.network.models.LocationResponseModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface LocationService {

    @GET("locations")
    fun getLocations():Single<List<LocationResponseModel>>

    @GET("locations/{id}")
    fun getLocationInfo(
        @Path("id") locationId:String
    ):Single<LocationResponseModel>
}