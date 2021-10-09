package com.example.eamobiles.screens.navigation

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.eamobiles.screens.Anime.AnimeViewModel
import com.example.eamobiles.screens.Anime.Animes
import com.example.eamobiles.screens.Home.Home

@Composable
fun Navigation() {
    val navController = rememberNavController()

  NavHost(navController =  navController, startDestination = Routes.AnimesList.route) {
      composable(Routes.Home.route) {
          Home(navController = navController)

      }
      composable(Routes.AnimesList.route) {
          Scaffold() {

          }
      }
      composable(Routes.Favorites.route) {
         Scaffold() {

         }
      }


  }


}




sealed class Routes(val route:String) {
    object AnimesList : Routes("AnimesList")
    object Home: Routes("Home")
    object Favorites: Routes("Favorites")
}