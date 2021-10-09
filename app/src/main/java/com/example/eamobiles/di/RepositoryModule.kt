package com.example.eamobiles.di

import com.example.eamobiles.data.local.AnimeDao
import com.example.eamobiles.data.remote.AnimeService
import com.example.eamobiles.repository.AnimeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {
    @Provides
    @ViewModelScoped
    fun provideAnimeRepository(
        animeService: AnimeService,
        animeDao: AnimeDao
    ): AnimeRepository {
        return AnimeRepository(animeService, animeDao)
    }



}