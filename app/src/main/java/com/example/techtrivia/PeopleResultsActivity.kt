package com.example.techtrivia

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_people_flag_results.*
import kotlinx.android.synthetic.main.activity_people_results.*

class PeopleResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_people_results)

        val peopleCorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS_PEOPLE, 0)

        if (peopleCorrectAnswers >= 2){
            setContentView(R.layout.activity_people_flag_results)
            tv_results_flag_people.text = "$peopleCorrectAnswers/3"
        } else {
            setContentView(R.layout.activity_people_results)
            tv_results_people.text = "$peopleCorrectAnswers/3"
        }

        val sharedPreferences = getSharedPreferences("sharedPref", Context.MODE_PRIVATE)

        //Highscores
        var highScorePeople: Int = sharedPreferences.getInt(Constants.HIGH_SCORE_PEOPLE, 0)
        if (peopleCorrectAnswers > highScorePeople) {

            val editor = sharedPreferences.edit()

            editor.apply {
                putInt(Constants.HIGH_SCORE_PEOPLE, peopleCorrectAnswers)
                apply()
            }
        }

        val btn_back = findViewById<Button>(R.id.btn_back)

        btn_back.setOnClickListener{
            val intent = Intent(this, CategoryActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}