package com.example.restaurantslist

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Restaurants(var commercialName:String?,
                       var email:String?,
                       var phone:String?,
                       var park_commercialName:String?,
                       var image_url:String?) : Parcelable{

}