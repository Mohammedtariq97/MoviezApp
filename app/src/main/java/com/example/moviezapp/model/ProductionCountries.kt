package com.example.moviezapp.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ProductionCountries(
    @SerializedName("iso_3166_1")
    @Expose
    val iso_3166_1: String,
    @SerializedName("name")
    @Expose
    val name: String
)