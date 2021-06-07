package com.example.moviezapp.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moviezapp.model.BaseModel
import com.example.moviezapp.model.ResultModel
import com.example.moviezapp.repository.MoviesRepository
import java.util.ArrayList

class MainActivityViewModel :ViewModel(){

    lateinit var moviesDataList : LiveData<ArrayList<ResultModel>>

    fun getMovieList(page:Int): LiveData<ArrayList<ResultModel>> {
        moviesDataList = MoviesRepository.getMoviesData(page)
        Log.d("MainActivityViewModel","moviesDatalist = ${moviesDataList.value?.size} ")
        return moviesDataList
    }

    fun gettingMoreDataFromInternet(page:Int):LiveData<ArrayList<ResultModel>>{
        val moviesDataList2 = MoviesRepository.getMoviesData(page)
        return moviesDataList2
    }
}