package com.example.restaurantslist

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.example.restaurantslist.databinding.ItemRestaurantBinding
import com.squareup.picasso.Picasso



class RestaurantAdapter(val restaurant:List<Restaurants>):RecyclerView.Adapter<RestaurantAdapter.RestaurantHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return RestaurantHolder(layoutInflater.inflate(R.layout.item_restaurant, parent, false))
    }

    override fun onBindViewHolder(holder: RestaurantHolder, position: Int) {
        holder.render(restaurant[position])
    }

    override fun getItemCount(): Int = restaurant.size

    class RestaurantHolder(val view:View):RecyclerView.ViewHolder(view){

        val binding = ItemRestaurantBinding.bind(view)

        fun render(restaurant: Restaurants){
            binding.tvCommercialName.text = restaurant.commercialName
            binding.tvEmail.text = restaurant.email
            binding.tvPhone.text = restaurant.phone
            binding.tvParkCommercialName.text = restaurant.park_commercialName
            Picasso.get().load(restaurant.image_url).into(binding.ivRestaurant)

            binding.root.setOnClickListener{ goDetails(restaurant)}
        }
        fun goDetails(restaurant: Restaurants){
            val intent = Intent(this.binding.root.context, RestaurantDetailActivity::class.java)
            intent.putExtra("INTENT_RESTAURANT", restaurant)


            startActivity(binding.root.context, intent, Bundle())
        }
    }

}