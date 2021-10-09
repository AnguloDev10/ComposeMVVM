package com.example.eamobiles.data.remote

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface AnimeService {
    @GET("api/v1")
    suspend fun fetchAnimes(): Response<ApiResponse>
}