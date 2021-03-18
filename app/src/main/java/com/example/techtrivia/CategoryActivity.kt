package com.example.techtrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_category.*

class CategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //Get the UI element
        val tv_greeting = findViewById<TextView>(R.id.tv_greeting)

        //Get intent extra info
        val userName = intent.getStringExtra(EXTRA_MESSAGE)

        //Get Questions
//        val questionsList = Constants.getQuestions()
//        Log.i("QuestionsList: ", "${questionsList.size}")

        //Set TextView to userName
        tv_greeting.text = "Hello " + userName

        // PEOPLE
        btn_people_category.setOnClickListener{
            val intent = Intent(this, PeopleQuestionOneActivity::class.java)
            startActivity(intent)
        }

        // TERMS
        btn_terms_category.setOnClickListener{
            val intent = Intent(this, TermsQuestionOneActivity::class.java)
            startActivity(intent)
        }

        // DEVICES
        btn_device_category.setOnClickListener{
            val intent = Intent(this, DeviceQuestionOneActivity::class.java)
            startActivity(intent)
        }
    }
}