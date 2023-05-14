package com.example.rollthedice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    /**
     * Displays the number from 1 to 6
     */
    private fun rollDice() {
        // Obtaining the reference of text view
        val resultText: TextView = findViewById(R.id.result_text)
        // Obtaining a number from 1 to 6
        val randomNumber = nextInt(6) + 1
        // Setting the text of text view between 1 to 6
        resultText.text = randomNumber.toString()
    }
}