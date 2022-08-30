package com.example.loginandsignup.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.loginandsignup.R

class SignUpActivity : AppCompatActivity() {
    lateinit var txtLogin:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        txtLogin=findViewById(R.id.textLogin)
        txtLogin.setOnClickListener{
            var i =Intent(this,LoginActivity::class.java)
            startActivity(i)
        }
    }
}