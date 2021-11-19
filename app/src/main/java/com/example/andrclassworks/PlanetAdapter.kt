package com.example.andrclassworks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.andrclassworks.databinding.PlanetItemBinding

class PlanetAdapter : RecyclerView.Adapter<PlanetAdapter.PlanetHolder>() {

    val planetList = ArrayList<Planet>()

    class PlanetHolder(item: View) : RecyclerView.ViewHolder(item) {

        val binding = PlanetItemBinding.bind(item)
        fun bind(planet: Planet) = binding.apply {
            img1.setImageResource(planet.imageId)
            txt1.text = planet.title

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.planet_item, parent, false)
        return PlanetHolder(view)
    }

    override fun onBindViewHolder(holder: PlanetHolder, position: Int) {
        holder.bind(planetList[position])
    }

    override fun getItemCount(): Int {
        return planetList.size
    }

    fun addPlanet(planet: Planet){
        planetList.add(planet)
        notifyDataSetChanged()
    }



}












