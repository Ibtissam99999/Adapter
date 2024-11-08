package com.example.simpleadapter.TpAdapter

import android.annotation.SuppressLint
import com.example.simpleadapter.R


import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lv = findViewById<ListView>(R.id.affichage)

        val data = listOf(
            mapOf("codep" to "Palestine", "mo" to "Pound", "codeiso" to "PP"),
            mapOf("codep" to "Afghanistan", "mo" to "Afghani", "codeiso" to "AFN"),
            mapOf("codep" to "Arabie Saoudite", "mo" to "Riyal saoudien", "codeiso" to "SAR"),
            mapOf("codep" to "Belgique", "mo" to "Euro", "codeiso" to "EUR"),
            mapOf("codep" to "Bénin", "mo" to "Franc CFA", "codeiso" to "XOF"),
            mapOf("codep" to "Brésil", "mo" to "Réal brésilien", "codeiso" to "BRL"),
            mapOf("codep" to "Côte d'Ivoire", "mo" to "Franc CFA", "codeiso" to "XOF")
        )

        val from = arrayOf("codep", "mo", "codeiso")
        val to = intArrayOf(R.id.codep, R.id.mo, R.id.codeiso)

        val adapter = SimpleAdapter(this, data, R.layout.liste_devise, from, to)
        lv.adapter = adapter
    }
}
