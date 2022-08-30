package com.example.passdatabetweenactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var tvdata:TextView
    lateinit var nameGet:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tvdata=findViewById(R.id.tvData)

        nameGet=intent.getStringExtra("keyname")!!
        tvdata.setText(nameGet)
    }
}