package com.example.wallify

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ScrolActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_scrol)

        val imageView11 = findViewById<ImageView>(R.id.imageView11)
        imageView11.setOnClickListener {
            // Navigate to UserProfileActivity
            val intent = Intent(this, CategoryActivity::class.java)
            startActivity(intent)
        }


        // Initialize the ImageView and set click listener
        val imageView = findViewById<ImageView>(R.id.imageView2)
        imageView.setOnClickListener {
            // Navigate to UserProfileActivity
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)
        }

        // Find buttons by their IDs
        val biologyButton = findViewById<Button>(R.id.bioButton)
        val combindButton = findViewById<Button>(R.id.comButton)
        val chemistryButton = findViewById<Button>(R.id.chemButton)
        val physicsButton = findViewById<Button>(R.id.phyButton)


        // Set click listeners for each button
        biologyButton.setOnClickListener {
            navigateToVideo("Biology")
        }
        combindButton.setOnClickListener {
            navigateToVideo("Movie")
        }
        chemistryButton.setOnClickListener {
            navigateToVideo("Cars")
        }
        physicsButton.setOnClickListener {
            navigateToVideo("Gaming")
        }

    }

    // Function to navigate to the WallpaperGridActivity with selected category
    private fun navigateToVideo(category: String) {
        val intent = Intent(this, VideoActivity::class.java)
        intent.putExtra("CATEGORY_NAME", category)
        startActivity(intent)
    }



}