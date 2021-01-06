package com.example.moviezapp.api

import com.example.moviezapp.model.BaseModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIUser {

    @GET("3/discover/movie")
    fun getMovieResults(@Query("api_key") apiKey:String,@Query("page") page:Int): Call<BaseModel>
}