package com.yair.api

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import com.squareup.picasso.Picasso
import com.yair.api.databinding.ItemRickandmortyBinding

class RickAndMortyViewHolder(view: View):
    RecyclerView.ViewHolder(view) {
    private val binding = ItemRickandmortyBinding.bind(view)
    fun bind(image:String){
        Picasso.get().load(image).into(binding.ivRickAndMorty)
    }
}