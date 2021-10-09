package com.example.eamobiles.screens.Anime

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.eamobiles.data.model.Anime
import com.example.eamobiles.repository.AnimeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(private val animeRepository: AnimeRepository): ViewModel() {
    private var _animes = MutableLiveData<List<Anime>>()
    val animes get() = _animes


    fun fetchAnimes() {
        viewModelScope.launch {
            _animes.postValue(animeRepository.fetchAnime())
        }
    }

    fun insert(anime: Anime) {
        viewModelScope.launch {
            animeRepository.insert(anime)
        }
    }

    fun delete(anime: Anime) {
        viewModelScope.launch {
            animeRepository.delete(anime)
        }
    }



}