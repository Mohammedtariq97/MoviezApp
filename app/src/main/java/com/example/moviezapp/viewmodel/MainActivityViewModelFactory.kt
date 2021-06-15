package com.example.moviezapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.moviezapp.repository.MoviesRepository

class MainActivityViewModelFactory(val moviesRepository: MoviesRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainActivityViewModel(moviesRepository) as T
    }

}