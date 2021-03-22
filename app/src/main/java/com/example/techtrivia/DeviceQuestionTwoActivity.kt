package com.example.techtrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_device_question_one.*
import kotlinx.android.synthetic.main.activity_device_question_two.*

class DeviceQuestionTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_device_question_two)

        var deviceCorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS_DEVICE, 0)

        val deviceQuestionsList = Constants.getDeviceQuestions()
        val questionNumber: Int = 2
        val question: Question = deviceQuestionsList[1]

        //Set UI elements
        tv2_question_device.text = question.question
        rb2_answer_one_device.text = question.optionOne
        rb2_answer_two_device.text = question.optionTwo
        rb2_answer_three_device.text = question.optionThree
        rb2_answer_four_device.text = question.optionFour
        pb2_progressBar_device.progress = questionNumber
        tv2_progress_device.text = "2" + "/" + deviceQuestionsList.size

        var answers: RadioButton

        btn2_next_device.setOnClickListener{

            var id: Int = rg2_options_device.checkedRadioButtonId

            if (id!=-1) {

                answers = findViewById(id)

                Toast.makeText(this, "Checked answer: ${answers.text}", Toast.LENGTH_SHORT).show()

                if (answers.text === question.optionOne) {
                    deviceCorrectAnswers++
                }

                intent = Intent(this, DeviceQuestionThreeActivity::class.java)
                intent.putExtra(Constants.CORRECT_ANSWERS_DEVICE, deviceCorrectAnswers)
                startActivity(intent)
                finish()

            } else {

                Toast.makeText(this, "Please select your answer!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}