package com.example.badokan

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class FoodAdapter (private val listFood: ArrayList<Food>) : RecyclerView.Adapter<FoodAdapter.CardViewHolder>() {
    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgFood: ImageView = itemView.findViewById(R.id.img_food)
        var tvName: TextView = itemView.findViewById(R.id.tv_food_name)
        var tvLocation: TextView = itemView.findViewById(R.id.tv_food_location)
        var tvRating: TextView = itemView.findViewById(R.id.tv_food_rating)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodAdapter.CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodAdapter.CardViewHolder, position: Int) {
        val food = listFood[position]
        val context = holder.itemView.context as Activity
        Glide.with(context)
            .load(food.image)
            .apply(RequestOptions().override(450, 360))
            .into(holder.imgFood)

        holder.tvName.text = food.name
        holder.tvLocation.text = food.location
        holder.tvRating.text = food.rating.toString()

        holder.btnFavorite.setOnClickListener{ Toast.makeText(context, "Favorite " + listFood[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.itemView.setOnClickListener{
            val moveToFoodDetail = Intent(context, FoodDetail::class.java)
            moveToFoodDetail.putExtra(FoodDetail.EXTRA_POSITION, holder.adapterPosition)
            context.startActivity(moveToFoodDetail)
        }
    }

    override fun getItemCount(): Int {
        return listFood.size
    }
}