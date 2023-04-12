package com.example.carepets_alpha.petlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.carepets_alpha.R
import com.example.carepets_alpha.database.Pet

class PetListAdapter(var listData: List<Pet>) : RecyclerView.Adapter<PetListAdapter.ViewHolder>() {
    class ViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById(R.id.pet_image)
        val name: TextView = itemView.findViewById(R.id.pet_name)
        val species: TextView = itemView.findViewById(R.id.pet_species)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.pet_line, parent, false)
        return ViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item = listData[position]
        holder.img.setImageResource(item.img)
        holder.name.text = item.name
        holder.species.text = item.species
    }

}