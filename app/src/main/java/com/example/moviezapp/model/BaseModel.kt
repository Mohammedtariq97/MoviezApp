package com.example.moviezapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BaseModel(
    @SerializedName("page")
    @Expose
    val page: String,
    @SerializedName("total_pages")
    @Expose
    val totalPages: String,
    @SerializedName("total_results")
    @Expose
    val totalResults: String,
    @SerializedName("results")
    @Expose
    val results: List<ResultModel>
)