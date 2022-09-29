package com.example.myapplication

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1=findViewById<EditText>(R.id.ed_num1)
        var num2 =findViewById<EditText>(R.id.ed_num2)
        var btn=findViewById<Button>(R.id.btn_submit)

        btn.setOnClickListener {
            var i=Intent(this,MainActivity2::class.java)
            i.putExtra("key1",num1.text.toString())
            startActivity(i)
        }
    }
}