package com.asolis.kotlinmvvmdagger.data.models

import com.google.gson.annotations.SerializedName

data class Source(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("name")
    val name: String = "",
)
