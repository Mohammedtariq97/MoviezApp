package com.example.moviezapp.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.ArrayList

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
    val results: ArrayList<ResultModel>
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.createTypedArrayList(ResultModel) as ArrayList<ResultModel>
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(page)
        parcel.writeString(totalPages)
        parcel.writeString(totalResults)
        parcel.writeTypedList(results)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<BaseModel> {
        override fun createFromParcel(parcel: Parcel): BaseModel {
            return BaseModel(parcel)
        }

        override fun newArray(size: Int): Array<BaseModel?> {
            return arrayOfNulls(size)
        }
    }
}