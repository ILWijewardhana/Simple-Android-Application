package com.example.wallify

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_settings) // Make sure you have a layout for this activity

        val imageView11 = findViewById<ImageView>(R.id.imageView11)
        imageView11.setOnClickListener {
            // Navigate to UserProfileActivity
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
