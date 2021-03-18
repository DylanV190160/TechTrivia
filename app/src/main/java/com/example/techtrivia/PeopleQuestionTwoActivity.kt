package com.example.techtrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_people_question_one.*
import kotlinx.android.synthetic.main.activity_people_question_one.btn_next
import kotlinx.android.synthetic.main.activity_people_question_one.rg_options_people
import kotlinx.android.synthetic.main.activity_people_question_one.tv_question_people
import kotlinx.android.synthetic.main.activity_people_question_two.*

class PeopleQuestionTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_people_question_two)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringExtra(Constants.USER_NAME)
        val peopleQuestionsList = Constants.getPeopleQuestions()
        val peopleQuestion = peopleQuestionsList[1]

        val questionNumber: Int = 2
        peopleQuestionsList[questionNumber-1]

        //Set UI elements
        tv2_question_people.text = peopleQuestion.question
        rb2_answer_one_people.text = peopleQuestion.optionOne
        rb2_answer_two_people.text = peopleQuestion.optionTwo
        rb2_answer_three_people.text = peopleQuestion.optionThree
        rb2_answer_four_people.text = peopleQuestion.optionFour
        pb2_progressBar_people.progress = questionNumber
        tv2_progress_people.text = questionNumber.toString() + "/" + peopleQuestionsList.size.toString()

        var answers: RadioButton
        var correctAnswersPeople: Int = 0

        btn2_next.setOnClickListener{
            var id: Int = rg2_options_people.checkedRadioButtonId

            if (id != -1) {

                answers = findViewById(id)

                Toast.makeText(this, "Checked answer: ${answers.text}", Toast.LENGTH_SHORT).show()

                if (answers.text == peopleQuestion.optionOne) {
                    correctAnswersPeople++
                }

                val intent = Intent(this, PeopleQuestionThreeActivity::class.java)
                intent.putExtra(Constants.CORRECT_ANSWERS_PEOPLE, correctAnswersPeople)
                startActivity(intent)
                finish()

            } else {

                Toast.makeText(this, "Please select your answer!", Toast.LENGTH_SHORT).show()
            }
        }

    }
}