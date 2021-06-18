package com.example.moviezapp.view

import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviezapp.R
import com.example.moviezapp.adapter.MoviesAdapter
import com.example.moviezapp.model.ResultModel
import com.example.moviezapp.repository.MoviesRepository
import com.example.moviezapp.viewmodel.MainActivityViewModel
import com.example.moviezapp.viewmodel.MainActivityViewModelFactory
import java.util.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MainActivity"
    }

    lateinit var recyclerViewList: RecyclerView
    lateinit var progressBar: ProgressBar
    var page = 1
    lateinit var linearLayoutManager: LinearLayoutManager
    var movieList = ArrayList<ResultModel>()
    var pastVisibleItems = 0
    var visibleItemCount = 0
    var totalItemCount = 0
    var isScrolling: Boolean = false
    lateinit var mainActivityViewModel: MainActivityViewModel
    lateinit var adapter: MoviesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val repository= MoviesRepository()
        mainActivityViewModel = ViewModelProvider(this,MainActivityViewModelFactory(repository))
                .get(MainActivityViewModel::class.java)
        bindViews()
        setRecyclerView()
        getMovieList()
    }

    private fun getMovieList() {
        mainActivityViewModel.getMovieList()
        mainActivityViewModel.moviesDataList.observe(this, androidx.lifecycle.Observer {
            Log.d(TAG,it.results.toString())
            adapter.differ.submitList(it.results)
        })
    }

    private fun setRecyclerView() {
        linearLayoutManager = LinearLayoutManager(this)
        adapter = MoviesAdapter(applicationContext)
        linearLayoutManager.orientation = RecyclerView.VERTICAL
        recyclerViewList.layoutManager = linearLayoutManager
        recyclerViewList.adapter = adapter
        recyclerViewList.addOnScrollListener(scrollListener)

    }

    private val scrollListener : RecyclerView.OnScrollListener = object : RecyclerView.OnScrollListener() {

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
                    getMovieList()
                    isScrolling = false
                }
            }
        }
    }

    private fun bindViews() {
        recyclerViewList = findViewById(R.id.recyclerViewList)
        progressBar = findViewById(R.id.progressBar)
    }
}