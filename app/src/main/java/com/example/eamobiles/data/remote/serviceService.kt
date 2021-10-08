package com.example.eamobiles.data.local

import com.example.eamobiles.data.model.Team
import com.example.eamobiles.data.remote.ApiResponse
import retrofit2.Response
import retrofit2.http.GET

interface TeamService {
    @GET()
    suspend fun  fetchTeams(): Response<ApiResponse>
}
