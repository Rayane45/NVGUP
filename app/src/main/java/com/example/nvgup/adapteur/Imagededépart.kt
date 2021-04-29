package com.example.nvgup.adapteur

import android.view.LayoutInflater
import  android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.nvgup.R

class Imagededépart : RecyclerView.Adapter<Imagededépart.ViewHolder>() {
    //boite de rangement de tout les composants à controler
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
    //image du muscle?
        val MusclImage = view.findViewById<ImageView>(R.id.image_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_horizontal_image, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {}

    override fun getItemCount(): Int = 5

}