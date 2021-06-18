package com.example.moviezapp.repository

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.moviezapp.R
import com.example.moviezapp.Utils.Constants
import com.example.moviezapp.api.APIUserRestClient
import com.example.moviezapp.database.Movie
import com.example.moviezapp.database.MoviesDatabase
import com.example.moviezapp.model.BaseModel
import com.example.moviezapp.model.GenreModel
import com.example.moviezapp.model.MovieDescriptionModel
import com.example.moviezapp.model.ResultModel
import com.example.moviezapp.network.Retrofit
import com.example.moviezapp.network.RetrofitEventListener
import com.example.moviezapp.view.MovieDetailActivity
import retrofit2.Call
import retrofit2.Response
import java.util.ArrayList

class MoviesRepository {

    suspend fun getMoviesData(page:Int) = Retrofit.api.getMovieResults(Constants.API_KEY,page)


    suspend fun getMovieDetailData(url:String) = Retrofit.api.getMovieDetailResult(url,Constants.API_KEY)


//    suspend fun getMoviesData(page:Int) : LiveData<ArrayList<ResultModel>> {
//        val moviesList = MutableLiveData<ArrayList<ResultModel>>()
//        APIUserRestClient.instance.getMoviesList(page,object:RetrofitEventListener{
//            override fun onSuccess(call: Call<*>?, response: Any?) {
//                if(response is BaseModel){
//                    moviesList.value = response.results
//                }
//            }
//
//            override fun onError(call: Call<*>?, t: Throwable?) {
//                Log.d("MovieRepo","Error fetching movies data")
//            }
//
//        })
//        Log.d("MovieRepo","moviesListAfterRespose = ${moviesList.value?.size} ")
//        return moviesList
//    }



//    fun getMovieDetailFromInternet(movieId:String):LiveData<MovieDescriptionModel>{
//        val movieDetailData = MutableLiveData<MovieDescriptionModel>()
//        APIUserRestClient.instance.getMovieDescriptionList(movieId,object:RetrofitEventListener{
//            override fun onSuccess(call: Call<*>?, response: Any?) {
//                if(response is MovieDescriptionModel){
//                    movieDetailData.value = response
//                }
//            }
//
//            override fun onError(call: Call<*>?, t: Throwable?) {
//                Log.d("MovieRepo","Error fetching a movie data")
//            }
//
//        })
//        return movieDetailData
//    }
//
//    fun insertFabButtonInDB(context: Context,movieId: String, title: String, i: Int) {
//        val moviesDao = MoviesDatabase.getInstance(context).movieDao()
//        val movie = Movie()
//        movie.movieId = movieId
//        movie.movieName = title
//        movie.favourite = i
//        MoviesDatabase.databaseWriteExecutor.execute {
//            Log.d("MovieRepo", "${movie.movieId},${movie.movieName},${movie.favourite}")
//            moviesDao.insert(movie)
//        }
//        Log.d("MovieRepo", "${movie.movieId},${movie.movieName},${movie.favourite}")
//    }
//
//    fun gettingDataFromDB(context: Context,movieId: String): LiveData<Movie>? {
//        val moviesDao = MoviesDatabase.getInstance(context).movieDao()
//        MoviesDatabase.databaseWriteExecutor.execute() {
//            favButtonModel = moviesDao.getMovie(movieId)
//            Log.d("MovieRepo",
//                    "${favButtonModel?.value?.movieId},${favButtonModel?.value?.movieName}," +
//                            "movie.favourite = ${favButtonModel?.value?.favourite}")
//
//        }
//        return favButtonModel
//    }

}