package com.example.techtrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //Play Button onClickListener - Navigate to NameActivity

        val button = findViewById<Button>(R.id.btn_play)
        button.setOnClickListener{
            val intent = Intent(this, NameActivity::class.java)
            startActivity(intent)
        }

    }
}