package com.example.techtrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_people_question_two.*

class PeopleQuestionTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_people_question_two)

        val peopleQuestionsList = Constants.getPeopleQuestions()
        val questionNumber: Int = 2
        val question: Question = peopleQuestionsList[1]

        //Set UI elements
        tv2_question_people.text = question.question
        rb2_answer_one_people.text = question.optionOne
        rb2_answer_two_people.text = question.optionTwo
        rb2_answer_three_people.text = question.optionThree
        rb2_answer_four_people.text = question.optionFour
        pb2_progressBar_people.progress = questionNumber
        tv2_progress_people.text = "2" + "/" + peopleQuestionsList.size

        var peopleCorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS_PEOPLE,0)
        var answers: RadioButton

        btn2_next_people.setOnClickListener{
            var id: Int = rg2_options_people.checkedRadioButtonId

            if (id!=-1) {
                answers = findViewById(id)

                Toast.makeText(this, "Checked answer: ${answers.text}", Toast.LENGTH_SHORT).show()
                if (answers.text === question.optionOne) {
                    peopleCorrectAnswers++
                }

                intent = Intent(this, PeopleQuestionThreeActivity::class.java)
                intent.putExtra(Constants.CORRECT_ANSWERS_PEOPLE, peopleCorrectAnswers)
                startActivity(intent)
                finish()

            } else {

                Toast.makeText(this, "Please select your answer!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}