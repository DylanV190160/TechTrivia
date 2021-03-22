package com.example.techtrivia

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_category.*

class CategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        //Shared Preferences
        val sharedPreferences = getSharedPreferences("sharedPref", Context.MODE_PRIVATE)
        val userName = sharedPreferences.getString(Constants.USER_NAME, "Not Found")

        //Set TextView to userName
        tv_greeting.text = "Hello " + userName

        val btn_people_category = findViewById<Button>(R.id.btn_people_category)
        val btn_terms_category = findViewById<Button>(R.id.btn_terms_category)
        val btn_device_category = findViewById<Button>(R.id.btn_device_category)
        // PEOPLE
        btn_people_category.setOnClickListener{
            val intent = Intent(this, PeopleQuestionOneActivity::class.java)
            startActivity(intent)
        }

        // TERMS
        btn_terms_category.setOnClickListener{
            val intent = Intent(this, TermsQuestionOneActivity::class.java)
            startActivity(intent)
        }

        // DEVICES
        btn_device_category.setOnClickListener{
            val intent = Intent(this, DeviceQuestionOneActivity::class.java)
            startActivity(intent)
        }
    }
}