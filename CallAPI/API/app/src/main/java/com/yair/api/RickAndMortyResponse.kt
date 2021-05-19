package com.yair.api

import com.google.gson.annotations.SerializedName

data class RickAndMortyResponse(
    @SerializedName("status") var status:String,
    @SerializedName("message")var images:List<String>
    )
