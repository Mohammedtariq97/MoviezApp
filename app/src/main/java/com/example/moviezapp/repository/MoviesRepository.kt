package com.example.moviezapp.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.moviezapp.api.APIUserRestClient
import com.example.moviezapp.model.BaseModel
import com.example.moviezapp.model.ResultModel
import com.example.moviezapp.network.RetrofitEventListener
import retrofit2.Call
import java.util.ArrayList

object MoviesRepository {
    var moviesList = MutableLiveData<ArrayList<ResultModel>>()

    fun getMoviesData(page:Int) : MutableLiveData<ArrayList<ResultModel>> {
        APIUserRestClient.instance.getMoviesList(page,object:RetrofitEventListener{
            override fun onSuccess(call: Call<*>?, response: Any?) {
                if(response is BaseModel){
                    moviesList.value = response.results
                    Log.d("MovieRepo","moviesList = ${moviesList.value?.size} ")
                }
            }

            override fun onError(call: Call<*>?, t: Throwable?) {
                Log.d("MovieRepo","Error fetching data")
            }

        })
        Log.d("MovieRepo","moviesListAfterRespose = ${moviesList.value?.size} ")
        return moviesList
    }
}