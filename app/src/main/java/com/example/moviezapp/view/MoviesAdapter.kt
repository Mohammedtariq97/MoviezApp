package com.example.moviezapp.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.moviezapp.R
import com.example.moviezapp.model.ResultModel
import java.util.*


class MoviesAdapter(private val context: Context, private val list: ArrayList<ResultModel>) :
    RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {
    val IMAGE_API = "https://image.tmdb.org/t/p/w500/"


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.d(MainActivity.TAG, "OnCreateViewHolderCalled")
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.movies_list_layout,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d(MainActivity.TAG, "OnBindViewHolder called")
        val data = list[position]
        holder.movieTitle.text = data.title
        val movieImage = IMAGE_API + data.backdropPath
        Glide.with(context)
            .load(movieImage)
            .placeholder(R.drawable.placeholderimg)
            .apply(RequestOptions().fitCenter())
            .into(holder.movieImage)
        holder.movieImage.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent = Intent(context, MovieDetailActivity::class.java)
                val bundle = Bundle()
                bundle.putParcelable("movieDetailList", list.get(holder.adapterPosition))
                intent.putExtras(bundle)
                view?.context?.startActivity(intent)
            }
        })
    }

    override fun getItemCount(): Int {
        Log.d(MainActivity.TAG, "getItemCountcalled")
        return list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val movieTitle = itemView.findViewById<TextView>(R.id.movieTitleTextView)
        val movieImage = itemView.findViewById<ImageView>(R.id.movieImageView)
    }

    fun updateData(list: ArrayList<ResultModel>?) {
        list?.addAll(list)
        notifyDataSetChanged()
    }
}