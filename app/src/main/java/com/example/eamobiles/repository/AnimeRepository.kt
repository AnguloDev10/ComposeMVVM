package com.example.eamobiles.repository

import android.util.Log
import com.example.eamobiles.data.local.AnimeDao
import com.example.eamobiles.data.model.Anime
import com.example.eamobiles.data.remote.AnimeService
import javax.inject.Inject


class AnimeRepository @Inject constructor (
    private val animeService: AnimeService,
    private val animeDao: AnimeDao
) {
    suspend fun fetchAnime(): List<Anime> {
        val response = animeService.fetchAnimes()
        println( response.body())
        if(response.isSuccessful && response.body() != null){
            if ( response.body()!!.response != null ) {
                println(response.body()!!.animes)
                return response.body()!!.animes
            }

        }
        return listOf()
    }
    suspend fun insert(vararg anime: Anime) = animeDao.insert(*anime)

    suspend fun delete(vararg anime: Anime) = animeDao.delete(*anime)
}