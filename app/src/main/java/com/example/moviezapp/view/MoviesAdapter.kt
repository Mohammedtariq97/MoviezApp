package com.example.moviezapp.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.moviezapp.R
import com.example.moviezapp.model.ResultModel

class MoviesAdapter(private val context: Context, private val list: List<ResultModel>) :
    RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {
    val IMAGE_API = "https://image.tmdb.org/t/p/w500/"
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.movies_list_layout,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]
        holder.movieTitle.text = data.title
        val movieImage = IMAGE_API + data.backdropPath
        Glide.with(context)
            .load(movieImage)
            .placeholder(R.drawable.placeholderimg)
            .apply(RequestOptions().fitCenter())
            .into(holder.movieImage)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val movieTitle = itemView.findViewById<TextView>(R.id.movieTitleTextView)
        val movieImage = itemView.findViewById<ImageView>(R.id.movieImageView)
    }
}