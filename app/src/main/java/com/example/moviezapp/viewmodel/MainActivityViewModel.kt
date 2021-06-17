package com.example.moviezapp.viewmodel

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviezapp.model.BaseModel
import com.example.moviezapp.model.ResultModel
import com.example.moviezapp.repository.MoviesRepository
import kotlinx.coroutines.launch
import retrofit2.Response
import java.util.ArrayList

class MainActivityViewModel(val movieRepo: MoviesRepository) :ViewModel(){

    lateinit var moviesDataList : MutableLiveData<BaseModel>

    var page =1
    var movieDataListPagination : BaseModel? = null

    init {
        redeclareLivedata()
    }

    private fun redeclareLivedata() {
        moviesDataList = MutableLiveData<BaseModel>()
    }

    fun getMovieList()= viewModelScope.launch {
        try {
            val response = movieRepo.getMoviesData(page)
            moviesDataList.postValue(handleMovieResponse(response))
        } catch (e: Exception) {
            Log.d("ViewModel",e.message.toString())
            e.printStackTrace()
        }
    }

    private fun handleMovieResponse(response: Response<BaseModel>): BaseModel? {
        if(response.isSuccessful){
            response.body().let {
                page++
                Log.d("Viewmodel","pagno = ${page}")
                if(movieDataListPagination == null){
                    movieDataListPagination = it
                }else{
                    movieDataListPagination?.results?.addAll(it?.results!!)
                }
                return movieDataListPagination!!
            }
        }else{
            Log.d("ViewModel","Error fetching response")
            return null
        }
    }

//    fun gettingMoreDataFromInternet(page:Int):LiveData<ArrayList<ResultModel>>{
//        val moviesDataList2 = MoviesRepository.getMoviesData(page)
//        return moviesDataList2
//    }
}