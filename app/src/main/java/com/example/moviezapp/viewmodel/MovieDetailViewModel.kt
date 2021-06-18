package com.example.moviezapp.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moviezapp.model.MovieDescriptionModel
import com.example.moviezapp.repository.MoviesRepository
import java.util.ArrayList
import android.util.Log
import retrofit2.Response
import androidx.lifecycle.viewModelScope
import com.example.moviezapp.database.Movie
import kotlinx.coroutines.launch

class MovieDetailViewModel(val movieRepo: MoviesRepository):ViewModel() {
    lateinit var movieDetail :MutableLiveData<MovieDescriptionModel>
    val genre = MutableLiveData<String>()
    var genreString = ""
    var gdataList = ArrayList<String>()
    var liveDatafavButton: LiveData<Movie>? = null

    init {
        redeclareLivedata()
    }

    private fun redeclareLivedata() {
        movieDetail = MutableLiveData<MovieDescriptionModel>()
    }

    fun getMovieDetail(url:String) = viewModelScope.launch {
        try {
            val response = movieRepo.getMovieDetailData(url)
            movieDetail.postValue(handleMovieDetailResponse(response))
        } catch (e: Exception) {
            Log.d("ViewModel", "error = ${e.message.toString()}")
            e.printStackTrace()
        }
    }

    private fun handleMovieDetailResponse(response: Response<MovieDescriptionModel>): MovieDescriptionModel? {
        if(response.isSuccessful){
            response.body().let {
                return it!!
            }
        }else{
            Log.d("ViewModel","Error fetching response")
            return null
        }
    }

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
