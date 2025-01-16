package com.example.wallify

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val signUpButton = findViewById<Button>(R.id.signUpButton)
        signUpButton.setOnClickListener {
            // Handle sign-up logic here (e.g., save user info)
            navigateToCategoryPage()
        }

        val imageView11 = findViewById<ImageView>(R.id.imageView11)
        imageView11.setOnClickListener {
            // Navigate to UserProfileActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun navigateToCategoryPage() {
        val intent = Intent(this, CategoryActivity::class.java)
        startActivity(intent)
        finish() // Optionally finish the current activity
    }
}
