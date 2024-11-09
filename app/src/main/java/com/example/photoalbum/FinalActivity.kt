package com.example.photoalbum

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class FinalActivity : AppCompatActivity() {

    private lateinit var headingTV: TextView
    private lateinit var finalBTN: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_final)

        headingTV = findViewById(R.id.heading_thanksTV)
        finalBTN = findViewById(R.id.finalBTN)

        finalBTN.setOnClickListener {
            finishAffinity()
        }

    }
}