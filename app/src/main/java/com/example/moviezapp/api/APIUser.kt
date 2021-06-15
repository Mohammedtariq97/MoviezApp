package com.example.moviezapp.api

import com.example.moviezapp.model.BaseModel
import retrofit2.Response
import retrofit2.http.*

interface APIUser {

    @GET("discover/movie")
    suspend fun getMovieResults(@Query("api_key") apiKey: String,
                                @Query("page") page: Int
    ): Response<BaseModel>

//    @GET("movie/{movie_id}")
//    fun getMovieResult(
//        @Path("movie_id") movieId: String,
//        @Query("api_key") apiKey: String
//    ): Call<MovieDescriptionModel>

}