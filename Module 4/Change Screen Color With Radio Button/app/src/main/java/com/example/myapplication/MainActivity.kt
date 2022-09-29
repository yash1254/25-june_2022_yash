package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rg=findViewById<RadioGroup>(R.id.rg)
        var lyMain=findViewById<LinearLayout>(R.id.ly_main)

        rg.setOnCheckedChangeListener { radioGroup, i ->

            if (i==R.id.rb_red){
                lyMain.setBackgroundColor(Color.RED)
            }
            if (i==R.id.rb_green){
                lyMain.setBackgroundColor(Color.GREEN)

            }
            if (i==R.id.rb_blue){
                lyMain.setBackgroundColor(Color.BLUE)
            }
        }



    }
}