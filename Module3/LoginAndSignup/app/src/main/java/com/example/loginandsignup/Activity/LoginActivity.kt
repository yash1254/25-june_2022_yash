package com.example.loginandsignup.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.loginandsignup.R

class LoginActivity : AppCompatActivity() {

    lateinit var txtRgister:TextView
    lateinit var bntNext: Button
    lateinit var txtSkip:TextView
    lateinit var txtMobile: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        txtRgister=findViewById(R.id.tvRegister)
        txtMobile=findViewById(R.id.txt_mobileNumber)
        bntNext=findViewById(R.id.bntNext)
        txtRgister.setOnClickListener{

            var i=Intent(this,SignUpActivity::class.java)
            startActivity(i)
        }

        bntNext.setOnClickListener {
            if (txtMobile.text.toString().isEmpty()) {

                val builder = AlertDialog.Builder(this)
                builder.setTitle("FFI")
                builder.setMessage("Please Enter 10digit Mobile Number")

                builder.setPositiveButton("OK") { dialogInterface, which ->

                }

                val alertDialog: AlertDialog = builder.create()
                alertDialog.setCancelable(false)
                alertDialog.show()

            }

            ////////
            else{
                if (txtMobile.text.length ==10 ){//toString().trim { it <= ' ' }.matches(mobilepattern.toRegex())) {
                    Toast.makeText(this, "LOGIN SUCCSESFUL", Toast.LENGTH_SHORT).show()


                }

                else{
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("FFI")
                    builder.setMessage("Please Enter 10digit Mobile Number")
                    builder.setPositiveButton("OK"){dialogInterface, which ->
                        //    Toast.makeText(applicationContext,"clicked yes",Toast.LENGTH_LONG).show()
                    }

                    val alertDialog: AlertDialog = builder.create()
                    alertDialog.setCancelable(false)
                    alertDialog.show()
                }
            }




        }
    }
}