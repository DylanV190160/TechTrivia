package com.example.techtrivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.widget.TextView

class CategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        //Get the UI element
        val tv_greeting = findViewById<TextView>(R.id.tv_greeting)

        //Get intent extra info
        val userName = intent.getStringExtra(EXTRA_MESSAGE)

        //Get Questions
        val questionsList = Constants.getQuestions()
        Log.i("QuestionsList: ", "${questionsList.size}")

        //Set TextView to userName
        tv_greeting.text = "Hello " + userName + ", There is a total of ${questionsList.size} questions for you to answer."
    }
}