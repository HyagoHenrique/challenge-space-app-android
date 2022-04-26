package com.devpass.spaceapp.rocketDetails

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class RocketDetail (
    val name: String,
    @SerializedName("flickr_images")
    val images: ArrayList<String>,
    val description: String,
    val id: String
): Parcelable