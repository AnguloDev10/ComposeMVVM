package com.example.eamobiles.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.eamobiles.data.model.Anime

@Database(entities = [Anime::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
   abstract fun animeDao(): AnimeDao

}