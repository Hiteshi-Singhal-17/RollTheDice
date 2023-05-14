package com.example.rollthedice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    private lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Sets the content to view for user when activity is created
        setContentView(R.layout.activity_main)
        // Obtaining the reference of button
        val rollButton: Button = findViewById(R.id.roll_button)
        // Obtaining the reference of image view
        diceImage = findViewById(R.id.dice_image)
        // Setting the click listener on button that invokes rollDice()
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    /**
     * Displays the dice image from 1 to 6
     */
    private fun rollDice() {
        // Obtaining a random number from 1 to 6 and drawable id
        val drawableName = when (nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        // Setting the drawable to image view
        diceImage.setImageResource(drawableName)
    }
}