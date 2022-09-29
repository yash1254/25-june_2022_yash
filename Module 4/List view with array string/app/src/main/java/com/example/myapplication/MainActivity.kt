package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var lv:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lv =findViewById(R.id.lvdata)

        lv.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(StaticListView@this, ""+lv.getItemAtPosition(i), Toast.LENGTH_SHORT).show()
        }

    }
}