package com.example.moviezapp.api

import com.example.moviezapp.model.BaseModel
import com.example.moviezapp.model.MovieDescriptionModel
import retrofit2.Response
import retrofit2.http.*

interface APIUser {

    @GET("discover/movie")
    suspend fun getMovieResults(@Query("api_key") apiKey: String,
                                @Query("page") page: Int
    ): Response<BaseModel>

    @GET()
    suspend fun getMovieDetailResult(
        @Url url:String ,
        @Query("api_key") apiKey: String
    ): Response<MovieDescriptionModel>

}