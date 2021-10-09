package com.example.eamobiles.screens.Anime

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.example.eamobiles.data.model.Anime

@Composable
fun Animes(animeViewModel: AnimeViewModel) {
    
    Scaffold() {

         AnimeList(animeViewModel)

    }

}

@Composable
fun AnimeList(viewModel: AnimeViewModel) {
   val animes : List<Anime> by viewModel.animes.observeAsState(listOf())
    LazyColumn {
        items(animes) {
            anime-> 
            AnimeRow(anime, insertAnime={viewModel.insert(anime)},
                     deleteAnime={viewModel.delete(anime)})
        }
    }
}

@Composable
fun AnimeRow(anime: Anime, insertAnime: () -> Unit, deleteAnime: () -> Unit) {
    var favorite by remember {
        mutableStateOf(false)
    }
    favorite = anime.favorite

    Card (
        modifier = Modifier
            .padding(4.dp)

    ) {
        Card(
            modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth(),
            elevation = 2.dp
        ) {
            Row{
                AnimeImage(anime)
                Spacer(modifier = Modifier.width(8.dp))
                Column(modifier = Modifier.weight(7f)) {
                    Text(anime.animeName, fontWeight = FontWeight.Bold)
                    Text(anime.animeID.toString())
                }
                IconButton(
                    modifier = Modifier.weight(1f),
                    onClick = {
                        if (favorite) {
                            deleteAnime()
                        } else {
                            insertAnime()
                        }
                        favorite = !favorite
                    }) {
                    Icon(
                        Icons.Filled.Favorite,
                        null,
                        tint = if (favorite) MaterialTheme.colors.primary else MaterialTheme.colors.onSurface
                    )
                }
            }
            }
        }

    }

@OptIn(ExperimentalCoilApi::class)
@Composable
fun AnimeImage(anime: Anime) {
    Image(
        painter = rememberImagePainter(anime.animeImg),
        contentDescription =  null,
        modifier = Modifier
            .size(92.dp)
            .clip(shape = RoundedCornerShape(4.dp)),
        contentScale =  ContentScale.Crop
    )
}



