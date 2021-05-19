package com.example.restaurantslist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.example.restaurantslist.databinding.ActivityMainBinding
import com.example.restaurantslist.databinding.ActivityRestaurantDetailBinding
import com.squareup.picasso.Picasso

class RestaurantDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRestaurantDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRestaurantDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionbar = supportActionBar
        actionbar!!.title =""
        actionbar.setDisplayHomeAsUpEnabled(true)

        render()
    }

    fun render(){
        val restaurant = intent.getParcelableExtra("INTENT_RESTAURANT") as? Restaurants

        binding.tvCommercialName.text = restaurant?.commercialName
        binding.tvEmail.text = restaurant?.email
        binding.tvPhone.text = restaurant?.phone
        binding.tvParkCommercialName.text = restaurant?.park_commercialName

        Picasso.get().load(restaurant?.image_url).into(binding.ivRestaurant)

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}