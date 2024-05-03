package com.example.recyclerviewbinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewbinding.databinding.ItemBinding

class Adapter(val list: ArrayList<Info>) : RecyclerView.Adapter<Adapter.MyView>() {
    inner class MyView(val itemBinding: ItemBinding) : RecyclerView.ViewHolder(itemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyView(binding)
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        holder.itemBinding.imageView.setImageResource(list[position].image)
        holder.itemBinding.textView.text = list[position].name
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
