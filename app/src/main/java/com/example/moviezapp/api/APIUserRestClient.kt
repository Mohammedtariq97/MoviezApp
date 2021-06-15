package com.example.moviezapp.api

import android.app.Activity
import android.util.Log
import com.example.moviezapp.model.BaseModel
import com.example.moviezapp.model.MovieDescriptionModel
import com.example.moviezapp.network.Retrofit
import com.example.moviezapp.network.RetrofitEventListener
import com.example.moviezapp.view.MainActivity.Companion.TAG
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class APIUserRestClient : Activity() {
//    companion object {
//        val instance = APIUserRestClient()
//    }
//
//
//    var mApiUser: APIUser? = null
//
//    //    https://api.themoviedb.org/3/discover/movie?api_key=0e12101a22c608993caa890e9dabea92
//    fun getMoviesList(page: Int, retrofitEventListener: RetrofitEventListener) {
//        val retrofit = Retrofit.retrofitClient
//        mApiUser = retrofit.create<APIUser>(APIUser::class.java)
//        Log.d(TAG, "getMoviesList page $page is called")
//        val apiUserCall = mApiUser?.getMovieResults(API_KEY, page)
//
//        apiUserCall?.enqueue(object : Callback<BaseModel> {
//            override fun onResponse(call: Call<BaseModel>?, response: Response<BaseModel>?) {
//                if (response?.body() != null) {
//                    retrofitEventListener.onSuccess(call, response?.body())
//                }
//            }
//
//            override fun onFailure(call: Call<BaseModel>?, t: Throwable?) {
//
//                retrofitEventListener.onError(call, t)
//            }
//        })
//    }
//
//    fun getMovieDescriptionList(movieId: String, retrofitEventListener: RetrofitEventListener) {
//        val retrofit = Retrofit.retrofitClient
//        mApiUser = retrofit.create<APIUser>(APIUser::class.java)
//        Log.d(TAG, "getMovieDetail $movieId is called")
//        val apiUserCall = mApiUser?.getMovieResult(movieId, API_KEY)
//
//        apiUserCall?.enqueue(object : Callback<MovieDescriptionModel> {
//            override fun onResponse(
//                call: Call<MovieDescriptionModel>?,
//                response: Response<MovieDescriptionModel>?
//            ) {
//                if (response?.body() != null) {
//                    retrofitEventListener.onSuccess(call, response?.body())
//                }
//            }
//
//            override fun onFailure(call: Call<MovieDescriptionModel>?, t: Throwable?) {
//
//                retrofitEventListener.onError(call, t)
//            }
//        })
//    }
}