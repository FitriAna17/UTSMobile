package com.example.utsmobile

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class hewan (
    val imghewan: Int,
    val namehewan: String,
    val deschewan: String
    ) : Parcelable