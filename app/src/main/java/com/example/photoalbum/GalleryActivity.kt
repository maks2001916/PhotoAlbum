package com.example.photoalbum

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GalleryActivity : AppCompatActivity() {

    private lateinit var imageViewIV: ImageView
    private lateinit var nextBTN: Button
    private var imageCount = 1

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_gallery)

        imageViewIV = findViewById(R.id.imageIV)
        nextBTN = findViewById(R.id.nextBTN)

        imageViewIV.clipToOutline = true
        nextBTN.setOnClickListener {
            setImage()
            imageCount++
        }

    }

    fun setImage() {
        when (imageCount) {
            1 -> imageViewIV.setImageResource(R.drawable.image2)
            2 -> imageViewIV.setImageResource(R.drawable.image3)
            3 -> imageViewIV.setImageResource(R.drawable.image4)
            4 -> imageViewIV.setImageResource(R.drawable.image5)
            5 -> {
                val finalIntent = Intent(this, FinalActivity::class.java)
                startActivity(finalIntent)
            }
        }
    }
}