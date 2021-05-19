package com.example.restaurantslist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.restaurantslist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val restaurants = listOf(
        Restaurants("Restaurante1", "restaurant@gmail.com", "451-45-44", "Novena", "https://media-cdn.tripadvisor.com/media/photo-s/16/d3/35/34/cuatro-restaurante.jpg"),
        Restaurants("Restaurante2", "restaurant2@gmail.com", "451-45-44", "Novena", "https://media-cdn.tripadvisor.com/media/photo-s/16/d3/35/34/cuatro-restaurante.jpg"),
        Restaurants("Restaurante2", "restaurant2@gmail.com", "451-45-44", "Novena", "https://media-cdn.tripadvisor.com/media/photo-s/16/d3/35/34/cuatro-restaurante.jpg"),
        Restaurants("Restaurante2", "restaurant2@gmail.com", "451-45-44", "Novena", "https://media-cdn.tripadvisor.com/media/photo-s/16/d3/35/34/cuatro-restaurante.jpg"),
        Restaurants("Restaurante2", "restaurant2@gmail.com", "451-45-44", "Novena", "https://media-cdn.tripadvisor.com/media/photo-s/16/d3/35/34/cuatro-restaurante.jpg"),
        Restaurants("Restaurante2", "restaurant2@gmail.com", "451-45-44", "Novena", "https://media-cdn.tripadvisor.com/media/photo-s/16/d3/35/34/cuatro-restaurante.jpg")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecycler()
    }

    fun initRecycler(){
        binding.rvRestaurantsList.layoutManager = LinearLayoutManager(this)
        val adapter = RestaurantAdapter(restaurants)
        binding.rvRestaurantsList.adapter = adapter

    }

}