package com.example.techtrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_device_question_three.*
import kotlinx.android.synthetic.main.activity_device_question_two.*

class DeviceQuestionThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_device_question_three)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringExtra(Constants.USER_NAME)
        val deviceQuestionsList = Constants.getDeviceQuestions()
        val deviceQuestion = deviceQuestionsList[2]

        //set question number and array
        val questionNumber: Int = 3
        deviceQuestionsList[questionNumber-1]

        //Set UI elements
        tv3_question_device.text = deviceQuestion.question
        rb3_answer_one_device.text = deviceQuestion.optionOne
        rb3_answer_two_device.text = deviceQuestion.optionTwo
        rb3_answer_three_device.text = deviceQuestion.optionThree
        rb3_answer_four_device.text = deviceQuestion.optionFour
        pb3_progressBar_device.progress = questionNumber
        tv3_progress_device.text = questionNumber.toString() + "/" + deviceQuestionsList.size.toString()

        var answers: RadioButton
        var correctAnswersDevice: Int = 0

        btn3_next_device.setOnClickListener{
            var id: Int = rg3_options_device.checkedRadioButtonId

            if (id != -1) {

                answers = findViewById(id)

                Toast.makeText(this, "Checked answer: ${answers.text}", Toast.LENGTH_SHORT).show()

                if (answers.text == deviceQuestion.optionTwo) {
                    correctAnswersDevice++
                }

                val intent = Intent(this, ResultsActivity::class.java)
                intent.putExtra(Constants.CORRECT_ANSWERS_PEOPLE, correctAnswersDevice)
                startActivity(intent)
                finish()

            } else {

                Toast.makeText(this, "Please select your answer!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}