package com.example.moviezapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(movie:Movie)

    @Query("SELECT * from movieFavourite WHERE movie_id = :movieId")
    fun getMovie(movieId:String) : Movie
}