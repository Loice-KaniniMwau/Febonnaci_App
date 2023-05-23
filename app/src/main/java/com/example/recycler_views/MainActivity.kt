package com.example.recycler_views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    lateinit var rvNames:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        rvNames=findViewById(R.id.rvNames)
//        var names= listOf("loice","mary","Aluel","Rebecca","jecinta","wambui","faith","owen","mideva","Jessy")
        val namesAdapter=NamesRvAdapter(numbersList = listOf(1,2,3,4,6,7,8,89,9,))
        rvNames.layoutManager=LinearLayoutManager(this)
        rvNames.adapter=namesAdapter
    }
}