package com.example.wallify

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            // Handle login logic here (e.g., validate credentials)
            navigateToCategoryPage()
        }

        val signUpLink = findViewById<TextView>(R.id.signUpLink)
        signUpLink.setOnClickListener {
            // Navigate to SignUpActivity
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }

    private fun navigateToCategoryPage() {
        val intent = Intent(this, CategoryActivity::class.java)
        startActivity(intent)
        finish() // Optionally finish the current activity
    }
}
