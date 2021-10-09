package com.example.eamobiles.data.remote

import com.example.eamobiles.data.model.Anime
import com.google.gson.annotations.SerializedName

class ApiResponse(
    val response: Boolean,

    @SerializedName("data")
    val animes: List<Anime>
)