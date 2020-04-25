package com.example.ghiblisampleapp.network

import com.example.ghiblisampleapp.network.models.VehicleResponseModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface VehicleService {

    @GET("vehicles")
    fun getVehicles(): Single<List<VehicleResponseModel>>

    @GET("vehicles/{id}")
    fun getVehicleInfo(
        @Path("id") vehicleId:String
    ):Single<VehicleResponseModel>

}