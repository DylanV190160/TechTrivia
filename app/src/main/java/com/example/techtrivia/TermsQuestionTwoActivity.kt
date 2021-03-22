package com.example.techtrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_terms_question_two.*

class TermsQuestionTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_question_two)

        var termsCorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS_TERMS,0)

        val terminologyQuestionsList = Constants.getTerminologyQuestions()
        val questionNumber: Int = 2
        val question: Question = terminologyQuestionsList[1]

        //Set UI elements
        tv2_question_terms.text = question.question
        rb2_answer_one_terms.text = question.optionOne
        rb2_answer_two_terms.text = question.optionTwo
        rb2_answer_three_terms.text = question.optionThree
        rb2_answer_four_terms.text = question.optionFour
        pb2_progressBar_terms.progress = questionNumber
        tv2_progress_terms.text = "2" + "/" + terminologyQuestionsList.size

        var answers: RadioButton

        btn2_next_terms.setOnClickListener{
            var id: Int = rg2_options_terms.checkedRadioButtonId

            if (id!=-1) {
                answers = findViewById(id)
                Toast.makeText(this, "Checked answer: ${answers.text}", Toast.LENGTH_SHORT).show()
                if (answers.text === question.optionFour) {
                    termsCorrectAnswers++
                }
                val intent = Intent(this, TermsQuestionThreeActivity::class.java)
                intent.putExtra(Constants.CORRECT_ANSWERS_TERMS, termsCorrectAnswers)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Please select your answer!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}