package com.example.wallify

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class EditProfileActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val imageView16 = findViewById<ImageView>(R.id.imageView16)
        imageView16.setOnClickListener {
            // Navigate to UserProfileActivity
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)
        }


        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val saveButton = findViewById<Button>(R.id.saveButton)

        saveButton.setOnClickListener {
            // Get the new name and email values
            val newName = nameEditText.text.toString()
            val newEmail = emailEditText.text.toString()

            // Handle saving the data here
            // For example, update user data in a database or shared preferences

            // Navigate to UserProfileActivity
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)

            // Optionally, finish the current activity if you don't want the user to return here
            finish()
        }
    }
}
