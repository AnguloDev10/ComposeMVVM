package com.example.eamobiles.screens.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.eamobiles.screens.Anime.AnimeViewModel
import com.example.eamobiles.screens.Anime.Animes

@Composable
fun Navigation() {
    val navController = rememberNavController()

  NavHost(navController =  navController, startDestination = Routes.AnimesList.route) {
      composable(Routes.AnimesList.route) {
          val animeViewModel : AnimeViewModel = hiltViewModel()
          animeViewModel.fetchAnimes()
          Animes(animeViewModel = animeViewModel)
      }

  }


}




sealed class Routes(val route:String) {
 object AnimesList : Routes("AnimesList")

}