package com.example.techtrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_people_question_three.*

class PeopleQuestionThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_people_question_three)

        val peopleQuestionsList = Constants.getPeopleQuestions()
        val questionNumber: Int = 3
        val question: Question = peopleQuestionsList[2]

        var peopleCorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS_PEOPLE,0)

        //Set UI elements
        tv3_question_people.text = question.question
        rb3_answer_one_people.text = question.optionOne
        rb3_answer_two_people.text = question.optionTwo
        rb3_answer_three_people.text = question.optionThree
        rb3_answer_four_people.text = question.optionFour
        pb3_progressBar_people.progress = questionNumber
        tv3_progress_people.text = "3" + "/" + peopleQuestionsList.size

        var answers: RadioButton

        btn3_next.setOnClickListener{
            var id: Int = rg3_options_people.checkedRadioButtonId

            if (id!=-1) {

                answers = findViewById(id)

                Toast.makeText(this, "Checked answer: ${answers.text}", Toast.LENGTH_SHORT).show()
                if (answers.text === question.optionTwo) {
                    peopleCorrectAnswers++
                }

                intent = Intent(this, PeopleResultsActivity::class.java)
                intent.putExtra(Constants.CORRECT_ANSWERS_PEOPLE, peopleCorrectAnswers)
                startActivity(intent)
                finish()

            } else {

                Toast.makeText(this, "Please select your answer!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}