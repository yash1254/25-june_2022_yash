package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var txt1=findViewById<TextView>(R.id.txt1)
        var txt2=findViewById<TextView>(R.id.txt2)

        var numb:String

        numb=intent.getStringExtra("key1")!!

        txt1.setText(numb)



    }
}