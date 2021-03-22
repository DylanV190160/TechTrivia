package com.example.techtrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_device_question_three.*

class DeviceQuestionThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_device_question_three)

        var deviceCorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS_DEVICE, 0)

        val deviceQuestionsList = Constants.getDeviceQuestions()
        val questionNumber: Int = 3
        val question: Question = deviceQuestionsList[2]

        //Set UI elements
        tv3_question_device.text = question.question
        rb3_answer_one_device.text = question.optionOne
        rb3_answer_two_device.text = question.optionTwo
        rb3_answer_three_device.text = question.optionThree
        rb3_answer_four_device.text = question.optionFour
        pb3_progressBar_device.progress = questionNumber
        tv3_progress_device.text = "3" + "/" + deviceQuestionsList.size

        var answers: RadioButton

        btn3_next_device.setOnClickListener{

            var id: Int = rg3_options_device.checkedRadioButtonId
            if (id!=-1) {
                answers = findViewById(id)
                Toast.makeText(this, "Checked answer: ${answers.text}", Toast.LENGTH_SHORT).show()
                if (answers.text === question.optionTwo){
                    deviceCorrectAnswers++
                }
                intent = Intent(this, DeviceResultsActivity::class.java)
                intent.putExtra(Constants.CORRECT_ANSWERS_DEVICE, deviceCorrectAnswers)
                startActivity(intent)
                finish()

            } else {

                Toast.makeText(this, "Please select your answer!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}