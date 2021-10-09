package com.example.eamobiles.di

import android.app.Application
import androidx.room.Room
import com.example.eamobiles.data.local.AnimeDao
import com.example.eamobiles.data.local.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {
    @Provides
    @Singleton
    fun provideAppDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "anime.dn").build()
    }

    @Provides
    @Singleton
    fun provideHeroDao(appDatabase: AppDatabase): AnimeDao {
            return appDatabase.animeDao()
    }

}