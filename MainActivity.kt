package com.example.firstquiz

import android.appwidget.AppWidgetHost
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button_start)
        val wid = findViewById<AppCompatEditText>(R.id.w_name)
        btn.setOnClickListener {
            if (wid.text.toString().isEmpty()) {
                Toast.makeText(this@MainActivity, "Пожалуйста, введите Ваше имя", Toast.LENGTH_SHORT).show()
            } else {
                val start = Intent(this@MainActivity, SecondList::class.java)
                startActivity(start)
                finish()
            }
        }
    }
}