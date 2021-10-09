package com.example.eamobiles.screens.Home
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.eamobiles.screens.navigation.Routes
@Composable
fun Home(
    navController: NavController
) {

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        Button(

            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            onClick = {
                navController.navigate(Routes.AnimesList.route)
            }) {
            Text("Animes")
        }

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            onClick = {
                navController.navigate(Routes.Favorites.route)
            }) {
            Text("Favorites")
        }
    }
}
