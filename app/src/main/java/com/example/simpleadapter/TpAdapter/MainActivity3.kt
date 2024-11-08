package com.example.simpleadapter.TpAdapter

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.simpleadapter.Adapter.LanguageAdapter
import com.example.simpleadapter.R

class MainActivity3 : AppCompatActivity() {

    private val languagesMap = hashMapOf(
        "Kotlin" to Triple("Kotlin", 2011, R.drawable.img),
        "Java" to Triple("Java", 1995, R.drawable.img_5),
        "Python" to Triple("Python", 1991, R.drawable.img_2),
        "JavaScript" to Triple("JavaScript", 1995, R.drawable.img_3)
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = LanguageAdapter(languagesMap)
    }
}