package com.example.moviezapp.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SpokenLanguageModel(
    @SerializedName("english_name")
    @Expose
    val englishName: String,
    @SerializedName("iso_639_1")
    @Expose
    val iso6391: String,
    @SerializedName("name")
    @Expose
    val name: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(englishName)
        parcel.writeString(iso6391)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SpokenLanguageModel> {
        override fun createFromParcel(parcel: Parcel): SpokenLanguageModel {
            return SpokenLanguageModel(parcel)
        }

        override fun newArray(size: Int): Array<SpokenLanguageModel?> {
            return arrayOfNulls(size)
        }
    }
}