package com.example.moviezapp.repository

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.moviezapp.R
import com.example.moviezapp.api.APIUserRestClient
import com.example.moviezapp.database.Movie
import com.example.moviezapp.database.MoviesDatabase
import com.example.moviezapp.model.BaseModel
import com.example.moviezapp.model.GenreModel
import com.example.moviezapp.model.MovieDescriptionModel
import com.example.moviezapp.model.ResultModel
import com.example.moviezapp.network.RetrofitEventListener
import com.example.moviezapp.view.MovieDetailActivity
import retrofit2.Call
import java.util.ArrayList

object MoviesRepository {

    var favButtonModel: LiveData<Movie>? = null

    fun getMoviesData(page:Int) : LiveData<ArrayList<ResultModel>> {
        val moviesList = MutableLiveData<ArrayList<ResultModel>>()
        APIUserRestClient.instance.getMoviesList(page,object:RetrofitEventListener{
            override fun onSuccess(call: Call<*>?, response: Any?) {
                if(response is BaseModel){
                    moviesList.value = response.results
                    Log.d("MovieRepo","moviesList = ${moviesList.value?.size} ")
                }
            }

            override fun onError(call: Call<*>?, t: Throwable?) {
                Log.d("MovieRepo","Error fetching movies data")
            }

        })
        Log.d("MovieRepo","moviesListAfterRespose = ${moviesList.value?.size} ")
        return moviesList
    }

    fun getMovieDetailFromInternet(movieId:String):LiveData<MovieDescriptionModel>{
        val movieDetailData = MutableLiveData<MovieDescriptionModel>()
        APIUserRestClient.instance.getMovieDescriptionList(movieId,object:RetrofitEventListener{
            override fun onSuccess(call: Call<*>?, response: Any?) {
                if(response is MovieDescriptionModel){
                    movieDetailData.value = response
                }
            }

            override fun onError(call: Call<*>?, t: Throwable?) {
                Log.d("MovieRepo","Error fetching a movie data")
            }

        })
        return movieDetailData
    }

    fun getMovieDetailFromInternet2(movieId:String):LiveData<MovieDescriptionModel>{
        val movieDetailData2 = MutableLiveData<MovieDescriptionModel>()
        APIUserRestClient.instance.getMovieDescriptionList(movieId,object:RetrofitEventListener{
            override fun onSuccess(call: Call<*>?, response: Any?) {
                if(response is MovieDescriptionModel){
                    Log.d("MovieRepo","${response.toString()}")
                    movieDetailData2.value = response
                }
            }

            override fun onError(call: Call<*>?, t: Throwable?) {
                Log.d("MovieRepo","Error fetching a movie data")
            }

        })
        return movieDetailData2
    }

    fun insertFabButtonInDB(context: Context,movieId: String, title: String, i: Int) {
        val moviesDao = MoviesDatabase.getInstance(context).movieDao()
        val movie = Movie()
        movie.movieId = movieId
        movie.movieName = title
        movie.favourite = i
        MoviesDatabase.databaseWriteExecutor.execute {
            Log.d("MovieRepo", "${movie.movieId},${movie.movieName},${movie.favourite}")
            moviesDao.insert(movie)
        }
        Log.d("MovieRepo", "${movie.movieId},${movie.movieName},${movie.favourite}")
    }

    fun gettingDataFromDB(context: Context,movieId: String): LiveData<Movie>? {
        val moviesDao = MoviesDatabase.getInstance(context).movieDao()
        MoviesDatabase.databaseWriteExecutor.execute() {
            favButtonModel = moviesDao.getMovie(movieId)
            Log.d("MovieRepo",
                    "${favButtonModel?.value?.movieId},${favButtonModel?.value?.movieName}," +
                            "movie.favourite = ${favButtonModel?.value?.favourite}")

        }
        return favButtonModel
    }

}