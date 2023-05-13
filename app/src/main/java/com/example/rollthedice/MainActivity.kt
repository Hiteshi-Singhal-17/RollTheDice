package com.example.rollthedice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        /*
        Toast.makeText() is a method in Android that creates and displays a simple message on the
        screen for a short duration. It is typically used to show a brief notification to the user,
        such as a confirmation message or an error message.

        The makeText() method is a static factory method of the Toast class, which means
        we can call it without creating an instance of the Toast class.
        It takes three parameters

        The show() method is called at the end to actually show the message.

        The context object allows to communicate with and get information about current state of
        Android OS.
         */
        rollButton.setOnClickListener {
            Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
        }
    }
}