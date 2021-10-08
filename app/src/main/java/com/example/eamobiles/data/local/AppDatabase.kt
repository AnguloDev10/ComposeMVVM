package com.example.eamobiles.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

import com.example.eamobiles.data.model.Player

@Database(entities = [Player::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
     abstract fun playerDao(): PlayerDao
}