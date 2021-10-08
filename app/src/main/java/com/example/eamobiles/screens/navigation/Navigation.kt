package com.example.eamobiles.screens.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()

    //  TODO NavHost(navController =  navController, startDestination = ) {
    //         }


}




sealed class Routes(val route:String) {
//TODO  object GenList : Routes("GenList")
//    object GenDetails : Routes("GenDetails") {
//        const val routeWithArgument = "GenDetails/{id}"
//        const val argument = "id"
//          }
}