package com.example.app1try

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var jumlahlike = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val likeButton = findViewById<Button>(R.id.like)
        val dislikeButton = findViewById<Button>(R.id.dislike)
        val bilanganText = findViewById<TextView>(R.id.bilangan)

        likeButton.setOnClickListener {
            jumlahlike++
            bilanganText.text = jumlahlike.toString()
        }
        dislikeButton.setOnClickListener {
            jumlahlike--
            bilanganText.text = jumlahlike.toString()
        }
    }
}
