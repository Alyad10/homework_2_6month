package com.alya.homework_2_6month
import android.widget.ImageView
import com.alya.homework_2_6month.model.Gallery
import com.bumptech.glide.Glide

fun ImageView.loadImage(url: String){
    Glide.with(this.context).load(url).into(this)
}