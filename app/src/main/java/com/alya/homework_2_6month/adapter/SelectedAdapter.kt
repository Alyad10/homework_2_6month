package com.alya.homework_2_6month.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alya.homework_2_6month.databinding.ItemImgSelectedBinding
import com.alya.homework_2_6month.loadImage
import com.alya.homework_2_6month.model.Gallery

class SelectedAdapter : RecyclerView.Adapter<SelectedAdapter.SelectViewHolder>() {
   
    private val listresult = arrayListOf<Gallery>()
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectViewHolder {
        return SelectViewHolder(ItemImgSelectedBinding.inflate(LayoutInflater.from(parent.context),parent,
            false))
    }

    override fun onBindViewHolder(holder: SelectViewHolder, position: Int) {
        holder.bind(listresult[position])
    }

    override fun getItemCount(): Int {
      return listresult.size
    }
    fun setImages(images : ArrayList<Gallery>){
        listresult.addAll(images)
        notifyDataSetChanged()
    }
    inner class SelectViewHolder(private val binding: ItemImgSelectedBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(gallery: Gallery) {
            binding.imgResult.loadImage(gallery.image)

        }

    }

}