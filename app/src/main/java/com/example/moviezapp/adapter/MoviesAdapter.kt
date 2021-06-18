package com.example.moviezapp.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.moviezapp.R
import com.example.moviezapp.Utils.Constants.Companion.IMAGE_API
import com.example.moviezapp.model.ResultModel
import com.example.moviezapp.view.MainActivity
import com.example.moviezapp.view.MovieDetailActivity
import java.util.*


class MoviesAdapter(private val context: Context
) :
    RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

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

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d(MainActivity.TAG, "OnBindViewHolder called")
        val data = differ.currentList[position]
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
                intent.putExtra("MovieId",data.id.toString())
                view?.context?.startActivity(intent)
            }
        })
    }

    private val differCallback: DiffUtil.ItemCallback<ResultModel> =
        object : DiffUtil.ItemCallback<ResultModel>() {
            override fun areItemsTheSame(
                oldItem: ResultModel,
                newItem: ResultModel
            ): Boolean {
                return newItem.id == oldItem.id
            }

            override fun areContentsTheSame(
                oldItem: ResultModel,
                newItem: ResultModel
            ): Boolean {
                return newItem.title == oldItem.title
            }

        }

    val differ = AsyncListDiffer(this, differCallback)

    override fun getItemCount() = differ.currentList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val movieTitle = itemView.findViewById<TextView>(R.id.movieTitleTextView)
        val movieImage = itemView.findViewById<ImageView>(R.id.movieImageView)
    }
}