package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

        Log.i("MainActivity","Button was clicked")

            Toast.makeText(applicationContext,"Button was clicked.!",Toast.LENGTH_LONG).show()
        }


        buttonMessage.setOnClickListener {

            val message : String= editText.text.toString()

            Toast.makeText(applicationContext,message,Toast.LENGTH_SHORT).show()

            val intent=Intent(this,SecondActivity::class.java)

            intent.putExtra("userMessage",message)
            startActivity(intent)
        }

    }
}
