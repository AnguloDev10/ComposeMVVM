package com.example.eamobiles.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface AnimeService {
    @GET()
    suspend fun fetchAnimes(): Response<ApiResponse>
}