package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logInButton.setOnClickListener {
            init()

        }

    }
    private fun init(){
        val email=emailEditText.text.toString()
        val password=passwordEditText.text.toString()
        if(email.isNotEmpty() && password.isNotEmpty()){
            Toast.makeText(this, "Successful login", Toast.LENGTH_SHORT).show()
            intent = Intent(this, profileActivity::class.java)
            startActivity(intent)
        }else{
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
        }
    }



        }





