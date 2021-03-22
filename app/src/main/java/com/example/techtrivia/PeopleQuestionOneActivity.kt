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

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_people_question_one)

        val peopleQuestionsList = Constants.getPeopleQuestions()
        val questionNumber: Int = 1
        val question: Question = peopleQuestionsList[0]
        //Set UI elements
        tv_question_people.text = question.question
        rb_answer_one_people.text = question.optionOne
        rb_answer_two_people.text = question.optionTwo
        rb_answer_three_people.text = question.optionThree
        rb_answer_four_people.text = question.optionFour
        pb_progressBar_people.progress = questionNumber
        tv_progress_people.text = "1" + "/" + peopleQuestionsList.size

        var answers: RadioButton
        var peopleCorrectAnswers: Int = 0

        btn_next_people.setOnClickListener{

            var id: Int = rg_options_people.checkedRadioButtonId

            if (id!=-1) {
                answers = findViewById(id)

                Toast.makeText(this, "Checked answer: ${answers.text}", Toast.LENGTH_SHORT).show()
                if (answers.text === question.optionThree) {
                    peopleCorrectAnswers++
                }

                intent = Intent(this, PeopleQuestionTwoActivity::class.java)
                intent.putExtra(Constants.CORRECT_ANSWERS_PEOPLE, peopleCorrectAnswers)
                startActivity(intent)
                finish()

            } else {

                Toast.makeText(this, "Please select your answer!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}