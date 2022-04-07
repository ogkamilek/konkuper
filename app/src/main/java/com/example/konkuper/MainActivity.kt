package com.example.konkuper

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lewo = findViewById<Button>(R.id.button)
        val prawo = findViewById<Button>(R.id.button2)
        var x = 1;
        prawo.setOnClickListener {
            x++
            if (x > 4){
                x = 1
            }
            if (x == 1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.xayoo1)
            }
            if (x == 2) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.xayoo2)
            }
            if (x == 3) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.friz_jpg)
            }
            if (x == 4) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.marcysia)
            }
        }
        lewo.setOnClickListener {
            x--
            if (x < 1)
            {
                x = 4
            }
            if (x == 1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.xayoo1)
            }
            if (x == 2) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.xayoo2)
            }
            if (x == 3) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.friz_jpg)
            }
            if (x == 4) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.marcysia)
            }
        }
    }
}