package com.example.moviezapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviezapp.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView

class LoginActivity : AppCompatActivity() {
    lateinit var signInButton:MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signInButton = findViewById(R.id.signinButton)

        signInButton.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}