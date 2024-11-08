package com.example.simpleadapter.TpAdapter

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.simpleadapter.R

class MainActivity2 : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val listView: ListView = findViewById(R.id.listView)

            val languages = listOf("Java", "C#", "Python", "Kotlin", "Swift", "JavaScript", "C++")

            // Question 1
             val adapter1 = ArrayAdapter(this, android.R.layout.simple_list_item_1, languages)
             listView.adapter = adapter1

            // Question 2

             val adapter2 = ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, languages)
             listView.adapter = adapter2
             listView.choiceMode = ListView.CHOICE_MODE_SINGLE

            // Question 3
            val adapter3 = ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, languages)
            listView.adapter = adapter3
            listView.choiceMode = ListView.CHOICE_MODE_MULTIPLE
        }
    }
