package com.example.androidpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NameAdapter(
    private val nameList: List<Name>,
    private val onItemClick: (Name) -> Unit
) : RecyclerView.Adapter<NameAdapter.NameViewHolder>() {

    inner class NameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewName: TextView = itemView.findViewById(R.id.textViewName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_name, parent, false)
        return NameViewHolder(view)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        val name = nameList[position]
        holder.textViewName.text = name.name
        holder.itemView.setOnClickListener { onItemClick(name) }
    }

    override fun getItemCount(): Int = nameList.size
}