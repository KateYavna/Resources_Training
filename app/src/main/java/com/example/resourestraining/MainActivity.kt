package com.example.resourestraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btNewGame.setOnClickListener{
            val intent = Intent(this,New_Game_Activity::class.java)
            startActivity(intent)

        }
        btContinue.setOnClickListener{
            val intent = Intent(this,Continue_Activity::class.java)
            startActivity(intent)

        }
        btOptions.setOnClickListener{
            val intent = Intent(this,Options_Activity::class.java)
            startActivity(intent)

        }
        btAbout.setOnClickListener{
            val intent = Intent(this,About_Activity::class.java)
            startActivity(intent)

        }
    }
}