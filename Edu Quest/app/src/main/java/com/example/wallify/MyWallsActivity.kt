package com.example.wallify

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MyWallsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_walls) // Make sure you have a layout for this activity

        val imageView9 = findViewById<ImageView>(R.id.imageView9)
        imageView9.setOnClickListener {
            // Navigate to UserProfileActivity
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)
        }
    }

}
