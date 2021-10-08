package com.example.eamobiles.screens.teams

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.eamobiles.data.model.Team
import com.example.eamobiles.repository.TeamRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class TeamsViewModel @Inject constructor(private val teamRepository: TeamRepository): ViewModel() {
   private var _teams = MutableLiveData<List<Team>>()
    val teams get() = _teams

    fun fetchCategories() {
        viewModelScope.launch {
            _teams.postValue(teamRepository.fetchTeams())
        }
    }
}