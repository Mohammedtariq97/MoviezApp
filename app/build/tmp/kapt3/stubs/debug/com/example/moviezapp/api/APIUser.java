package com.example.moviezapp.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lcom/example/moviezapp/api/APIUser;", "", "getMovieResult", "Lretrofit2/Call;", "Lcom/example/moviezapp/model/MovieDescriptionModel;", "movieId", "", "apiKey", "getMovieResults", "Lcom/example/moviezapp/model/BaseModel;", "page", "", "app_debug"})
public abstract interface APIUser {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "discover/movie")
    public abstract retrofit2.Call<com.example.moviezapp.model.BaseModel> getMovieResults(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{movie_id}")
    public abstract retrofit2.Call<com.example.moviezapp.model.MovieDescriptionModel> getMovieResult(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "movie_id")
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey);
}