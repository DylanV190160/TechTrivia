package com.example.techtrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        //Make FullScreen
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        val btn_confirm = findViewById<Button>(R.id.btn_confirm)
        val et_name = findViewById<TextView>(R.id.et_name)

        //Confirm button click
        btn_confirm.setOnClickListener(){

            //Check if name is empty
            if(et_name.text.toString().isEmpty()){
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, CategoryActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}