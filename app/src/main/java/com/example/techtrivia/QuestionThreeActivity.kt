package com.example.techtrivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log

class QuestionThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_three)

        //Get intent extra info
        val userName = intent.getStringExtra(AlarmClock.EXTRA_MESSAGE)

        //Get Questions
        val questionsList = Constants.getQuestions()
        Log.i("QuestionsList: ", "${questionsList.size}")
    }
}