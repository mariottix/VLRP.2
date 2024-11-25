package com.example.receitas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class feed_receitas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed_receitas)

        val myList = listOf(Recipe("Carlos Eduardo", R.drawable.usuario, "Massa com Camarão", R.drawable.camarao ),
        Recipe("Gabriela Martins", R.drawable.usuario, "Poke rápido e fácil", R.drawable.poke))

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(myList)



        }


    }

