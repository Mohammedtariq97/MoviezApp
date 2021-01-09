package com.example.moviezapp.database

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "movieFavourite")

class Movie {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "movie_id")
    var movieId :String = ""

    @ColumnInfo(name = "movie_name")
    var movieName:String =""

    @ColumnInfo(name = "isFavourite")
    var favourite :Int = 0

}

