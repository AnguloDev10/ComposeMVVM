package com.example.eamobiles.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.eamobiles.data.model.Anime

@Dao
interface AnimeDao {
    @Insert
    suspend fun insert(vararg meal: Anime)

    @Delete
    suspend fun delete(vararg meal: Anime)

    @Query("select * from animes where id =:id")
    suspend fun fetchById(id: String): Anime?

}