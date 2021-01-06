package com.example.moviezapp.api

import android.app.Activity
import com.example.moviezapp.model.BaseModel
import com.example.moviezapp.network.NetworkClient
import com.example.moviezapp.network.RetrofitEventListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class APIUserRestClient : Activity() {
    companion object {
        val instance = APIUserRestClient()
    }
    val API_KEY = "0e12101a22c608993caa890e9dabea92"
    var mApiUser: APIUser? = null

//    https://api.themoviedb.org/3/discover/movie?api_key=0e12101a22c608993caa890e9dabea92
    fun getMoviesList(page:Int,retrofitEventListener: RetrofitEventListener) {
        val retrofit = NetworkClient.retrofitClient
        mApiUser = retrofit.create<APIUser>(APIUser::class.java)
        val apiUserCall = mApiUser?.getMovieResults(API_KEY,page)

        apiUserCall?.enqueue(object : Callback<BaseModel> {
            override fun onResponse(call: Call<BaseModel>?, response: Response<BaseModel>?) {
                if (response?.body() != null) {
                    retrofitEventListener.onSuccess(call, response?.body())
                }
            }

            override fun onFailure(call: Call<BaseModel>?, t: Throwable?) {

                retrofitEventListener.onError(call, t)
            }
        })
    }
}