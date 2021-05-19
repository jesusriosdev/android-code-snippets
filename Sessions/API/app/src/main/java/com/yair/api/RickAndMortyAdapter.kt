package com.yair.api

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RickAndMortyAdapter(val images:List<String>):
    RecyclerView.Adapter<RickAndMortyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RickAndMortyViewHolder {
        val layoutInflater:LayoutInflater = LayoutInflater.from(parent.context)
        return RickAndMortyViewHolder(layoutInflater.inflate(R.layout.item_rickandmorty, parent, false))
    }

    override fun onBindViewHolder(holder: RickAndMortyViewHolder, position: Int) {
        val item = images[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = images.size


}