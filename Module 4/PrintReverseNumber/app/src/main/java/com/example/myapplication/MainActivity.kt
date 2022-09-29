package com.example.myapplication

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var textView: TextView
    lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name=findViewById(R.id.name)
        textView=findViewById(R.id.textview)
        btn=findViewById(R.id.save)

        btn. setOnClickListener{
            val c = StringBuffer(name.getText().toString())
            textView.setText(c.reverse())
                    Toast.makeText(this@MainActivity, "Inserted", Toast.LENGTH_LONG).show()

        }

    }
}

//    charCountMap = HashMap()
//    findViewById<View>(R.id.save).setOnClickListener(object : OnClickListener() {
//        fun onClick(v: View?) {
//            if (!name.getText().toString().isEmpty()) {
//                val c = StringBuffer(name.getText().toString())
//                textview.setText(c.reverse())
//                Toast.makeText(this@MainActivity, "Inserted", Toast.LENGTH_LONG).show()
//            } else {
//                name.setError("Enter NAME")
//            }
//        }
//    })
