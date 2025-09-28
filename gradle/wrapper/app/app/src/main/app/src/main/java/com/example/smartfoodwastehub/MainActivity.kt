package com.example.smartfoodwastehub

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var inputFood: EditText
    private lateinit var saveButton: Button
    private lateinit var resultText: TextView
    private val foodList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputFood = findViewById(R.id.inputFood)
        saveButton = findViewById(R.id.saveButton)
        resultText = findViewById(R.id.resultText)

        saveButton.setOnClickListener {
            val food = inputFood.text.toString()
            if (food.isNotEmpty()) {
                foodList.add(food)
                resultText.text = "Saved entries:\n" + foodList.joinToString("\n")
                inputFood.text.clear()
            }
        }
    }
}
