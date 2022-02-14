package com.icanerdogan.basicdatabinding.model

import android.widget.ImageView
import com.bumptech.glide.Glide

data class User(
    val name: String,
    val age: Int,
    val isActive: Boolean,
    val imageUrl: String
)
{
    fun formatAge() : String{
        return age.toString()
    }
    fun controlActive() : String{
        if (isActive == false){
            return "Not Active!"
        }
        else{
            return "Active!"
        }
    }

    fun setImageClick(imageView: ImageView){
        Glide.with(imageView)
            .load(imageUrl)
            .into(imageView)
    }
}