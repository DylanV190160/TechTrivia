package com.example.techtrivia

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //Make FullScreen
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        val et_name = findViewById<EditText>(R.id.et_name)
        val btn_confirm = findViewById<Button>(R.id.btn_confirm)

        btn_confirm.setOnClickListener(){
            if(et_name.text.toString().isEmpty()){
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, CategoryActivity::class.java)

                    val sharedPreferences = getSharedPreferences("sharedPref", Context.MODE_PRIVATE)
                    val editor = sharedPreferences.edit()

                    editor.apply{
                        putString(Constants.USER_NAME, et_name.text.toString())
                        apply()
                    }
                    startActivity(intent)
                    finish()
            }
        }
    }
}