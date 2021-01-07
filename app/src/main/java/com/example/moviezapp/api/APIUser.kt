package com.example.moviezapp.api

import com.example.moviezapp.model.BaseModel
import com.example.moviezapp.model.MovieDescriptionModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface APIUser {

    @GET("discover/movie")
    fun getMovieResults(@Query("api_key") apiKey: String, @Query("page") page: Int): Call<BaseModel>

    @GET("movie/{movie_id}")
    fun getMovieResult(
        @Path("movie_id") movieId: String,
        @Query("api_key") apiKey: String
    ): Call<MovieDescriptionModel>

}