package com.example.firstquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast

class SecondList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_list)

        val mQuestionsList = Content.getQuestions()

        var option_one = findViewById<TextView>(R.id.option_one)
        var option_two = findViewById<TextView>(R.id.option_two)
        var option_three = findViewById<TextView>(R.id.option_three)
        var option_four = findViewById<TextView>(R.id.option_four)

    }
}

