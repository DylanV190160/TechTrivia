package com.example.techtrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_device_question_one.*
import kotlinx.android.synthetic.main.activity_people_question_one.*

class DeviceQuestionOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_device_question_one)

        val deviceQuestionsList = Constants.getDeviceQuestions()
        val questionNumber: Int = 1
        val question: Question = deviceQuestionsList[0]
        //Set UI elements
        tv_question_device.text = question.question
        rb_answer_one_device.text = question.optionOne
        rb_answer_two_device.text = question.optionTwo
        rb_answer_three_device.text = question.optionThree
        rb_answer_four_device.text = question.optionFour
        pb_progressBar_device.progress = questionNumber
        tv_progress_device.text = "1" + "/" + deviceQuestionsList.size

        var answers: RadioButton
        var deviceCorrectAnswers: Int = 0

        btn_next_device.setOnClickListener{

            var id: Int = rg_options_device.checkedRadioButtonId

            if (id!=-1) {
                answers = findViewById(id)

                Toast.makeText(this, "Checked answer: ${answers.text}", Toast.LENGTH_SHORT).show()
                if (answers.text === question.optionOne){
                    deviceCorrectAnswers++
                }

                intent = Intent(this, DeviceQuestionTwoActivity::class.java)
                intent.putExtra(Constants.CORRECT_ANSWERS_DEVICE, deviceCorrectAnswers)
                startActivity(intent)
                finish()

            } else {

                Toast.makeText(this, "Please select your answer!", Toast.LENGTH_SHORT).show()
            }
        }

    }
}