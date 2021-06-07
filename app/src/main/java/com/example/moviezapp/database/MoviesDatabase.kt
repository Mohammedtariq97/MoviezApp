package com.example.moviezapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

@Database(entities = [Movie::class], version = 1)
abstract class MoviesDatabase: RoomDatabase() {
    abstract fun movieDao(): MovieDao

   companion object{
        @Volatile
        private var movieDbInstance :MoviesDatabase? =null

        private val NUMBER_OF_THREADS = 2
        val databaseWriteExecutor: ExecutorService = Executors.newFixedThreadPool(NUMBER_OF_THREADS)
        fun getInstance(context: Context): MoviesDatabase {
            synchronized(this) {
                var instance = movieDbInstance

                if (instance == null) {
                    instance = Room.databaseBuilder(context.applicationContext,
                        MoviesDatabase::class.java, "my_fav_movie")
                        .build()
                    movieDbInstance = instance
                }
                return instance
            }
        }
    }


}