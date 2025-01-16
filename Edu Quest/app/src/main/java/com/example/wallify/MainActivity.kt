package com.example.wallify

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeButton = findViewById<Button>(R.id.welcomeButton) // Update this with the actual button ID

        welcomeButton.setOnClickListener {
            val intent = Intent(this, OnboardActivity1::class.java)
            startActivity(intent)
        }
    }
}
