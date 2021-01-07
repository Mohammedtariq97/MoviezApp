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
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(iso_3166_1)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ProductionCountries> {
        override fun createFromParcel(parcel: Parcel): ProductionCountries {
            return ProductionCountries(parcel)
        }

        override fun newArray(size: Int): Array<ProductionCountries?> {
            return arrayOfNulls(size)
        }
    }
}