package com.example.techtrivia

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_terms_flag_results.*
import kotlinx.android.synthetic.main.activity_terms_results.*

class TermsResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_results)

        val termsCorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS_TERMS, 0)

        if (termsCorrectAnswers >= 2){
            setContentView(R.layout.activity_terms_flag_results)
            tv_results_flag_terms.text = "$termsCorrectAnswers/3"
        } else {
            setContentView(R.layout.activity_terms_results)
            tv_results_terms.text = "$termsCorrectAnswers/3"
        }

        val sharedPreferences = getSharedPreferences("sharedPref", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        val btn_back = findViewById<Button>(R.id.btn_back)

        btn_back.setOnClickListener{
            val intent = Intent(this, CategoryActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}