package com.example.androidpractice

import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.GridView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var gridView: GridView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_grid)

        gridView = findViewById(R.id.grid_view)
        val items = listOf(1, 2, 3, 4, 56, 7, 8, 8)

        val adapter = ArrayAdapter(
            this,
            R.layout.activity_main_linear,
            R.id.grid_view_item_trial,
            items
        )

        gridView.adapter = adapter
        gridView.setOnItemClickListener { _, _, pos, _ ->
            Toast.makeText(this, "${items[pos]} is clicked", Toast.LENGTH_SHORT).show()
        }
    }
}