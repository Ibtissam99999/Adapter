package com.example.simpleadapter.TpAdapter


import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.simpleadapter.R

class MainActivity5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lvCountries = findViewById<ListView>(R.id.lvpayes)


        val data = listOf(
            mapOf("country" to "Palestine", "capital" to "Al-Qods", "continent" to "Asie"),
            mapOf("country" to "Albanie", "capital" to "Tirana", "continent" to "Europe"),
            mapOf("country" to "Afghanistan", "capital" to "Kaboul", "continent" to "Asie"),
            mapOf("country" to "Andorre", "capital" to "Andorre-la-Vieille", "continent" to "Europe"),
            mapOf("country" to "Angola", "capital" to "Luanda", "continent" to "Afrique"),
            mapOf("country" to "Argentine", "capital" to "Buenos Aires", "continent" to "Amérique")
        )

        val from = arrayOf("country", "capital", "continent")
        val to = intArrayOf(R.id.Npaye, R.id.capital, R.id.Continent)

        val adapter = SimpleAdapter(this, data, R.layout.liste_payes, from, to)
        lvCountries.adapter = adapter
    }
}
