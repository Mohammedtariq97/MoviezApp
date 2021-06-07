package com.example.moviezapp.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\'\u00a8\u0006\n"}, d2 = {"Lcom/example/moviezapp/database/MovieDao;", "", "getMovie", "Landroidx/lifecycle/LiveData;", "Lcom/example/moviezapp/database/Movie;", "movieId", "", "insert", "", "movie", "app_debug"})
public abstract interface MovieDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.moviezapp.database.Movie movie);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * from movieFavourite WHERE movie_id = :movieId")
    public abstract androidx.lifecycle.LiveData<com.example.moviezapp.database.Movie> getMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId);
}