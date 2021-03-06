package com.example.moviezapp.view

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
import com.example.moviezapp.Utils.Constants.Companion.BASE_URL
import com.example.moviezapp.Utils.Constants.Companion.IMAGE_API
import com.example.moviezapp.model.GenreModel
import com.example.moviezapp.model.ResultModel
import com.example.moviezapp.repository.MoviesRepository
import com.example.moviezapp.viewmodel.MainActivityViewModel
import com.example.moviezapp.viewmodel.MainActivityViewModelFactory
import com.example.moviezapp.viewmodel.MovieDetailViewModel
import com.example.moviezapp.viewmodel.MovieDetailViewModelFactory
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
    lateinit var movieDetailViewModel: MovieDetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        val repository= MoviesRepository()
        movieDetailViewModel = ViewModelProvider(this, MovieDetailViewModelFactory(repository))
                .get(MovieDetailViewModel::class.java)
        bindViews()
        val intent = getIntent()?.getStringExtra("MovieId")
        movieId = intent.toString()
        getMovieDetails(movieId)

//        favouriteFab.setOnClickListener { view ->
//            Log.d(TAG, "Inserting,${movieId},${intent.title}")
//
//            val fav=1
//            movieDetailViewModel.insertFabIntoDB(this,movieId,intent.title,fav)
//            Log.d(TAG, "favButStatus = 0")
//            favouriteFab.setImageResource(R.drawable.ic_fab_image)
//            Snackbar.make(view, "Added as Favourite", Snackbar.LENGTH_SHORT).show()
//        }
//
//        movieDetailViewModel.gettingDataFromDB(this,movieId)?.observe(this, Observer {
//            if(it != null){
//                favouriteFab.setImageResource(R.drawable.ic_fab_image)
//            }
//        })
    }

    private fun getMovieDetails(movieId:String) {
        val url = "$BASE_URL/movie/$movieId"
        movieDetailViewModel.getMovieDetail(url)

        movieDetailViewModel.movieDetail.observe(this, Observer {
            movieTitle.text = it.originalTitle
            description.text = it.overview
            rating.text = it.voteAverage.toString()
            ratingCount.text = it.voteCount.toString()
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