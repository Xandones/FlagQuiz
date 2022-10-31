package com.alexandrohlopes.flagquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btnStart)
        val etName : EditText = findViewById(R.id.etName)
        btnStart.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(this, "Please enter you name", Toast.LENGTH_LONG).show()
            }
            else {
                val intent = Intent(this, QuizQuestionsActivity::class.java) // This value allow us to move from this activity to a different one.
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
                finish() // Closes the app if the user click on "Back" button
            }
        }
    }
}