package com.example.eamobiles.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.eamobiles.data.model.Generic

@Database(entities = [Generic::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
//TODO:  abstract fun genericDao(): GenericDao
}