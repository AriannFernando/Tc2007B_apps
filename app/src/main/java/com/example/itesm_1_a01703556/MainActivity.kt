package com.example.itesm_1_a01703556

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton : Button = findViewById<Button>(R.id.button)
        val myEditText : EditText = findViewById<EditText>(R.id.editTextTextPersonName)
        val myTextView : TextView = findViewById<TextView>(R.id.textView2)

        var myString : String

        myButton.setOnClickListener {
            if (myEditText.text.toString() ==""){
                myString = "Empty"
                myTextView.text = myString
            }
            else{
                myString = myEditText.text.toString()
                myTextView.text = myString
            }

        }

    }
}