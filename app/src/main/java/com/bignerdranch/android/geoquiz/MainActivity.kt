package com.bignerdranch.android.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)


        //Challenge: make the toast display at the top of the screen instead of the bottom.
        //Use the Toast class's setGravity function.
        trueButton.setOnClickListener { view: View ->
            Toast.makeText(this, R.string.correct_toast,
                Toast.LENGTH_SHORT).apply{ setGravity(Gravity.TOP, 0, 0); show()}

        }
        falseButton.setOnClickListener { view: View ->
            Toast.makeText(this, R.string.incorrect_toast,
                Toast.LENGTH_SHORT).apply{ setGravity(Gravity.TOP, 0, 0); show()}
        }
    }
}