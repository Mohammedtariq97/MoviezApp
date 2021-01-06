package com.example.moviezapp.view

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviezapp.R
import com.example.moviezapp.api.APIUserRestClient
import com.example.moviezapp.model.BaseModel
import com.example.moviezapp.model.ResultModel
import com.example.moviezapp.network.RetrofitEventListener
import retrofit2.Call
import java.util.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MainActivity"
    }
    lateinit var recyclerViewList: RecyclerView
    lateinit var progressBar: ProgressBar
    var page: Int = 1
    lateinit var movieAdapter: MoviesAdapter
    lateinit var linearLayoutManager: LinearLayoutManager
    var movieList = ArrayList<ResultModel>()
    var pastVisibleItems = 0
    var visibleItemCount = 0
    var totalItemCount = 0
    var isScrolling: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindViews()
        val cm = this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = cm.activeNetworkInfo
        if (activeNetwork != null) {
            linearLayoutManager = LinearLayoutManager(this)
            linearLayoutManager.orientation = RecyclerView.VERTICAL
            recyclerViewList.layoutManager = linearLayoutManager
            movieAdapter = MoviesAdapter(this, movieList)
            recyclerViewList.adapter = movieAdapter
            gettingDataFromInternet()
        } else {
            Toast.makeText(this, "Internet connection required", Toast.LENGTH_SHORT).show()
        }
    }

    fun gettingDataFromInternet() {
        APIUserRestClient.instance.getMoviesList(page, object : RetrofitEventListener {
            override fun onSuccess(call: Call<*>?, response: Any?) {
                if (response is BaseModel) {
                    for (index in response.results) {
                        movieList?.add(index)
                        movieAdapter.notifyDataSetChanged()
                    }
                    page++
                    recyclerViewList.addOnScrollListener(object :
                        RecyclerView.OnScrollListener() {

                        override fun onScrollStateChanged(
                            recyclerView: RecyclerView,
                            newState: Int
                        ) {
                            super.onScrollStateChanged(recyclerView, newState)
                            isScrolling = true;
                        }

                        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                            super.onScrolled(recyclerView, dx, dy)
                            visibleItemCount = linearLayoutManager.childCount
                            Log.d(TAG, visibleItemCount.toString())
                            totalItemCount = linearLayoutManager.itemCount
                            Log.d(TAG, totalItemCount.toString())
                            pastVisibleItems =
                                linearLayoutManager.findFirstVisibleItemPosition()
                            Log.d(TAG, pastVisibleItems.toString())
                            if (isScrolling) {
                                if (visibleItemCount + pastVisibleItems == totalItemCount) {
                                    gettingDataFromInternet()
                                    isScrolling = false
                                }
                            }
                        }
                    })
                }
            }

            override fun onError(call: Call<*>?, t: Throwable?) {
                Toast.makeText(
                    this@MainActivity, "Some error occurred",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }

    private fun bindViews() {
        recyclerViewList = findViewById(R.id.recyclerViewList)
        progressBar = findViewById(R.id.progressBar)
    }
}