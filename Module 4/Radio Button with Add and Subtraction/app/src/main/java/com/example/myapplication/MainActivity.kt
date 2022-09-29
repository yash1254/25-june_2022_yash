package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var num1:EditText
    lateinit var num2:EditText
    lateinit var btn:Button
    lateinit var textView: TextView
    lateinit var total:String
    lateinit var radioGroup: RadioGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1=findViewById(R.id.ed_num1)
        num2=findViewById(R.id.ed_num2)
        btn=findViewById(R.id.btn)
        textView=findViewById(R.id.textview)

        radioGroup.setOnCheckedChangeListener { radioGroup, i ->

            if (i==R.id.add)
            {

            }
            if (i==R.id.subtraction)
            {

            }
            if (i==R.id.multiply)
            {

            }
            if (i==R.id.devision)
            {

            }

        }


        btn.setOnClickListener {

            Toast.makeText(this, "Total="+total, Toast.LENGTH_SHORT).show()
        }


    }
}