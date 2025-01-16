package com.example.wallify

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UserProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        val imageView15 = findViewById<ImageView>(R.id.imageView15)
        imageView15.setOnClickListener {
            // Navigate to UserProfileActivity
            val intent = Intent(this, CategoryActivity::class.java)
            startActivity(intent)
        }

        // Initialize views
        val profileImageView = findViewById<ImageView>(R.id.profileImageView)
        val imageView9 = findViewById<ImageView>(R.id.imageView3)
        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        val editProfileButton = findViewById<Button>(R.id.editProfileButton)
        val settingsButton = findViewById<Button>(R.id.settingsButton)
        val myWallsButton = findViewById<Button>(R.id.myWallsButton)

        // Set click listeners
        editProfileButton.setOnClickListener {
            // Navigate to edit profile activity
            startActivity(Intent(this, EditProfileActivity::class.java))
        }

        settingsButton.setOnClickListener {
            // Navigate to settings activity
            startActivity(Intent(this, SettingsActivity::class.java)) // Replace with your SettingsActivity
        }

        myWallsButton.setOnClickListener {
            // Navigate to My Walls activity
            startActivity(Intent(this, MyWallsActivity::class.java)) // Replace with your MyWallsActivity
        }
    }
}
