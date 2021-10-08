package com.example.eamobiles.repository

import android.provider.SyncStateContract.Helpers.update
import com.example.eamobiles.data.local.TeamService
import com.example.eamobiles.data.model.Team

class TeamRepository(private val teamService: TeamService) {

    suspend fun fetchTeams(): List<Team> {
        val response = teamService.fetchTeams()
        if (response.isSuccessful && response.body() != null) {
            if (response.body()!=null) {
                val teams = response.body()!!.teams
                for (team in teams) {
                    update(team)
                }
                return teams
            }
        }
        return listOf()
    }
}