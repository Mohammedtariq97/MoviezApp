package com.example.moviezapp.view

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
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
    var page = 1
    lateinit var movieAdapter :MoviesAdapter
    lateinit var linearLayoutManager: LinearLayoutManager
//    var movieList = ArrayList<ResultModel>()
    var pastVisibleItems = 0
    var visibleItemCount = 0
    var totalItemCount = 0
    var isScrolling: Boolean = false
    lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        bindViews()
        mainActivityViewModel.getMovieList(page).observe(this, androidx.lifecycle.Observer { moviesList ->
            Log.d(TAG,"moviesList= $moviesList")
            setRecyclerView(moviesList)
        })
    }

    private fun setRecyclerView(moviesList: ArrayList<ResultModel>) {
        Log.d(TAG,"SettingRecyclerViewList")
        linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = RecyclerView.VERTICAL
        recyclerViewList.layoutManager = linearLayoutManager
        movieAdapter = MoviesAdapter(this,  moviesList)
        recyclerViewList.adapter = movieAdapter
        recyclerViewList.addOnScrollListener(object :
            RecyclerView.OnScrollListener() {

            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                isScrolling = true;
                Log.d(TAG, "onScrollStateChangeCalled")
            }

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                Log.d(TAG, "onScrolledCalled")
                visibleItemCount = linearLayoutManager.childCount
//                Log.d(TAG, visibleItemCount.toString())
                totalItemCount = linearLayoutManager.itemCount
//                Log.d(TAG, totalItemCount.toString())
                pastVisibleItems =
                    linearLayoutManager.findFirstVisibleItemPosition()
//                Log.d(TAG, pastVisibleItems.toString())
                if (isScrolling) {
                    if (visibleItemCount + pastVisibleItems == totalItemCount) {
                        page++
//                        var movieListMore = MutableLiveData<ArrayList<ResultModel>>()
//                        val moviesUpdatedlist : MutableLiveData<ArrayList<ResultModel>>?
                        val moviesUpdatedlist = mainActivityViewModel.gettingMoreDataFromInternet(page)
                        movieAdapter.updateData(moviesUpdatedlist.value)
                        isScrolling = false
                    }
                }
            }
        })
    }

//    fun gettingDataFromInternet() {
//        Log.d(TAG, "GettingDataFromInternet")
//        APIUserRestClient.instance.getMoviesList(page, object : RetrofitEventListener {
//            override fun onSuccess(call: Call<*>?, response: Any?) {
//                if (response is BaseModel) {
//                    for (index in response.results!!) {
//                        movieList?.add(index)
//                    }
//                    movieAdapter.notifyDataSetChanged()
//                    page++
//                    recyclerViewList.addOnScrollListener(object :
//                        RecyclerView.OnScrollListener() {
//
//                        override fun onScrollStateChanged(
//                            recyclerView: RecyclerView,
//                            newState: Int
//                        ) {
//                            super.onScrollStateChanged(recyclerView, newState)
//                            isScrolling = true;
//                            Log.d(TAG, "onScrollStateChangeCalled")
//                        }
//
//                        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
//                            super.onScrolled(recyclerView, dx, dy)
//                            Log.d(TAG, "onScrolledCalled")
//                            visibleItemCount = linearLayoutManager.childCount
//                            Log.d(TAG, visibleItemCount.toString())
//                            totalItemCount = linearLayoutManager.itemCount
//                            Log.d(TAG, totalItemCount.toString())
//                            pastVisibleItems =
//                                linearLayoutManager.findFirstVisibleItemPosition()
//                            Log.d(TAG, pastVisibleItems.toString())
//                            if (isScrolling) {
//                                if (visibleItemCount + pastVisibleItems == totalItemCount) {
//                                    gettingDataFromInternet()
//                                    isScrolling = false
//                                }
//                            }
//                        }
//                    })
//                }
//            }
//
//            override fun onError(call: Call<*>?, t: Throwable?) {
//                Toast.makeText(
//                    this@MainActivity, "Some error occurred",
//                    Toast.LENGTH_SHORT
//                ).show()
//            }
//        })
//    }

    private fun bindViews() {
        recyclerViewList = findViewById(R.id.recyclerViewList)
        progressBar = findViewById(R.id.progressBar)
    }
}