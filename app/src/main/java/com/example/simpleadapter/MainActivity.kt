package com.example.simpleadapter

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.listView)

        val listproduit = listOf(
            mapOf("name" to "Produit A", "prix" to "10.00 DH"),
            mapOf("name" to "Produit B", "prix" to "20.00 DH"),
            mapOf("name" to "Produit C", "prix" to "15.50 DH"),
            mapOf("name" to "Produit D", "prix" to "30.00 DH"),
            mapOf("name" to "Produit E", "prix" to "50.00 DH")
        )

        val adapter = SimpleAdapter(
            this,
            listproduit,
            R.layout.liste_produit,
            arrayOf("nom", "prix"),
            intArrayOf(R.id.nomProduit, R.id.prixProduit)
        )

        listView.adapter = adapter
    }
}