package com.example.littlelemon

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var toplayout : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toplayout = findViewById(R.id.toplayout)

        toplayout.setBackgroundColor(Color.parseColor("#495E57"))
        var textView = TextView(this)
        textView.text= resources.getText(R.string.little_lemon)

        textView.setTextColor(Color.parseColor("#F4CE14"))



        toplayout.addView(textView)
    }
}