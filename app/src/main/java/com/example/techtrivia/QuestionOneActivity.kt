package com.example.techtrivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_question_one.*

class QuestionOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_one)

        title = "Question 1"

        //Get intent extra info
        val userName = intent.getStringExtra(AlarmClock.EXTRA_MESSAGE)



        //Get Questions
        val questionsList = Constants.getQuestions()
        Log.i("QuestionsList: ", "${questionsList.size}")

        //set question number and array
        val questionNumber: Int = 1
        val question: Question = questionsList[questionNumber-1]

        //Set UI elements
        tv_question.text = "Hi ${userName}! " + question.question
//        iv_icon.setImageResource(question.icon)
        rb_answer_one.text = question.optionOne
        rb_answer_two.text = question.optionTwo
        rb_answer_three.text = question.optionThree
        rb_answer_four.text = question.optionFour

        pb_progressBar.progress = questionNumber
        tv_progress.text = questionNumber.toString() + "/" + questionsList.size.toString()

        //set next button on click listener
        var answers: RadioButton
        var wrongAnswers: Int = 0
        btn_next.setOnClickListener{
            var id: Int = rg_options.checkedRadioButtonId
            if(id != -1){
                answers = findViewById(id)

                Toast.makeText(this, "Checked answer: ${answers}", Toast.LENGTH_SHORT).show()

                if(answers.text == question.optionOne){
                    wrongAnswers++
                }
                //TODO: Navigation
            } else {

                Toast.makeText(this, "Please select your answer!", Toast.LENGTH_SHORT).show()

            }
        }

    }
}