package com.example.moviezapp.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

data class MovieDescriptionModel(
    @SerializedName("adult")
    @Expose
    val adult: Boolean,
    @SerializedName("backdrop_path")
    @Expose
    val backdropPath: String,
    @SerializedName("belongs_to_collection")
    @Expose
    val belongsToCollection: Objects,
    @SerializedName("budget")
    @Expose
    val budget: Int,
    @SerializedName("genres")
    @Expose
    val genres: List<GenreModel>,
    @SerializedName("homepage")
    @Expose
    val homepage: String,
    @SerializedName("id")
    @Expose
    val String: Int,
    @SerializedName("imdb_id")
    @Expose
    val imdbId: String,
    @SerializedName("original_language")
    @Expose
    val originalLanguage: String,
    @SerializedName("original_title")
    @Expose
    val originalTitle: String,
    @SerializedName("overview")
    @Expose
    val overview: String,
    @SerializedName("popularity")
    @Expose
    val popularity: Double,
    @SerializedName("poster_path")
    @Expose
    val posterPath: String,
    @SerializedName("production_companies")
    @Expose
    val productionCompanies: List<ProductionCompanies>,
    @SerializedName("production_countries")
    @Expose
    val production_countries: List<ProductionCountries>,
    @SerializedName("release_date")
    @Expose
    val releaseDate: String,
    @SerializedName("revenue")
    @Expose
    val revenue: Int,
    @SerializedName("runtime")
    @Expose
    val runtime: Int,
    @SerializedName("spoken_languages")
    @Expose
    val spokenLanguages: List<SpokenLanguageModel>,
    @SerializedName("status")
    @Expose
    val status: String,
    @SerializedName("tagline")
    @Expose
    val tagline: String,
    @SerializedName("title")
    @Expose
    val title: String,
    @SerializedName("video")
    @Expose
    val video: Boolean,
    @SerializedName("vote_average")
    @Expose
    val voteAverage: Double,
    @SerializedName("vote_count")
    @Expose
    val vote_count: Int
)
