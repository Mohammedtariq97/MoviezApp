package com.example.moviezapp.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moviezapp.model.MovieDescriptionModel
import com.example.moviezapp.repository.MoviesRepository
import java.util.ArrayList
import android.util.Log
import com.example.moviezapp.database.Movie

class MovieDetailViewModel:ViewModel() {
    lateinit var movieDetail :LiveData<MovieDescriptionModel>
    val genre = MutableLiveData<String>()
    var genreString = ""
    var gdataList = ArrayList<String>()
    var liveDatafavButton: LiveData<Movie>? = null

//    fun getMovieDetail(movieId:String): LiveData<MovieDescriptionModel> {
//        movieDetail = MoviesRepository.getMovieDetailFromInternet(movieId)
//        Log.d("MovieDetailViewModel","1.${movieDetail.value}")
//        return movieDetail
//    }
//
//    fun insertFabIntoDB(context: Context,movieId: String, title: String, i: Int) {
//        MoviesRepository.insertFabButtonInDB(context,movieId,title,i)
//    }
//
//    fun gettingDataFromDB(context: Context,movieId: String):LiveData<Movie>?{
//        liveDatafavButton = MoviesRepository.gettingDataFromDB(context,movieId)
//        Log.d("MovieDetailViewModel","${liveDatafavButton?.value?.favourite}")
//        return liveDatafavButton
//    }
}
