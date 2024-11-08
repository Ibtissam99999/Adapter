package com.example.simpleadapter.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.simpleadapter.R

class LanguageAdapter(private val languagesMap: Map<String, Triple<String, Int, Int>>) :
    RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>() {

    class LanguageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val icon: ImageView = view.findViewById(R.id.icon)
        val name: TextView = view.findViewById(R.id.NomLangage)
        val year: TextView = view.findViewById(R.id.AnneeLangage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_main3, parent, false)
        return LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        val entry = languagesMap.values.elementAt(position)
        holder.name.text = entry.first
        holder.year.text = "Année d'apparition: ${entry.second}"
        holder.icon.setImageResource(entry.third)
    }

    override fun getItemCount(): Int = languagesMap.size
}