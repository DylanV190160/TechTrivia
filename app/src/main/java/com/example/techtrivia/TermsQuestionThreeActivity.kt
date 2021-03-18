package com.example.techtrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_terms_question_three.*
import kotlinx.android.synthetic.main.activity_terms_question_two.*

class TermsQuestionThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_question_three)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringExtra(Constants.USER_NAME)
        val terminologyQuestionsList = Constants.getTerminologyQuestions()
        val termsQuestion = terminologyQuestionsList[2]

        //set question number and array
        val questionNumber: Int = 3
        terminologyQuestionsList[questionNumber-1]

        //Set UI elements
        tv3_question_terms.text = termsQuestion.question
        rb3_answer_one_terms.text = termsQuestion.optionOne
        rb3_answer_two_terms.text = termsQuestion.optionTwo
        rb3_answer_three_terms.text = termsQuestion.optionThree
        rb3_answer_four_terms.text = termsQuestion.optionFour
        pb3_progressBar_terms.progress = questionNumber
        tv3_progress_terms.text = questionNumber.toString() + "/" + terminologyQuestionsList.size.toString()

        var answers: RadioButton
        var correctAnswersTerms: Int = 0

        btn3_next_terms.setOnClickListener{
            var id: Int = rg3_options_terms.checkedRadioButtonId

            if (id != -1) {

                answers = findViewById(id)

                Toast.makeText(this, "Checked answer: ${answers.text}", Toast.LENGTH_SHORT).show()

                if (answers.text == termsQuestion.optionThree) {
                    correctAnswersTerms++
                }

                val intent = Intent(this, ResultsActivity::class.java)
                intent.putExtra(Constants.CORRECT_ANSWERS_TERMS, correctAnswersTerms)
                startActivity(intent)
                finish()

            } else {

                Toast.makeText(this, "Please select your answer!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}