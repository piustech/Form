package com.example.form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val submitButton = findViewById<Button>(R.id.btnSubmit)

        val myFirstName = findViewById<EditText>(R.id.myFirstName)

        submitButton.setOnClickListener {

            if (myFirstName.text.toString().isEmpty() ){
                Toast.makeText(this, "Please fill yor First Name", Toast.LENGTH_SHORT).show()
            }

        }



    }
}