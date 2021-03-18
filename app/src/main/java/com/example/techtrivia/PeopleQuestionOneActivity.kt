package com.example.techtrivia

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_people_question_one.*

class PeopleQuestionOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_people_question_one)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringExtra(Constants.USER_NAME)
        val peopleQuestionsList = Constants.getPeopleQuestions()
        val peopleQuestion = peopleQuestionsList[0]

        //set question number and array
        val questionNumber: Int = 1
        peopleQuestionsList[questionNumber-1]

        //Set UI elements
        tv_question_people.text = peopleQuestion.question
        rb_answer_one_people.text = peopleQuestion.optionOne
        rb_answer_two_people.text = peopleQuestion.optionTwo
        rb_answer_three_people.text = peopleQuestion.optionThree
        rb_answer_four_people.text = peopleQuestion.optionFour
        pb_progressBar_people.progress = questionNumber
        tv_progress_people.text = questionNumber.toString() + "/" + peopleQuestionsList.size.toString()

        var answers: RadioButton
        var correctAnswersPeople: Int = 0

        btn_next.setOnClickListener{
            var id: Int = rg_options_people.checkedRadioButtonId

            if (id != -1) {

                answers = findViewById(id)

                Toast.makeText(this, "Checked answer: ${answers.text}", Toast.LENGTH_SHORT).show()

                if (answers.text == peopleQuestion.optionThree) {
                    correctAnswersPeople++
                }

                val intent = Intent(this, PeopleQuestionTwoActivity::class.java)
                intent.putExtra(Constants.CORRECT_ANSWERS_PEOPLE, correctAnswersPeople)
                startActivity(intent)
                finish()

            } else {

                Toast.makeText(this, "Please select your answer!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}