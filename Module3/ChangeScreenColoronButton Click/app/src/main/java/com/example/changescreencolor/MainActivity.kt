package com.example.changescreencolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    lateinit var lyMain:LinearLayout
    lateinit var btnRed:AppCompatButton
    lateinit var btnGreen:AppCompatButton
    lateinit var btnBlue:AppCompatButton
    lateinit var btnReset:AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lyMain=findViewById(R.id.lyMain)
        btnRed=findViewById(R.id.btnRed)
        btnGreen=findViewById(R.id.btnGreen)
        btnBlue=findViewById(R.id.btnBlue)
        btnReset=findViewById(R.id.btnReset)

        btnRed.setOnClickListener {

            lyMain.setBackgroundColor(resources.getColor(R.color.red))
        }
        btnGreen.setOnClickListener {

            lyMain.setBackgroundColor(resources.getColor(R.color.green))
        }
        btnBlue.setOnClickListener {

            lyMain.setBackgroundColor(resources.getColor(R.color.blue))
        }
        btnReset.setOnClickListener {
            lyMain.setBackgroundColor(resources.getColor(R.color.pink))
        }
    }
}