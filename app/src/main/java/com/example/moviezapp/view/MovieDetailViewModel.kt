package com.example.moviezapp.view

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
//    var movieDetail2 = MutableLiveData<MovieDescriptionModel>()
//    var genreDetail : MutableLiveData<ArrayList<GenreModel>>? = null
//    var genreMovieString = MutableLiveData<String>()
    val genre = MutableLiveData<String>()
    var genreString = ""
    var gdataList = ArrayList<String>()
//    var languageString: String = ""
//    var spokenlanguage = ""
//    var posterPath: String? = ""
//    var movieTitleImage: String = ""
//    val IMAGE_API = "https://image.tmdb.org/t/p/w500/"
    var liveDatafavButton: LiveData<Movie>? = null

    fun getMovieDetail(movieId:String): LiveData<MovieDescriptionModel> {
        movieDetail = MoviesRepository.getMovieDetailFromInternet(movieId)
        Log.d("MovieDetailViewModel","1.${movieDetail.value}")
        return movieDetail
    }

    fun getGenreDetail(movieId:String): LiveData<String> {
        movieDetail = MoviesRepository.getMovieDetailFromInternet2(movieId)
        Log.d("MovieDetailViewModel","2.${movieDetail?.value?.genres}")
        var genreList = movieDetail.value?.genres
        var j = 0
        if (genreList != null) {
            for (index in genreList) {
                gdataList.add(index.name)
                if (genreString != "") {
                    genreString = genreString + "," + gdataList.get(j)
                } else {
                    genreString = gdataList.get(j)
                }
                j++
            }
        }
        genre.value = genreString
        return genre
    }

    fun insertFabIntoDB(context: Context,movieId: String, title: String, i: Int) {
        MoviesRepository.insertFabButtonInDB(context,movieId,title,i)
    }

    fun gettingDataFromDB(context: Context,movieId: String):LiveData<Movie>?{
        liveDatafavButton = MoviesRepository.gettingDataFromDB(context,movieId)
        Log.d("MovieDetailViewModel","${liveDatafavButton?.value?.favourite}")
        return liveDatafavButton
    }
}
