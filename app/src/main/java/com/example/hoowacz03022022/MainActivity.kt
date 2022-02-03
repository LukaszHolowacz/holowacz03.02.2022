package com.example.hoowacz03022022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun setupAutoCompleteTextView() {
        val button = findViewById<Button>(R.id.wyslij)
        val textInput = findViewById<AutoCompleteTextView>(R.id.act)
        val countries = resources.getStringArray(R.array.countries_array)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countries)
        button.setOnClickListener { textInput.setAdapter(adapter) }

        button.setOnClickListener {
            val enteredText = getString(R.string.entered_text) + " " + textInput.text
            Toast.makeText(this@MainActivity, enteredText, Toast.LENGTH_SHORT).show()

        }
    }
}