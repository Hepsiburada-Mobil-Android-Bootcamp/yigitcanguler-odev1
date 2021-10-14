package com.guleryigitcan.figmahomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonHome=findViewById<Button>(R.id.button)

        buttonHome.setOnClickListener{

            val intent= Intent(this@MainActivity,HomeScreen::class.java)
            startActivity(intent)
        }

        val button_sign=findViewById<Button>(R.id.button_sign)

        button_sign.setOnClickListener{

            val intentSignScreen= Intent(this@MainActivity,SignScreen::class.java)
            startActivity(intentSignScreen)
        }

        val buttonLiveData=findViewById<Button>(R.id.liveDataButton)

        buttonLiveData.setOnClickListener{

            val intentLiveData=Intent(this@MainActivity,LiveData::class.java)
            startActivity(intentLiveData)
        }
    }
}

