package com.example.moviezapp.view

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.moviezapp.R
import com.example.moviezapp.api.APIUserRestClient
import com.example.moviezapp.model.MovieDescriptionModel
import com.example.moviezapp.model.ResultModel
import com.example.moviezapp.network.RetrofitEventListener
import com.google.android.material.floatingactionbutton.FloatingActionButton
import retrofit2.Call
import java.util.ArrayList

class MovieDetailActivity : AppCompatActivity() {
    lateinit var movieTitle: TextView
    lateinit var movieImage: ImageView
    lateinit var favouriteFab: FloatingActionButton
    lateinit var description: TextView
    lateinit var rating: TextView
    lateinit var ratingCount: TextView
    lateinit var genre: TextView
    lateinit var spokenLanguage: TextView
    var movieId: String = ""
    var genreList = ArrayList<String>()
    var languageList = ArrayList<String>()
    var genreString: String = ""
    var languageString: String = ""
    var posterPath: String = ""
    var movieTitleImage: String = ""
    val IMAGE_API = "https://image.tmdb.org/t/p/w500/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        bindViews()
        val intent = intent.getParcelableExtra<ResultModel>("movieDetailList")
        movieId = intent.id.toString()
        getMovieDetailFromInternet(this, movieId)
        movieTitle.text = intent.title
        description.text = intent.overview
        rating.text = intent.voteAverage.toString()
        ratingCount.text = intent.voteCount.toString()
        genre.text = genreString
    }

    private fun getMovieDetailFromInternet(context: Context, movieId: String) {
        Log.d(MainActivity.TAG, "GettingDataFromInternet")

        APIUserRestClient.instance.getMovieDescriptionList(movieId, object : RetrofitEventListener {
            override fun onSuccess(call: Call<*>?, response: Any?) {
                if (response is MovieDescriptionModel) {
                    //Getting genre
                    var j = 0
                    for (index in response.genres) {
                        genreList?.add(index.name)
                        if (genreString != "") {
                            genreString = genreString + "," + genreList.get(j)
                        } else {
                            genreString = genreList.get(j)
                        }
                        j++
                    }
                    Log.d("MovieDetailActivity", "$genreString")
                    genre.text = genreString
                    //Getting language
                    var i = 0
                    for (index in response.spokenLanguages) {
                        languageList?.add(index.englishName)
                        if (languageString != "") {
                            languageString = languageString + "," + languageList.get(i)
                        } else {
                            languageString = languageList.get(i)
                        }
                        i++
                    }
                    spokenLanguage.text = languageString
                    Log.d("MovieDetailActivity", "$languageString")
                    //Getting image
                    posterPath = response.posterPath
                    movieTitleImage = IMAGE_API + posterPath
                    Log.d("MovieDetailActivity", "$posterPath,$movieTitleImage")
                    Glide.with(context)
                        .load(movieTitleImage)
                        .placeholder(R.drawable.placeholderimg)
                        .apply(RequestOptions().fitCenter())
                        .into(movieImage)
                }
            }

            override fun onError(call: Call<*>?, t: Throwable?) {
                Toast.makeText(
                    this@MovieDetailActivity, "Some error occurred",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
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