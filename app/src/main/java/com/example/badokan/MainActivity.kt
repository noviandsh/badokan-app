package com.example.badokan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvFoods: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val aboutBtn: Button = findViewById(R.id.btn_about)

        aboutBtn.setOnClickListener{
            val moveToAbout = Intent(this@MainActivity, About::class.java)
            startActivity(moveToAbout)
        }

        rvFoods = findViewById(R.id.rv_foods)
        rvFoods.setHasFixedSize(true)

        list.addAll(FoodsData.listData)
        showRecyclerFoodList()
    }

    private fun showRecyclerFoodList() {
        rvFoods.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = FoodAdapter(list)
        rvFoods.adapter = listFoodAdapter
    }
}