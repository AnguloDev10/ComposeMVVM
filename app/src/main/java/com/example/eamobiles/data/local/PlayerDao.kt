package com.example.eamobiles.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.eamobiles.data.model.Player

@Dao
interface PlayerDao {

    @Insert
    suspend fun insert(player: Player)

    @Delete
    suspend fun delete(player: Player)
}