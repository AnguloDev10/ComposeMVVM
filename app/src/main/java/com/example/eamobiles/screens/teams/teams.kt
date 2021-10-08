package com.example.eamobiles.screens.teams

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import com.example.eamobiles.data.model.Team
@Composable
fun Teams(viewModel: TeamsViewModel){
    TeamsList(teamsViewModel = viewModel)

}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TeamsList(teamsViewModel: TeamsViewModel) {
    val teams : List<Team> by teamsViewModel.teams.observeAsState(listOf())
    Log.i("error",teams.toString())

}



@Composable
fun TeamRow(team: Int) {

}
