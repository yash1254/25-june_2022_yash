package com.example.passdatabetweenactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var edData:EditText
    lateinit var btnSubmit:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edData=findViewById(R.id.edEnterYourName)
        btnSubmit=findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener {

            var i=Intent(this,MainActivity2::class.java)
            i.putExtra("keyname",edData.text.toString())

        }

    }
}