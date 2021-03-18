package com.example.techtrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_people_question_one.*
import kotlinx.android.synthetic.main.activity_people_question_three.*
import kotlinx.android.synthetic.main.activity_people_question_two.*

class PeopleQuestionThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_people_question_three)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringExtra(Constants.USER_NAME)
        val peopleQuestionsList = Constants.getPeopleQuestions()
        val peopleQuestion = peopleQuestionsList[2]

        val questionNumber: Int = 3
        peopleQuestionsList[questionNumber-1]

        //Set UI elements
        tv3_question_people.text = peopleQuestion.question
        rb3_answer_one_people.text = peopleQuestion.optionOne
        rb3_answer_two_people.text = peopleQuestion.optionTwo
        rb3_answer_three_people.text = peopleQuestion.optionThree
        rb3_answer_four_people.text = peopleQuestion.optionFour
        pb3_progressBar_people.progress = questionNumber
        tv3_progress_people.text = questionNumber.toString() + "/" + peopleQuestionsList.size.toString()

        var answers: RadioButton
        var correctAnswersPeople: Int = 0

        btn3_next.setOnClickListener{
            var id: Int = rg3_options_people.checkedRadioButtonId

            if (id != -1) {

                answers = findViewById(id)

                Toast.makeText(this, "Checked answer: ${answers.text}", Toast.LENGTH_SHORT).show()

                if (answers.text == peopleQuestion.optionTwo) {
                    correctAnswersPeople++
                }

                val intent = Intent(this, ResultsActivity::class.java)
                intent.putExtra(Constants.CORRECT_ANSWERS_PEOPLE, correctAnswersPeople)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Please select your answer!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}