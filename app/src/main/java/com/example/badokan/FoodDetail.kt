package com.example.badokan

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class FoodDetail : AppCompatActivity() {
    private var listFood: ArrayList<Food> = arrayListOf()
    companion object {
        const val EXTRA_POSITION = "extra_position"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)
        val backBtn: Button = findViewById(R.id.btn_back_detail)
        val aboutBtn: Button = findViewById(R.id.btn_about_detail)

        val foodName: TextView = findViewById(R.id.tv_food_name_detail)
        val foodLocation: TextView = findViewById(R.id.tv_food_location_detail)
        val foodRating: TextView = findViewById(R.id.tv_food_rating_detail)
        val foodImage: ImageView = findViewById(R.id.img_food_detail)
        val foodDescription: TextView = findViewById(R.id.tv_food_description)
        val foodSource: TextView = findViewById(R.id.tv_food_source)

        val foodIndex = intent.getIntExtra(EXTRA_POSITION, 0)
        listFood.addAll(FoodsData.listData)

        val food = listFood[foodIndex]

        Glide.with(this)
            .load(food.image)
            .apply(RequestOptions().override(450, 360))
            .into(foodImage)

        foodName.text = food.name
        foodLocation.text = food.location
        foodRating.text = food.rating.toString()
        foodDescription.text = food.description
        foodSource.text = "Sumber: ${food.source}"
        foodSource.movementMethod = LinkMovementMethod.getInstance()

        aboutBtn.setOnClickListener{
            val moveToAbout = Intent(this@FoodDetail, About::class.java)
            startActivity(moveToAbout)
        }
        backBtn.setOnClickListener{
            finish()
        }
    }
}