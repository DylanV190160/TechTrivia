package com.example.techtrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_terms_question_one.*
import kotlinx.android.synthetic.main.activity_terms_question_two.*

class TermsQuestionTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_question_two)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringExtra(Constants.USER_NAME)
        val terminologyQuestionsList = Constants.getTerminologyQuestions()
        val termsQuestion = terminologyQuestionsList[1]

        //set question number and array
        val questionNumber: Int = 2
        terminologyQuestionsList[questionNumber-1]

        //Set UI elements
        tv2_question_terms.text = termsQuestion.question
        rb2_answer_one_terms.text = termsQuestion.optionOne
        rb2_answer_two_terms.text = termsQuestion.optionTwo
        rb2_answer_three_terms.text = termsQuestion.optionThree
        rb2_answer_four_terms.text = termsQuestion.optionFour
        pb2_progressBar_terms.progress = questionNumber
        tv2_progress_terms.text = questionNumber.toString() + "/" + terminologyQuestionsList.size.toString()

        var answers: RadioButton
        var correctAnswersTerms: Int = 0

        btn2_next_terms.setOnClickListener{
            var id: Int = rg2_options_terms.checkedRadioButtonId

            if (id != -1) {

                answers = findViewById(id)

                Toast.makeText(this, "Checked answer: ${answers.text}", Toast.LENGTH_SHORT).show()

                if (answers.text == termsQuestion.optionFour) {
                    correctAnswersTerms++
                }

                val intent = Intent(this, TermsQuestionThreeActivity::class.java)
                intent.putExtra(Constants.CORRECT_ANSWERS_TERMS, correctAnswersTerms)
                startActivity(intent)
                finish()

            } else {

                Toast.makeText(this, "Please select your answer!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}