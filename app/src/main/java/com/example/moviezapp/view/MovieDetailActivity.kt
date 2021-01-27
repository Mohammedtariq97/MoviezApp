package com.example.moviezapp.view

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.moviezapp.R
import com.example.moviezapp.database.Movie
import com.example.moviezapp.database.MoviesDatabase
import com.example.moviezapp.model.GenreModel
import com.example.moviezapp.model.ResultModel
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import java.util.ArrayList

class MovieDetailActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MovieDetailActivity"
    }

    lateinit var movieTitle: TextView
    lateinit var movieImage: ImageView
    lateinit var favouriteFab: FloatingActionButton
    lateinit var description: TextView
    lateinit var rating: TextView
    lateinit var ratingCount: TextView
    lateinit var genre: TextView
    lateinit var spokenLanguage: TextView
    var movieId: String = ""
    var genreString: String = ""
    var posterPath: String = ""
    var movieTitleImage: String = ""
    var gdataList = ArrayList<String>()
    val IMAGE_API = "https://image.tmdb.org/t/p/w500/"
    lateinit var movieDetailViewModel: MovieDetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        bindViews()
        movieDetailViewModel = ViewModelProvider(this).get(MovieDetailViewModel::class.java)
        val intent = intent.getParcelableExtra<ResultModel>("movieDetailList")
        movieId = intent.id.toString()
        movieTitle.text = intent.title
        description.text = intent.overview
        rating.text = intent.voteAverage.toString()
        ratingCount.text = intent.voteCount.toString()
        movieDetailViewModel.getMovieDetail(movieId).observe(this, Observer {
            genre.text = genreConversion(it.genres)
            spokenLanguage.text = it.spokenLanguages[0].englishName
            posterPath = it.posterPath
            movieTitleImage = IMAGE_API + posterPath
            Glide.with(this)
                .load(movieTitleImage)
                .placeholder(R.drawable.placeholderimg)
                .apply(RequestOptions().fitCenter())
                .into(movieImage)
        })

        favouriteFab.setOnClickListener { view ->
            Log.d(TAG, "Inserting,${movieId},${intent.title}")

            val fav=1
            movieDetailViewModel.insertFabIntoDB(this,movieId,intent.title,fav)
            Log.d(TAG, "favButStatus = 0")
            favouriteFab.setImageResource(R.drawable.ic_fab_image)
            Snackbar.make(view, "Added as Favourite", Snackbar.LENGTH_SHORT).show()
        }

        movieDetailViewModel.gettingDataFromDB(this,movieId)?.observe(this, Observer {
            if(it != null){
                favouriteFab.setImageResource(R.drawable.ic_fab_image)
            }
        })
    }

    private fun genreConversion(genres: ArrayList<GenreModel>): String {
        var j=0
        for (index in genres) {
            gdataList.add(index.name)
            if (genreString != "") {
                genreString = genreString + "," + gdataList.get(j)
            } else {
                genreString = gdataList.get(j)
            }
            j++
        }
        return genreString
    }

    private fun bindViews() {
        movieTitle = findViewById(R.id.movieTitle)
        movieImage = findViewById(R.id.movieImage)
        favouriteFab = findViewById(R.id.favouriteFab)
        description = findViewById(R.id.description)
        rating = findViewById(R.id.rating)
        ratingCount = findViewById(R.id.ratingCount)
        genre = findViewById(R.id.genre)
        spokenLanguage = findViewById(R.id.spokenLanguage)
    }

}