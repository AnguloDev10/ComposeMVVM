package com.example.eamobiles.di

import com.example.eamobiles.data.local.TeamService
import com.example.eamobiles.repository.TeamRepository
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
    fun provideTeamRepository(
          teamService: TeamService
    ): TeamRepository {
        return TeamRepository(teamService)
    }
}