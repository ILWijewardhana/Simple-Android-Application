package com.example.wallify

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CategoryActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        // Initialize the ImageView and set click listener
        val imageView = findViewById<ImageView>(R.id.imageView2)
        imageView.setOnClickListener {
            // Navigate to UserProfileActivity
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)
        }

        val imageView11 = findViewById<ImageView>(R.id.imageView11)
        imageView11.setOnClickListener {
            // Navigate to UserProfileActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        // Find buttons by their IDs
        val techButton = findViewById<Button>(R.id.techCategory)
        val movieButton = findViewById<Button>(R.id.movieCategory)
        val carsButton = findViewById<Button>(R.id.carsCategory)
        val gamingButton = findViewById<Button>(R.id.gamingCategory)


        // Set click listeners for each button
        techButton.setOnClickListener {
            navigateToScrol("Tech")
        }
        movieButton.setOnClickListener {
            navigateToScrol("Movie")
        }
        carsButton.setOnClickListener {
            navigateToScrol("Cars")
        }
        gamingButton.setOnClickListener {
            navigateToScrol("Gaming")
        }

    }

    // Function to navigate to the WallpaperGridActivity with selected category
    private fun navigateToScrol(category: String) {
        val intent = Intent(this, ScrolActivity::class.java)
        intent.putExtra("CATEGORY_NAME", category)
        startActivity(intent)
    }
}
