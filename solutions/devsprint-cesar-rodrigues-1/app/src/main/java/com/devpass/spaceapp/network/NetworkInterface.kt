package com.devpass.spaceapp.network

import retrofit2.http.GET

class NetworkInterface {

    @GET("https://api.spacexdata.com/v4/rockets/{id}")
    fun getRocketDetails() {

    }
}