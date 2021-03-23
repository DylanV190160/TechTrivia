package com.example.techtrivia

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_device_flag_results.*
import kotlinx.android.synthetic.main.activity_device_results.*

class DeviceResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_device_results)

        val deviceCorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS_DEVICE, 0)

        if (deviceCorrectAnswers >= 2){
            setContentView(R.layout.activity_device_flag_results)
            tv_results_flag_device.text = "$deviceCorrectAnswers/3"
        } else {
            setContentView(R.layout.activity_device_results)
            tv_results_device.text = "$deviceCorrectAnswers/3"
        }

        val sharedPreferences = getSharedPreferences("sharedPref", Context.MODE_PRIVATE)

        //Highscores
        var highScoreDevice: Int = sharedPreferences.getInt(Constants.HIGH_SCORE_DEVICE, 0)
        if (deviceCorrectAnswers > highScoreDevice) {

            val editor = sharedPreferences.edit()

            editor.apply {
                putInt(Constants.HIGH_SCORE_DEVICE, deviceCorrectAnswers)
                apply()
            }
        }

        val btn_back = findViewById<Button>(R.id.btn_back)

        btn_back.setOnClickListener{
            val intent = Intent(this, CategoryActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}