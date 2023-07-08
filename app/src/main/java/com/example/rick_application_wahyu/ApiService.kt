package com.example.rick_application_wahyu

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getRick(): Call<ResponseRick>
}