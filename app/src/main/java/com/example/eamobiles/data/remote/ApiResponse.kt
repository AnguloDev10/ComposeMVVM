package com.example.eamobiles.data.remote

import com.example.eamobiles.data.model.Anime

class ApiResponse(
    val successfull: String,
   val animes: List<Anime>
)