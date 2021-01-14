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
    var genreList = ArrayList<String>()
    var languageList = ArrayList<String>()
    var genreString: String = ""
    var languageString: String = ""
    var posterPath: String = ""
    var movieTitleImage: String = ""
    val IMAGE_API = "https://image.tmdb.org/t/p/w500/"
    lateinit var movie2: Movie
    lateinit var movieDetailViewModel: MovieDetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        bindViews()
        movieDetailViewModel = ViewModelProvider(this).get(MovieDetailViewModel::class.java)
        val intent = intent.getParcelableExtra<ResultModel>("movieDetailList")
        movieId = intent.id.toString()
        var favButStatus = 1
//        movieDetailViewModel.gettingDataFromDB(this,movieId)?.observe(this, Observer {
////            Log.d(TAG,"${it.favourite.toString()}")
//            if(it.favourite == 1){
//                favouriteFab.setImageResource(R.drawable.ic_fab_image)
//            }
//        })
//        Log.d(TAG, "favButStatus = $favButStatus")
//        if (favButStatus == 1) {
//            favouriteFab.setImageResource(R.drawable.ic_fab_image)
//        }
        movieTitle.text = intent.title
        description.text = intent.overview
        rating.text = intent.voteAverage.toString()
        ratingCount.text = intent.voteCount.toString()
        movieDetailViewModel.getMovieDetail(movieId).observe(this, Observer {
//            genre.text = it.genres.toString()
            Log.d(TAG,"$it")
            spokenLanguage.text = it.spokenLanguages[0].englishName
            posterPath = it.posterPath
//            genre.text = getGenres(it.genres)
            movieTitleImage = IMAGE_API + posterPath
            Glide.with(this)
                .load(movieTitleImage)
                .placeholder(R.drawable.placeholderimg)
                .apply(RequestOptions().fitCenter())
                .into(movieImage)
        })
        movieDetailViewModel.getGenreDetail(movieId).observe(this, Observer {
            if((it != "")&&(it != null)){
                genre.text = it
            }

        })

        favouriteFab.setOnClickListener { view ->
            Log.d(TAG, "Inserting,${movieId},${intent.title}")
            Log.d(TAG, "FAB button clicked,${favButStatus}")
            val fav=1
            movieDetailViewModel.insertFabIntoDB(this,movieId,intent.title,fav)
            Log.d(TAG, "favButStatus = 0")
            favouriteFab.setImageResource(R.drawable.ic_fab_image)
            Snackbar.make(view, "Added as Favourite", Snackbar.LENGTH_SHORT).show()
        }
//        favouriteFab.setOnClickListener { view ->
//            Log.d(TAG, "Inserting,${movieId},${intent.title}")
//            Log.d(TAG, "FAB button clicked,${favButStatus}")
//            if (favButStatus == 0) {
//                Log.d(TAG, "favButStatus = 0")
//                favouriteFab.setImageResource(R.drawable.ic_fab_image)
//                insertMovieInDB(movieId, intent.title)
//            }
//            Snackbar.make(view, "Added as Favourite", Snackbar.LENGTH_SHORT).show()
//        }
    }

//    private fun getDataFromDB(movieId2: String): Int {
//        movie2 = Movie()
//        MoviesDatabase.databaseWriteExecutor.execute() {
//            val moviesDao = MoviesDatabase.getInstance(application).movieDao()
//            if (moviesDao.getMovie(movieId2) == null) {
//                Log.d(TAG, "favourite = zero")
//                movie2.favourite = 0
//            } else {
//                movie2 = moviesDao.getMovie(movieId2)
//                Log.d(
//                    TAG,
//                    "${movie2.movieId},${movie2.movieName},movie.favourite = ${movie2.favourite}"
//                )
//                favouriteFab.setImageResource(R.drawable.ic_fab_image)
//
//            }
//        }
//        Log.d(TAG, "movie_fav = ${movie2.favourite}")
//        return movie2.favourite
//
//    }

//    private fun insertMovieInDB(movieId: String, title: String) {
//        val moviesDao = MoviesDatabase.getInstance(application).movieDao()
//        val movie = Movie()
//        movie.movieId = movieId
//        movie.movieName = title
//        movie.favourite = 1
//        MoviesDatabase.databaseWriteExecutor.execute {
//            Log.d(TAG, "${movie.movieId},${movie.movieName},${movie.favourite}")
//            moviesDao.insert(movie)
//        }
//        Log.d(TAG, "Inserted movie in DB")
//    }


//    private fun getMovieDetailFromInternet(context: Context, movieId: String) {
//        Log.d(TAG, "GettingDataFromInternet")
//
//        APIUserRestClient.instance.getMovieDescriptionList(movieId, object : RetrofitEventListener {
//            override fun onSuccess(call: Call<*>?, response: Any?) {
//                if (response is MovieDescriptionModel) {
//                    //Getting genre
//                    var j = 0
//                    for (index in response.genres) {
//                        genreList?.add(index.name)
//                        if (genreString != "") {
//                            genreString = genreString + "," + genreList.get(j)
//                        } else {
//                            genreString = genreList.get(j)
//                        }
//                        j++
//                    }
//                    genre.text = genreString
//                    //Getting language
//                    var i = 0
//                    for (index in response.spokenLanguages) {
//                        languageList?.add(index.englishName)
//                        if (languageString != "") {
//                            languageString = languageString + "," + languageList.get(i)
//                        } else {
//                            languageString = languageList.get(i)
//                        }
//                        i++
//                    }
//                    spokenLanguage.text = languageString
//                    //Getting image
//                    posterPath = response.posterPath
//                    movieTitleImage = IMAGE_API + posterPath
//                    Glide.with(context)
//                        .load(movieTitleImage)
//                        .placeholder(R.drawable.placeholderimg)
//                        .apply(RequestOptions().fitCenter())
//                        .into(movieImage)
//                }
//            }
//
//            override fun onError(call: Call<*>?, t: Throwable?) {
//                Toast.makeText(
//                    this@MovieDetailActivity, "Some error occurred while getting data",
//                    Toast.LENGTH_SHORT
//                ).show()
//            }
//        })
//    }

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