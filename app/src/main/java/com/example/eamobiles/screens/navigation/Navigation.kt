package com.example.eamobiles.screens.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.eamobiles.data.model.Team
import com.example.eamobiles.screens.teams.Teams
import com.example.eamobiles.screens.teams.TeamsViewModel

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.TeamList.route) {

        composable(Routes.TeamList.route) {
            val teamsViewModel: TeamsViewModel = hiltViewModel()
            Teams(teamsViewModel)
        }

}


}




sealed class Routes(val route:String) {
    object TeamList : Routes("TeamList")
}