package com.example.eamobiles.repository

import com.example.eamobiles.data.local.TeamService
import com.example.eamobiles.data.model.Team
import javax.inject.Inject

class TeamRepository @Inject constructor(private val teamService: TeamService)
{
    suspend fun fetchTeams(): List<Team> {
        val response = teamService.fetchTeams()
        if (response.isSuccessful && response.body() != null) {
                val teams = response.body()!!.teams
        }
        return listOf()
    }
}